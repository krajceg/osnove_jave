package p15_08_2022;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesi vrednost: ");
		double vrednost = s.nextDouble();
		
		System.out.print("Unesi valutu: ");
		String valuta = s.next();
		
		double vrednostNova = konverzija(vrednost, valuta);
		
		System.out.println(vrednostNova + valuta);
		

	}

	public static double konverzija(double vrednost, String valuta) {
		
		if (valuta.equals("rsd")) {
			vrednost = vrednost * 117.5;
			return vrednost;
		}
		else if (valuta.equals("usd")) {
			vrednost = vrednost * 1.1;
			return vrednost;
		}
		else if (valuta.equals("rub")) {
			vrednost = vrednost * 62.98;
			return vrednost;
		}
		else {
			return 0;
		}

	}

}
