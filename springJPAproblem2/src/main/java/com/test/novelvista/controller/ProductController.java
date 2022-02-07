package com.test.novelvista.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.test.novelvista.entity.Product;
import com.test.novelvista.repo.ProductRepo;

@Controller
public class ProductController {

	@Autowired
	ProductRepo prorepo;

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/add")
	public String insert() {
		return "insert";
	}

	@GetMapping("/delete")
	public String delete() {
		return "delete";
	}

	@GetMapping("/update")
	public String update() {
		return "update";
	}

	@GetMapping("/all")
	public @ResponseBody Iterable<Product> select() {
		return prorepo.findAll();
	}

	@GetMapping("/added")
	public @ResponseBody String inserted(@RequestParam Long id, String name, String brandname , String madein ,float price ) {
		Product pro = new Product();
		pro.setId(id);
		pro.setName(name);
		pro.setBrandname(brandname);
		pro.setPrice(price);
		pro.setMadein(madein);
		prorepo.save(pro);
		return "Successfully Operated..";
	}

	@GetMapping(path = "/deleted")
	public @ResponseBody String deleted(@RequestParam Long id) {
		prorepo.deleteById(id);
		return "Successfully Deleted..";
	}
}