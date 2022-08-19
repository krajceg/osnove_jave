package test_1;

import java.util.Scanner;

public class Zadatak3 {
	
//	Zadatak (While petlja)
//	Napisati program koji pruza mogucnost postavljanja lozinke. Korisnik prvo unosi lozinku a zatim 
//	program od korisnika zahteva unos kojim potvrdjuje lozinku sve dok se ne poklopi sa lozinkom ili 
//	dok mu se ne blokira mogucnost postavljanja lozinke. Korisnik moze maksimalno 3 puta da pogresi 
//	potvrdu lozinke.
//	Ukoliko se lozinke ne poklapaju ispisati gresku “Lozinke se ne poklapaju”
//	Ukoliko korisnik unese pogresno potvrdu lozinke vise od 3 puta, ispisati poruku “Mogucnost postavljanja 
//	lozinke je blokirana”
//	Ukoliko se lozinke poklapaju ispisati “Lozinka je uspesno postavljena” 
//	Primer izvrsenja 1:
//	Unesite lozinku: sifra123
//	Potvrdite lozinku: pogresna
//	Lozinke se ne poklapaju
//	Potvrdite lozinku: pogresna
//	Lozinke se ne poklapaju
//	Potvrdite lozinku: sifra123
//	Lozinka je uspesno postavljena
//
//
//	Primer izvrsenja 2:
//	Unesite lozinku: sifra123
//	Potvrdite lozinku: pogresna
//	Lozinke se ne poklapaju
//	Potvrdite lozinku: pogresna
//	Lozinke se ne poklapaju
//	Potvrdite lozinku: pogresna
//	Lozinke se ne poklapaju
//	Potvrdite lozinku: pogresna
//	Mogucnost postavljanja lozinke je blokirana

	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = 3;
		String password, password2;

		System.out.print("Unesite lozinku: ");
		password = s.next();

		do {
			System.out.print("Potvrdite lozinku: ");
			password2 = s.next();

			if (!password.equals(password2)) {
				n--;
				if (n == 0) {
					System.out.println("Mogucnost postavljanja lozinke je blokirana");
				}
				else {
				System.out.println("Lozinke se ne poklapaju");
				}
			} else {
				System.out.println("Lozinka je uspesno postavljena");
				break;
			}
		} while (n > 0 || password.equals(password2));
	}
}
