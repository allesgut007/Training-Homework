package com.tsys;

public class Animal {
	
	String Colour;
	int size;
	
	// start of constructor
	public Animal()
	{
		
	this.Colour = "Red";
	this.size = 99;
	
	}
	
	// paramter constructor
	
public Animal(String clr , int siz)
	
	{
		
	this.Colour = clr;
	this.size = siz;
	
	}

public Animal(int siz, String clr )

{
	
this.Colour = clr;
this.size = siz;

}
	public void sleep() {
		System.out.println("Lets sleep");
		
	}
	
	public int eat(String item) {
		
		System.out.println("Lets eat");
		System.out.println("Lets eat : " + item);
		hunt();
		return 58;
	}
	
	public String hunt() {
		System.out.println("Lets hunt");
		
		return "Hunted";
	}
	
	 public Animal(int abc) {
			System.out.println("Hey I am in a Animal Constructor, default is gone!!");
		}

}
