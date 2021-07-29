package com.tsys;

public class myCalc {
	
	int add1, add2;
	double mul1,mul2;
	int sub1,sub2;
	double div1,div2;

	public static void main(String[] args) {
		// THIS IS BASIC CALCULATION IN A METHOD
		myCalc calc = new myCalc();
		calc.add1 = 150;    calc.add2 = 850;
		calc.mul1 = 50.1d;  calc.mul2 = 1231.23d;
		calc.sub1 = 5000;   calc.sub2 = 4999;
		calc.div1 = 500;    calc.div2 = 5;
		
System.out.println("The addition of add1 and add2 = " + " " + (calc.add1 + calc.add2) );
System.out.println("The multiplication of mul1 and mul2 = " + " " + (calc.mul1 * calc.mul2) );
System.out.println("The Subtraction of sub1 and sub2 = " + " " + (calc.sub1 - calc.sub2 ));
System.out.println("The division of div1 and div2 = " + " " + (calc.div1 / calc.div2 ));
	}

}
