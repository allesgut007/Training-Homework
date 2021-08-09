package com.tsys;

public class Largestof3Numbers {

	static int N1 , N2, N3;

	public static void main(String[] args) {

		N1 = 300;
		N2 = 600;
		N3 = 900;

		if ( N1>N2 && N1>N3)

			System.out.println(N1 + " " + "is the Largest number");

		else if (N2 > N1 && N2 > N3)

			System.out.println(N2 + " " + "is the Largest number");

		else

			System.out.println(N3 + " " + "is the Largest number");


	}


}

