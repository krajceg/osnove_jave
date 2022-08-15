package p15_08_2022;

import java.util.Scanner;

public class Zadatak03_02 {

	public static void stampaZvezdicu() {

		System.out.print("* ");
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Unesi n: ");
		int n = s.nextInt();
		
		while (n > 0) {
			
			for (int i = 0; i < n; i++) {
				stampaZvezdicu();
			}
			
			System.out.println();
			n = n - 1;
		}
	}
}
