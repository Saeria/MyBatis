package com.test.pojo;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private String sex;
	List<Product> products;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public List<Product> getProducts() {
        return products;
    }
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + "]";
    }

	

}
