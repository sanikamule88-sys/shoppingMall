package com.Services;

public class ShoppingDetails implements Dmart 
{

	@Override
	public void Electronic() {
		// TODO Auto-generated method stub
		System.out.println("Electroincs items");
		System.out.println("tv , AC , Rrfrigerator,");
	}

	@Override
	public String BeautyProducts() {
		// TODO Auto-generated method stub
		System.out.println("beautyProducts for all beautiful ladies");	
		return "foundation , makeupfixer";
	}

	@Override
	public String Groceries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Clothes() {
		// TODO Auto-generated method stub
		System.out.println( "clothes for your comfort");
		return "jeans , thirt ";
	}

	@Override
	public String dailyneeds() {
		// TODO Auto-generated method stub
		System.out.println("products which need you in day to day lifestyle");
		return "Rice , soap , sugar";
	}
}
