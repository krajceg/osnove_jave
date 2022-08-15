package d15_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Vezba01 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<String> brojevi = new ArrayList<String>();
		ArrayList<String> znakovi = new ArrayList<String>();

		String broj, znak;
		int n = 0;

		System.out.print("Unesite znak karte na stolu: ");
		znak = s.next();
		System.out.print("Unesite broj karte na stolu: ");
		broj = s.next();

		znakovi.add(n, znak);
		brojevi.add(n, broj);

		while (znak.equals(znakovi.get(n)) || broj.equals(brojevi.get(n))) {

			System.out.print("Unesite znak: ");
			znak = s.next();
			System.out.print("Unesite broj: ");
			broj = s.next();

			if (znak.equals(znakovi.get(n)) || broj.equals(brojevi.get(n))) {
				n++;
				znakovi.add(n, znak);
				brojevi.add(n, broj);
				System.out.println("Poslednja karta na stolu je sada: " + broj + " " + znak);
				System.out.println("Sledeci potez");
			}
		}
		System.out.println("Nevalidan potez. Kraj igre.");
	}
}
