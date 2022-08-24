package p23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		ArrayList<Sastojak> niz1 = new ArrayList<Sastojak>();

		Sastojak sastojak1 = new Sastojak();
		Sastojak sastojak2 = new Sastojak();
		Sastojak sastojak3 = new Sastojak();

		int n, m;
		String imeSastojka;
		Sastojak sastojak = new Sastojak();
		
		System.out.print("Unesite broj sastojka: ");
		n = s.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Unesite sastojak: ");
			imeSastojka = s.next();
			System.out.print("Unesite cenu: ");
			m = s.nextInt();	
			sastojak.setNaziv(imeSastojka);
			sastojak.setCena(m);
			niz1.add(sastojak);
		}

	}

}
