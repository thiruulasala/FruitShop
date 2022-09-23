package com.shopping.fruits;

public class Vegitables
{
    String name;
    int cost;
    int quantity;
    public Vegitables(String Name,int Cost,int Quantity)
    {
        name=Name;
        cost=Cost;
        quantity=Quantity;
    }
    public String getName()
    {
        return name;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public int getCost()
    {
        return cost;
    }
}
