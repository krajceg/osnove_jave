package test_1;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
//		Zadatak (Grananja)
//		Napisati program koji simulira notifikaciju za novu verziju aplikacije. Korisnik unosi verziju a
//		plikacije koju ima instaliranu na svom racunaru a zatim najnoviju verziju, nakon cega se ispisuje 
//		notifikacija.
//		Verzija aplikacije se sastoji od major i minor broja. Aplikacije imaju verziju uglavnom u formatu 
//		major.minor i primer bi bio Facebook 2.1 gde je major=2 i minor=1
//		Aplikacija je novije verzije ukoliko je:
//		major broj veci ili
//		ukoliko je major isti, tada nova verzija ima veci minor
//
//		Napomena: Smatrati da korisnik za najnoviju verziju unosi vecu ili istu verziju od instalirane, 
//		nikako manju.
//		
//		Primer izvrsenja 1:
//			Unesite major verziju instalirane aplikacije: 4
//			Unesite minor verziju instalirane aplikacije: 5
//			(Obasnjenje) Na racunaru je instalirana verzija 4.5
//			Unesite major verziju najnovije aplikacije: 4
//			Unesite minor verziju najnovije aplikacije: 7
//			(Obasnjenje) Najnovija verzija je 4.7. 
//			Notifikacija: Nova verzija aplikacije je dostupna za instalaciju.
//
//			Primer izvrsenja 2:
//			Unesite major verziju instalirane aplikacije: 4
//			Unesite minor verziju instalirane aplikacije: 5
//			(Obasnjenje) Na racunaru je instalirana verzija 4.5
//			Unesite major verziju najnovije aplikacije: 4
//			Unesite minor verziju najnovije aplikacije: 5
//			(Obasnjenje) Najnovija verzija je 4.5. 
//			Notifikacija: Vec imate najnoviju verziju na svom racunaru.
//
//			Primer izvrsenja 3:
//			Unesite major verziju instalirane aplikacije: 3
//			Unesite minor verziju instalirane aplikacije: 9
//			(Obasnjenje) Na racunaru je instalirana verzija 3.9
//			Unesite major verziju najnovije aplikacije: 4
//			Unesite minor verziju najnovije aplikacije: 2
//			(Obasnjenje) Najnovija verzija je 4.2
//			Notifikacija: Nova verzija aplikacije je dostupna za instalaciju.
//
//
//
//
//
//			Primer izvrsenja 4:
//			Unesite major verziju instalirane aplikacije: 3
//			Unesite minor verziju instalirane aplikacije: 9
//			(Obasnjenje) Na racunaru je instalirana verzija 3.9
//			Unesite major verziju najnovije aplikacije: 4
//			Unesite minor verziju najnovije aplikacije: 9
//			(Obasnjenje) Najnovija verzija je 4.9
//			Notifikacija: Nova verzija aplikacije je dostupna za instalaciju.

		Scanner s = new Scanner (System.in);
		
		int major, minor, majorNovi, minorNovi;
		
		
		System.out.print("Unesite major verziju instalirane aplikacije: ");
		major = s.nextInt();
		
		System.out.print("Unesite minor verziju instalirane aplikacije: ");
		minor = s.nextInt();
		
		System.out.print("Unesite major verziju najnovije aplikacije: ");
		majorNovi = s.nextInt();
		
		System.out.print("Unesite minor verziju najnovije aplikaje: ");
		minorNovi = s.nextInt();
		
		if (majorNovi > major || minorNovi > minor) {
			System.out.println("Notifikacija: Nova verzija aplikacije je dostupna za instalaciju.");
		}
		else {
			System.out.println("Notifikacija: Vec imate najnoviju verziju na svom racunaru.");
		}
		
		
		
	}

}
