package p15_08_2022;

import java.util.Scanner;

public class Zadatak06 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n, m;

		System.out.print("Unesi N: ");
		n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			zvezdica(i);
		}

	}

	public static void zvezdica(int brojZvezdica) {
		for (int i = 0; i < brojZvezdica; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
