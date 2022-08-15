package p15_08_2022;

import java.util.Scanner;

public class Zadatak06_2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Unesi N: ");
		int n = s.nextInt();
		zvezdica(n);
	}

	public static void zvezdica(int n) {

		int m = 0;
		
		while (m != n) {
			
			for (int i = 0; i <= m; i++) {
				System.out.print("*");
			}
			
			System.out.println();
			m = m + 1;
		}
	}
}
