package com.springcore4;

public class Samosa 
{
	 private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Samosa(double price) {
		this.price = price;
	}

	public Samosa() {}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	 public void init() 
	 {
		 System.out.println("inslied init method");
	 }
	 public void destory()
	 {
		System.out.println("inslied destory method"); 
	 }
	 
}
