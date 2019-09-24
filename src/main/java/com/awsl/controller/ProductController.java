package com.awsl.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.awsl.entity.Category;
import com.awsl.entity.Product;
import com.awsl.service.ProductService;

@Controller
public class ProductController {
	
	@Resource
	private ProductService productService;
	
	@RequestMapping()
	public String listPage(@PathVariable String currentPage,Map<String, Object> map) {
		int sp=1;
		int pageSize=5;
		//获取总记录数s
		int totals = productService.getTotals(Category.class);
		
		int pageCounts=totals/pageSize; 
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
		List<Product> list=productService.queryByPage(Product.class, sp, pageSize);
		map.put("sp", sp);
		map.put("totals", totals);
		map.put("pageCounts", pageCounts);
		map.put("list", list);
		return "";
	}
	
	@RequestMapping("/Productlist/{cid}")
	public String queryProductCid(@PathVariable  String cid) {
		productService.queryCid(Integer.parseInt(cid));
		
		return "listProduct";
	}
	

}
