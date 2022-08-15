package p15_08_2022;

import java.util.Scanner;

public class Zadatak08 {

	public static void main(String[] args) {

		int a = 3;
		int b = 4;
		int c = 5;
		System.out.println(provera(a, b, c));
	}

	public static boolean provera(int a, int b, int c) {
		
		boolean pravougli;
		if (a * a + b * b == c * c) {
			
			pravougli = true;
		}
		else {
			 pravougli = false;

		}
		return pravougli;
	}

}
