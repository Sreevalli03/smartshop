package com.cognizant.smartshopservice.service;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.smartshopservice.SmartshopServiceApplication;
import com.cognizant.smartshopservice.model.Bill;
import com.cognizant.smartshopservice.model.Product;
import com.cognizant.smartshopservice.model.User;
import com.cognizant.smartshopservice.repository.ProductRepository;
import com.cognizant.smartshopservice.repository.UserRepository;

@Service
public class ProductService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	ProductRepository productRepository;

	private static final Logger LOGGER = LoggerFactory.getLogger(SmartshopServiceApplication.class);

	public List<String> getAllProductTypes() {
		return productRepository.getAllProductTypes();
	}

	public List<Product> getProductList(String type) {
		return productRepository.getProductList(type);
	}

	public Product getProduct(String code) {
		return productRepository.getProduct(code);
	}

	@Transactional
	public void modifyProduct(Product product) {
		productRepository.save(product);
	}

	@Transactional
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	@Transactional
	public void deleteProduct(String code) {
		productRepository.deleteById(code);
	}

	@Transactional
	public List<Product> getAllProductsList() {
		return productRepository.getAllProductsList();
	}

	public void updateBill(String contact, String code, int quant) {
		Bill bill = new Bill();
		User user = userRepository.findByContactNumber(contact);
		LOGGER.debug("user", user);
		Product product = productRepository.findById(code).get();
		LOGGER.debug("product", product);
		bill.setUser(user);
		bill.setProduct(product);
		bill.setQuantity(quant);
		bill.setPurchaseDate(new Date(System.currentTimeMillis()));
		Set<Bill> billList = user.getBillList();
		LOGGER.debug("bill", bill);
		billList.add(bill);
		user.setBillList(billList);
		userRepository.save(user);
		int i=Integer.parseInt(product.getStockCount()); 
		String str1 = Integer.toString(i-quant); 
		product.setStockCount(str1);
        productRepository.save(product);


	}

	public Set<Bill> getBill(String name) {
		User user = userRepository.findByUsername(name);
		return user.getBillList();
	}

}
