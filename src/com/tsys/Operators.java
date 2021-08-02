package com.tsys;

public class Operators {
	
	int a; int a1;
	int b; int b1;
		
	public static void main(String[] args) {
		
		// Arithmetic operators, Logical operators
		
		Operators op = new Operators();
		
		op.a = 1;
		op.b = 8;
		op.a1 = 50 ; op.b1 = 90;
				
		int c = op.a + op.b;	
		int d = op.b - op.a;
		
		boolean bb = op.a1==op.b1;
		
	System.out.println(c);
	System.out.println(d);
	System.out.println(bb);
		
	}

}
