package p25_08_2022;

import java.util.ArrayList;

public class Pasta {
	
	private ArrayList<Sastojak> niz1 = new ArrayList<Sastojak>();

	public void dodajSastojak (Sastojak sastojak) {
		this.niz1.add(sastojak);
	}
	public Pasta(ArrayList<Sastojak> niz1) {
		this.niz1 = niz1;
	}
	
	public void cenaPaste() {
		int cenaPaste = 0;
		for (int i = 0; i < this.niz1.size(); i++) {
			cenaPaste = cenaPaste + this.niz1.get(i).getCena();
		}
	}
	
	public void stampaj () {
		System.out.println("Pasta sa sastojcima: ");
		for (int i = 0; i < this.niz1.size(); i++) {
			this.niz1.get(i).stampaj();
		}
	}
	
	public void briseSastojak (String sastojak) {
		for (int i = 0; i < this.niz1.size(); i++) {
			if (sastojak.equals(this.niz1.get(i).getNaziv())) {
				this.niz1.remove(i);
			}
		}
	}
}
