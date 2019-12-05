package com.cognizant.smartshopservice.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.smartshopservice.model.Bill;
import com.cognizant.smartshopservice.model.Product;
import com.cognizant.smartshopservice.service.AppUserDetailsService;
import com.cognizant.smartshopservice.service.ProductService;

@RestController
@RequestMapping("/product-types")
public class ProductController {

	@Autowired
	ProductService productService;

	@Autowired
	AppUserDetailsService appUserDetailsService;

	@GetMapping("")
	public List<String> getAllProductTypes() {
		return productService.getAllProductTypes();
	}

	@GetMapping("{type}")
	public List<Product> getProductList(@PathVariable String type) {
		return productService.getProductList(type);
	}

	@GetMapping("edit/{code}")
	public Product getProduct(@PathVariable String code) {
		return productService.getProduct(code);
	}

	@PutMapping("")
	public void modifyProduct(@RequestBody Product product) {
		productService.modifyProduct(product);
	}

	@PostMapping("/addproducts")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}

	@DeleteMapping("delete/{code}")
	public void deleteProduct(@PathVariable String code) {
		productService.deleteProduct(code);
	}

	@GetMapping("/productsList")
	public List<Product> getAllProductsList() {
		return productService.getAllProductsList();
	}

	@PostMapping("/bill/{contact}/{code}/{quant}")
	public void updateBill(@PathVariable("contact") String contact, @PathVariable("code") String code,
			@PathVariable("quant") int quant) {
		productService.updateBill(contact, code, quant);
	}

	@GetMapping("/bill/{name}")
	public Set<Bill> getBill(@PathVariable("name") String name) {
		return productService.getBill(name);
	}

}
