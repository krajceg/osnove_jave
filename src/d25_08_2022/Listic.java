package d25_08_2022;

import java.util.ArrayList;

public class Listic {
	
	private ArrayList<Kombinacija> nizKombinacija = new ArrayList<Kombinacija>();

	public Listic() {
	}
	
	public void dodajKombinaciju (Kombinacija k) {
		this.nizKombinacija.add(k);
	}
	
	public boolean daLiJeKombinacijaDobitna (Kombinacija k) {
		for (int i = 0; i < nizKombinacija.size(); i++) {
			if (this.nizKombinacija.get(i).daLiJeIstaKombinacija(k) == true) {
				return true;
			}
		}
		return false;
	}
	
	public void stampaj () {
		for (int i = 0; i < nizKombinacija.size(); i++) {
			this.nizKombinacija.get(i).stampaj();
			System.out.println();
		}
	}
}
