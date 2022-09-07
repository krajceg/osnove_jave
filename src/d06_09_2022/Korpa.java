package d06_09_2022;

import java.util.ArrayList;

public class Korpa {
	
	protected ArrayList<Ambalaza> nizAmbalaza = new ArrayList<Ambalaza>();

	public Korpa() {
		super();
	}
	
	public void dodajAmbalazu(Ambalaza ambalaza) {
		this.nizAmbalaza.add(ambalaza);
	}
	
	public void izbaciAmbalazu (String barkod) {
		for (int i = 0; i < nizAmbalaza.size(); i++) {
			if (barkod.equals(nizAmbalaza.get(i).getBarkod())) {
				this.nizAmbalaza.remove(i);
			}
		}
	}
	
	private double cenaSvihAmbalazaSaPopustom(double popust) {
		double cena = 0;
		for (int i = 0; i < nizAmbalaza.size(); i++) {
			cena = cena + nizAmbalaza.get(i).racunaCenu();
		}
		return cena - popust;
	}
	
	public double cenaKorpe(SuperKartica kartica) {
		return cenaSvihAmbalazaSaPopustom(kartica.getPopust());
	}
	
	public void stampaj() {
		for (int i = 0; i < nizAmbalaza.size(); i++) {
			nizAmbalaza.get(i).stampaj();
			System.out.println();
		}
	}
}
