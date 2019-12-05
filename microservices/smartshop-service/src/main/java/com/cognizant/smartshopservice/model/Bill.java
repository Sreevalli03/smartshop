package com.cognizant.smartshopservice.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "purchase_history")
public class Bill implements Serializable {

	@Id
	@Column(name = "purchase_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	int purchaseId;

	@Column(name = "purchase_date")
	Date purchaseDate;

	@Column(name = "quantity")
	private int quantity;

	@ManyToOne
	@JoinColumn(name = "user_user_id")
	@JsonIgnore
	private User user;

	@ManyToOne
	@JoinColumn(name = "product_product_code")
	private Product product;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Bill [purchaseId=" + purchaseId + ", purchaseDate=" + purchaseDate + ", quantity=" + quantity
				+ ", user=" + user + ", product=" + product + "]";
	}

}
