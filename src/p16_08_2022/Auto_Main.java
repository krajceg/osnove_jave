package p16_08_2022;

import java.util.Scanner;

public class Auto_Main {

	public static void main(String[] args) {
	
		podaci();
		
	}
	
	public static void podaci() {
		
		Auto a = new Auto();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Uneti ime i prezime: ");
		a.punoIme = s.nextLine();
		
		System.out.print("Uneti marku automobila: ");
		a.marka = s.nextLine();
		
		System.out.print("Uneti broj vrata: ");
		a.brojVrata = s.nextInt();
		
		System.out.print("Uneti potrosnju: ");
		a.potrosnja = s.nextDouble();
		
		System.out.print("Uneti trenutnu brzinu: ");
		a.brzina = s.nextInt();
		
		System.out.print("Uneti ogranicenje: ");
		a.ogranicenje = s.nextInt();
		
		System.out.print("Uneti godinu proizvodnje: ");
		a.godinaProizvodnje = s.nextInt();
		
		System.out.print("Uneti mesec do kad je registrovan auto (broj): ");
		a.mesecRegistracije = s.nextInt();
		
		System.out.print("Uneti trenutni mesec (broj): ");
		a.mesec = s.nextInt();
		
		System.out.print("Uneti kubikazu: ");
		a.kubikaza = s.nextInt();
		
		a.stampa();
	}

}
