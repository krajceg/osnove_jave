package d26_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Domaci1 {
	
//		Zadatak
//		Kreirati klasu Osoba koja ima:
//		ime i prezime
//		jmbg
//		godinu rodjenja
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere 
//		metodu stampaj koja stampa u formatu:
//		(ime i prezime), (jmbg), (godina rodjenja)
//
//		Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//		Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//		U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//
//
//		(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju programa ispisati sve igrace i trenere. 
//		Podatke za igrace i trenere unosi korisnik sa tastature
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		ArrayList<Igrac> igraci = new ArrayList<Igrac>();
		ArrayList<Trener> treneri = new ArrayList<Trener>();
		
		int n, m, godRodjenja, brojDresa, godIskustva;
		String punoIme, jmbg, pozicija, tipTrenera;
		boolean kapiten;
		
		System.out.print("Unesite broj igraca koje zelite dodati: ");
		n = s.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite ime i prezime: ");
			punoIme = s.next();
			
			System.out.print("Unesite JMBG: ");
			jmbg = s.next();
			
			System.out.print("Unesite godinu rodjenja: ");
			godRodjenja = s.nextInt();
			
			System.out.print("Unesite broj igraca: ");
			brojDresa = s.nextInt();
			
			System.out.print("Unesite poziciju igraca: ");
			pozicija = s.next();
			
			System.out.print("Da li je igrac kapiten: ");			// true/false
			kapiten = s.nextBoolean();
			
			Igrac igrac = new Igrac(punoIme, jmbg, godRodjenja);
			igrac.setBrojDresa(brojDresa);
			igrac.setPozicija(pozicija);
			igrac.setKapiten(kapiten);
			
			igraci.add(igrac);
		}
		
		System.out.println();
		System.out.print("Unesite broj trenera koje zelite dodati: ");
		m = s.nextInt();
		
		for (int i = 0; i < m; i++) {
			System.out.print("Unesite ime i prezime: ");
			punoIme = s.next();
			
			System.out.print("Unesite JMBG: ");
			jmbg = s.next();									
															
			System.out.print("Unesite godinu rodjenja: ");
			godRodjenja = s.nextInt();
			
			System.out.print("Tip trenera: ");
			tipTrenera = s.next();
			
			System.out.print("Godine iskustva: ");
			godIskustva = s.nextInt();
			
			Trener trener = new Trener(punoIme, jmbg, godRodjenja);
			trener.setGodIskustva(godIskustva);
			trener.setTipTrenera(tipTrenera);
			
			treneri.add(trener);
		}
		System.out.println();
		for (int i = 0; i < igraci.size(); i++) {
			igraci.get(i).stampaj();
		}
		
		for (int i = 0; i < treneri.size(); i++) {
			treneri.get(i).stampaj();
		}
	}
	
}
