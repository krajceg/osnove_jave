package p16_08_2022;

import java.util.Scanner;

public class Auto_Main {

	public static void main(String[] args) {
	
		podaci();
		
	}
	
	public static void podaci() {
		
		Auto a = new Auto();
		
		a.punoIme = "Svetolik Kljajic";
		a.marka = "BMW";
		a.brojVrata = 5;
		a.potrosnja = 10;
		a.brzina = 100;
		
		a.godinaProizvodnje = 1935;
		a.mesecRegistracije = 3;
		a.kubikaza = 2200;
		
		a.brojRegistracije = "KS12345";
		a.klima = true;
		
		a.maxBrzina = 240;
		a.kapacitetRezervoar = 50;
		a.trenutnoURezervoaru = 20;
		
		a.stampa();
		
		if (a.prekoracenje(120) == true) {
			System.out.println("Prekoracili ste brzinu");
			System.out.println("Kazna je: " + a.kaznaMetoda(120) + " dinara");
		}
		System.out.println();
		if (a.godinaProizvodnje < 1950) {
			System.out.println("Auto je oldtimer");
		}
		else {
			System.out.println("Auto nije oldtimer");
		}
		System.out.println();
		if (a.registracijaMetoda(8) == true) {
			System.out.println("Auto je registovan");
		}
		else if (a.registracijaMetoda(8) == false) {
			System.out.println("Registracije je istekla");
		}
		System.out.println("Cena registracije je: " + a.cenaRegistracijeMetoda());
		
		a.dodajGas();
		System.out.println("Nova brzina je " + a.brzina);
		
		a.smanjiGas();
		System.out.println("Nova brzina je " + a.brzina);
		
		double trenutnaPotrosnja = a.potrosnjaMetoda();
		System.out.println("Trenutna potrosnja je " + trenutnaPotrosnja);
		
		a.stampajTablu();
		
	}

}
