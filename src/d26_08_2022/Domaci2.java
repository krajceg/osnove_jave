package d26_08_2022;

public class Domaci2 {
	
//		(Za vezbanje) 
//		2. Zadatak
//		Kreirati klasu Karton koja ima:
//		tip kartona (crveni, zuti)
//		konstuktore za koje mislite da ce vam trebati
//		gettere i settere za karton
//		
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
//		poziciju koju igra (odbrambeni, napadac, � )
//		niz kartona
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu dodaj karton, gde se dodaje karton u niz
//		metodu koja vraca broj zutih kartona
//		metodu koja vraca broj crvenih kartona
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//
//		U glavnom programu kreirati igraca i dodati mu nekoliko kartona.


	public static void main(String[] args) {
		
		Igrac2 sveta = new Igrac2("Svetolik Kljajic", "123455", 1988, 20, "napad", true);

		Karton zuti = new Karton("zuti");
		Karton crveni = new Karton("crveni");
		
		sveta.dodajKarton(zuti);
		sveta.dodajKarton(zuti);
		sveta.dodajKarton(crveni);
		
		sveta.stampaj();
		
		
	}

}
