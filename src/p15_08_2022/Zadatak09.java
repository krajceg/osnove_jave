package p15_08_2022;

import java.util.Scanner;

public class Zadatak09 {

	public static void main(String[] args) {

		String a = "V";
		int brojArapski = konverzija(a);
		System.out.println(brojArapski);
	}

	public static int konverzija(String brojRimski) {
		
		if (brojRimski.equals("V")) {
			return 5;
		}
		else if (brojRimski.equals("IV")) {
			return 4;
		}
		else if (brojRimski.equals("III")) {
			return 3;
		}
		else if (brojRimski.equals("II")) {
			return 2;
		}
		else if (brojRimski.equals("I")) {
			return 1;
		}
		else {
			return 0;
		}

	}

}
