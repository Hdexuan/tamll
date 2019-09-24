package com.awsl.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.awsl.entity.User;
import com.awsl.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/login")
	public String login() {
		return "login";
		
	}
	
	@RequestMapping("/Userlist/{currentPage}")
	public String userlist(@PathVariable String currentPage,Map<String, Object> map) {
		int sp=1;
		int pageSize=5;
		//总记录数
		int totals=userService.getTotals(User.class);
		int pageCounts=totals/pageSize; //总页数
		if(totals%pageSize!=0) {
			pageCounts++;
		}
		try {
			sp=Integer.parseInt(currentPage);//当前页
			
		} catch (Exception e) {
			// TODO: handle exception
			sp=1;
		}
		if(sp>pageCounts) {
			sp=pageCounts;
		}
		if(sp<1) {
			sp=1;
		}
		List<User> list=userService.queryByPage(User.class, sp, pageSize);
		map.put("sp", sp);
		map.put("totals", totals);
		map.put("pageCounts", pageCounts);
		map.put("list", list);
		return "listUser";
	}
	

}
