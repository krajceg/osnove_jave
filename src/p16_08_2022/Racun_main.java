package p16_08_2022;

import java.util.Scanner;

public class Racun_main {

	public static void main(String[] args) {
		
		Racun a = new Racun();
		Racun b = new Racun();
		
		a.ime = "Svetolik";
		a.prezime = "Kljajic";
		a.racun = "123456";
		a.stanje = 1000;
		a.stampa();
		
		b.ime = "Milan";
		b.prezime = "Jovanovic";
		b.racun = "222222";
		b.stanje = 200;
		b.stampa2();
		Scanner s = new Scanner(System.in);
		
		
		
		System.out.print("Unesite sumu za transakciju: ");
		int transakcija = s.nextInt();
		System.out.println();
		System.out.println("Stanje nakon transakcije");
		a.stanje = a.stanje - transakcija;
		b.stanje = b.stanje + transakcija;
		System.out.println();
		a.stampa();
		b.stampa2();
		
		
		

	}

}
