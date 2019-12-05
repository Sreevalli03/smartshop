package com.cognizant.smartshopservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.smartshopservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

	@Query("Select distinct p.productType from Product p")
	List<String> getAllProductTypes();

	@Query("From Product p where p.productType=?1")
	List<Product> getProductList(String type);

	@Query("From Product p where p.productCode=?1")
	Product getProduct(String code);

	@Query("From Product p")
	List<Product> getAllProductsList();
}
