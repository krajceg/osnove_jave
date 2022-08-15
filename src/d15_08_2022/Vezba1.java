package d15_08_2022;

import java.util.Scanner;

public class Vezba1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String broj, znak, brojNaStolu, znakNaStolu;

		System.out.print("Unesite znak karte na stolu: ");
		znak = s.next();
		System.out.print("Unesite broj karte na stolu: ");
		broj = s.next();

		brojNaStolu = broj;
		znakNaStolu = znak;

		while (znak.equals(znakNaStolu) || broj.equals(brojNaStolu)) {
			System.out.println("Poslednja karta na stolu je sada: " + brojNaStolu + " " + znakNaStolu);
			System.out.println("Sledeci potez");
			System.out.print("Unesite znak: ");
			znak = s.next();
			System.out.print("Unesite broj: ");
			broj = s.next();

			if (znak.equals(znakNaStolu) || broj.equals(brojNaStolu)) {
				brojNaStolu = broj;
				znakNaStolu = znak;
				System.out.println("Potez je validan");
			}
		}
		System.out.println("Nevalidan potez. Kraj igre.");
	}
}
