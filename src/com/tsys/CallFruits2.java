package com.tsys;

public class CallFruits2 
{

	// Declare variable

		String FruitName1;
		String FruitSize1;
		int    Quantity1;
		
	//create param constructor refer line 14

	public CallFruits2 (String FruitName1, String FruitSize1, int Qty1) {
		
		// initialize objects using below
		
		this.FruitName1 = FruitName1;
		this.FruitSize1 = FruitSize1;
		this.Quantity1 = Qty1;
		
			}

	// create mainmethod

	public static void main(String[] args) {

		//call constructor ( also create obj )
		
		// initialize varibale 2 way - calling from same class
		
		CallFruits2 cF = new CallFruits2("Orange", "Smalle", 45);
				
		
		System.out.println(cF.FruitName1);
		System.out.println(cF.FruitSize1);
		System.out.println(cF.Quantity1);
		
		// w/o constructor and calling from another class
		
		Fruits fT = new Fruits();
		
		// initialize varibale 1 way - calling from another class
		
		fT.FruitName = "banana";
		fT.FruitSize = "Small";
		fT.Quantity = 312;
		
		System.out.println(fT.FruitName);
		System.out.println(fT.FruitSize);
		System.out.println(fT.Quantity);
		
	}



}




