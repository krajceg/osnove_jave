package d25_08_2022;

import java.util.ArrayList;

public class Kombinacija {

	private String idKombinacije;
	private ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

	public Kombinacija(String idKombinacije, int br1, int br2, int br3, int br4, int br5, int br6, int br7) {
		this.idKombinacije = idKombinacije;
		this.nizBrojeva.add(br1);
		this.nizBrojeva.add(br2);
		this.nizBrojeva.add(br3);
		this.nizBrojeva.add(br4);
		this.nizBrojeva.add(br5);
		this.nizBrojeva.add(br6);
		this.nizBrojeva.add(br7);
	}

	public boolean daLiJeIstaKombinacija(Kombinacija k) {
		for (int i = 0; i < nizBrojeva.size(); i++) {
			if (this.nizBrojeva.get(i) != k.nizBrojeva.get(i)) {
				return false;
			}
		}
		return true;
	}
	
	public void stampaj () {
		System.out.println("ID: " + this.idKombinacije);
		System.out.print("Brojevi: ");
		for (int i = 0; i < nizBrojeva.size(); i++) {
			System.out.print(this.nizBrojeva.get(i) + ", ");
		}
		System.out.println();
	}

}
