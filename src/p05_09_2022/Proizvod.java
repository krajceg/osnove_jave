package p05_09_2022;

import java.util.ArrayList;

public abstract class Proizvod {
	
	protected ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();
	
	public void ubaciSastojak(Sastojak sastojak) {
		this.sastojci.add(sastojak);
	}
	
	public double cenaSvihDodataka() {
		double zbirDodataka = 0;
		for (int i = 0; i < sastojci.size(); i++) {
			zbirDodataka = zbirDodataka + sastojci.get(i).getCena();
		}
		return zbirDodataka;
	}
	
	public abstract double ukupnuRacunajCenu();
	
	public abstract void stampaj();
}
