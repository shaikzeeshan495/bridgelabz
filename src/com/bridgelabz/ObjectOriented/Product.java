package com.bridgelabz.ObjectOriented;

public class Product {
	String type;	
	String name;
	int price;
	int weight;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getWeight() {
		return weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return type+" [Type=" + name + ", price=" + price + ", weight=" + weight + "]";
	}
	

}
