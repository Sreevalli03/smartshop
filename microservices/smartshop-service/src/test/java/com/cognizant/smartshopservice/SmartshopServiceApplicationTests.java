package com.cognizant.smartshopservice;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import com.cognizant.smartshopservice.controller.ProductController;
import com.cognizant.smartshopservice.model.Product;
import com.cognizant.smartshopservice.repository.ProductRepository;
import com.cognizant.smartshopservice.service.ProductService;

@FixMethodOrder
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SmartshopServiceApplicationTests {

	@Autowired
	private MockMvc mvc;
	@Autowired
	ProductRepository productRepository;

	@Autowired
	ProductService productService;

	@Autowired
	ProductController productController;


	@Test
	public void testDeleteProduct() {
		productService.deleteProduct("15");
		Product product = productService.getProduct("15");
		assertNotNull(product);
	}

	@Test
	public void testProductList() {
		List<Product> products = productRepository.getProductList("Clothing");
		assertEquals(products.isEmpty(), false);
	}
	@Test
	public void testGetAllProductsList() throws Exception {
		ResultActions actions = mvc.perform(get("/product-types/productsList"));
		actions.andExpect(status().isOk());
	}
}
