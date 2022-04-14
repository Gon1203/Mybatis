package com.myapp.mybatis.model;

public class Product {

	private Long prodId;
	private String prodName;
	private int prodPrice;

	public Product(Long prodId, String prodName, int prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}

	// ID 자동생성
	public Product(String prodName, int prodPrice) {
		super();
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}

	public Long getProdId() {
		return prodId;
	}

	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}

}
