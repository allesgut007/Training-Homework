package com.tsys;

public class LearnConstructor {
	
	String xyz ;
	
	public LearnConstructor(String input) {
		   
	    		
		}   
   

	public static void main(String[] args) {	
		
		LearnConstructor secondConstructor = new LearnConstructor("Bindhu");
		
		
		System.out.println(secondConstructor.xyz);
		System.out.println(secondConstructor.xyz);
		
		Animal myAnimal = new Animal();
		System.out.println(myAnimal.Colour);
		System.out.println(myAnimal.size);
		
		Animal myAnimal2 = new Animal("Blue", 90);
		System.out.println(myAnimal2.Colour);
		System.out.println(myAnimal2.size);
		
		Animal myAnimal3 = new Animal(45,"Orange");
		System.out.println(myAnimal3.Colour);
		System.out.println(myAnimal3.size);
		
		Animal myAnimal4 = new Animal();
		System.out.println(myAnimal4.Colour);
		System.out.println(myAnimal4.size);
		}
	
	

}
