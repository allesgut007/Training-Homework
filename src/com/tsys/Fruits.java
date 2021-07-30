package com.tsys;

public class Fruits {

	String FruitName;
	String FruitSize;
	int    Quantity;
	
	public static void main(String[] args) {
		
		Fruits myFruit = new Fruits();
		
		myFruit.FruitName = "Apple";
		myFruit.FruitSize = "Smaller";
		myFruit.Quantity = 999;
		
		System.out.println("I like" + "  " + myFruit.FruitName);
		System.out.println("Apple is" + " " + myFruit.FruitSize);
		System.out.println("I want" + " " + myFruit.Quantity + " " + "Apples");
		
		Fruits tastyfruit = new Fruits();
		
		tastyfruit.FruitName = "Orange";
		tastyfruit.FruitSize = "Big";
		tastyfruit.Quantity = 768;
		
		System.out.println("I like" + "  " + tastyfruit.FruitName);
		System.out.println("Apple is" + " " + tastyfruit.FruitSize);
		System.out.println("I want" + " " + tastyfruit.Quantity + " " + "Apples");
	}

}
