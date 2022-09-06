package p06_09_2022;

import java.util.ArrayList;

public class Kasa {

//	(DOPUNA ZA VEZBANJE)
//	Dopuna na 2.zad
//	Kreirati klasu Kasa koja ima:
//	niz svih dostupnih dodataka sa cenama.
//	niz proizvoda
//	metodu dodaj proizvod
//	Difoltni konstuktor u kom se u niz dodaju 10 razlicitih sastojaka u niz
//	Npr: luk, piletina, junetina, prsuta, jaja, cokolada, …
//	metodu koja trazi dodatak iz niza prema prosledjenom nazivu sastojka. Metoda vraca dodatak (objekat tipa Dodatak)
//	metodu sracunajCenuPorudzbine, koja racuna i vraca sumu svih proizvoda
//	metodu setampajRacun, metoda stampa sve proizvode i ukupan racun
//	U mainu kreirati jednu kasu i u nju dodajte 3-4 proizvoda sa nekoliko dodatak i stampajte racun.U mainu ne kreirate dodatke!!!! 
//	Koristite samo one koje vec ima kasa.

	protected ArrayList<Sastojak> dostupniSastojci = new ArrayList<Sastojak>();
	protected ArrayList<Proizvod> nizProizvoda = new ArrayList<Proizvod>();

	public Kasa() {
		super();
		dostupniSastojci.add(new Sastojak("luk", 20));
		dostupniSastojci.add(new Sastojak("pecurke", 25));
		dostupniSastojci.add(new Sastojak("masline", 40));
		dostupniSastojci.add(new Sastojak("kackavalj", 40));
		dostupniSastojci.add(new Sastojak("prsuta", 100));
		dostupniSastojci.add(new Sastojak("sunka", 80));
		dostupniSastojci.add(new Sastojak("jaja", 20));
		dostupniSastojci.add(new Sastojak("vanila", 80));
		dostupniSastojci.add(new Sastojak("cokolada", 100));
		dostupniSastojci.add(new Sastojak("secer", 10));
	}

	public void dodajProizvod(Proizvod proizvod) {
		nizProizvoda.add(proizvod);
	}

	public Sastojak trazeniSastojak(String ime) {
		for (int i = 0; i < dostupniSastojci.size(); i++) {
			if (ime.equals(dostupniSastojci.get(i).getNazivDodatka())) {
				return dostupniSastojci.get(i);
			}
		}
		return null;
	}
	
	public double sracunajCenuPorudzbine() {
		double cenaPorudzbine = 0;
		for (int i = 0; i < nizProizvoda.size(); i++) {
			cenaPorudzbine = cenaPorudzbine + nizProizvoda.get(i).ukupnuRacunajCenu();
		}
		return cenaPorudzbine;
	}
	
	public void stampajRacun() {
		System.out.println("Racun: " + sracunajCenuPorudzbine());
		for (int i = 0; i < nizProizvoda.size(); i++) {
			nizProizvoda.get(i).stampaj();
		}
	}

}
