package test_1;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
//		Zadatak (Metode)
//		Napisati metodu koja vrsi konverziju metara u centimetre, decimetre i kilometre. Metoda kao 
//		parametre prima vrednost u metrima i jedinicu u kojoj treba izvrsiti konverziju a vraca 
//		konvertovanu vrednost.
//
//		Podsetnik za konverziju jedinica:
//		1m = 100 cm
//		1m = 10 dm
//		1m = 0.001 km
//
//		Primer poziva metode
//		Ako se u metodu prosledi vrednost 15 i jedinica cm, metoda vraca 1500.
//		Ako se u metodu prosledi vrednost 1500 i jedinica km, metoda vraca 1.5
//
//		U glavnom programu pozvati metodu za konverziju cm, dm i km i ispisati odgovarajuce poruke na ekranu.
//
//		Primer izvrsenja programa:
//		3.5m je 350cm
//		3.5m je 35dm
//		3.5m je 0.0035km

		
		double m = 3.5;
		String jedinica = "km";
		
		double n = konverzija(m, jedinica);
		
		System.out.println(m + "m je " + n + jedinica);

	}

	public static double konverzija(double velicina, String jedinica) {

		if (jedinica.equals("cm")) {
			velicina = velicina * 100;
			return velicina;
		}
		if (jedinica.equals("dm")) {
			velicina = velicina * 10;
			return velicina;
		}
		if (jedinica.equals("km")) {
			velicina = velicina * 0.001;
			return velicina;
		}
		else {
			return 0;
		}
	}
}
