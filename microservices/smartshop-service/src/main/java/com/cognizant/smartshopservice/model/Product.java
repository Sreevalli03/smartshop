package com.cognizant.smartshopservice.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "product")
public class Product {

	@OneToMany(mappedBy = "product", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Bill> billList;

	public Set<Bill> getBillList() {
		return billList;
	}

	public void setBillList(Set<Bill> billList) {
		this.billList = billList;
	}

	@Id
	@Column(name = "product_code")
	private String productCode;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_type")
	private String productType;

	@Column(name = "brand")
	private String brand;

	@Column(name = "rate_per_quantity")
	private String ratePerQuantity;

	@Column(name = "stock_count")
	private String stockCount;

	@Column(name = "add_date")
	private Date date;

	@Column(name = "aisle")
	private String aisle;

	@Column(name = "shelf")
	private String shelf;

	@Column(name = "date_of_manufacture")
	private Date dateOfManufacture;

	@Column(name = "date_of_expiry")
	private Date dateOfExpiry;

	@Column(name = "product_image")
	private String productImage;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getRatePerQuantity() {
		return ratePerQuantity;
	}

	public void setRatePerQuantity(String ratePerQuantity) {
		this.ratePerQuantity = ratePerQuantity;
	}

	public String getStockCount() {
		return stockCount;
	}

	public void setStockCount(String stockCount) {
		this.stockCount = stockCount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAisle() {
		return aisle;
	}

	public void setAisle(String aisle) {
		this.aisle = aisle;
	}

	public String getShelf() {
		return shelf;
	}

	public void setShelf(String shelf) {
		this.shelf = shelf;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Date getDateOfManufacture() {
		return dateOfManufacture;
	}

	public void setDateOfManufacture(Date dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}

	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	@Override
	public String toString() {
		return "Product [billList=" + billList + ", productCode=" + productCode + ", productName=" + productName
				+ ", productType=" + productType + ", brand=" + brand + ", ratePerQuantity=" + ratePerQuantity
				+ ", stockCount=" + stockCount + ", date=" + date + ", aisle=" + aisle + ", shelf=" + shelf
				+ ", dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", productImage="
				+ productImage + "]";
	}

}
