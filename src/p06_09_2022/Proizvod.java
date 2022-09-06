package p06_09_2022;

import java.util.ArrayList;

public abstract class Proizvod {
	
	protected ArrayList<Sastojak> nizSastojka = new ArrayList<Sastojak>();

	public Proizvod() {
		super();
	}
	
	public void dodajSastojak(Sastojak sastojak) {
		nizSastojka.add(sastojak);
	}
	
	public double cenaSvihDodataka() {
		double cenaSvihDodataka = 0;
		for (int i = 0; i < nizSastojka.size(); i++) {
			cenaSvihDodataka = cenaSvihDodataka + nizSastojka.get(i).getCenaDodatka();
		}
		return cenaSvihDodataka;
	}
	
	public abstract double ukupnuRacunajCenu();
	
	public abstract void stampaj();
}
