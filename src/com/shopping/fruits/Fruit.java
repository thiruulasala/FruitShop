package com.shopping.fruits;

public class Fruit 
{
	String name;
	int cost;
	int quantity;
	double discount;
	public Fruit (double d)
	{
	 discount=d;
	}

	 public Fruit(String a,int b,int c)
	{
		name=a;
		cost=b;
		quantity=c;
	}
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getDiscount()
	{
		return discount;
	}
}
