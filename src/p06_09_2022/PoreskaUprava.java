package p06_09_2022;

import java.util.ArrayList;

public class PoreskaUprava {

	protected String imeGrada;
	protected ArrayList<Objekat> nizObjekata = new ArrayList<Objekat>();

	public PoreskaUprava(String imeGrada) {
		super();
		this.imeGrada = imeGrada;
	}

	public String getImeGrada() {
		return imeGrada;
	}

	public void setImeGrada(String imeGrada) {
		this.imeGrada = imeGrada;
	}

	public ArrayList<Objekat> getNizObjekata() {
		return nizObjekata;
	}

	public void setNizObjekata(ArrayList<Objekat> nizObjekata) {
		this.nizObjekata = nizObjekata;
	}

	public void dodajObjekat(Objekat objekat) {
		this.nizObjekata.add(objekat);
	}
	
	public Objekat najveciPorez() {
		double najveciPorez = nizObjekata.get(0).porez();
		for (int i = 1; i < nizObjekata.size(); i++) {
			if (najveciPorez < nizObjekata.get(i).porez()) {
				najveciPorez = nizObjekata.get(i).porez();
			}
		}
		Objekat objekat = nizObjekata.get(0);
		for (int i = 0; i < nizObjekata.size(); i++) {
			if (najveciPorez == nizObjekata.get(i).porez()) {
				objekat = nizObjekata.get(i);
			}
		}
		return objekat;
	}
	
	public Objekat najmanjiPorez() {
		double najmanjiPorez = nizObjekata.get(0).porez();
		for (int i = 1; i < nizObjekata.size(); i++) {
			if (najmanjiPorez > nizObjekata.get(i).porez()) {
				najmanjiPorez = nizObjekata.get(i).porez();
			}
		}
		Objekat objekat = nizObjekata.get(0);
		for (int i = 0; i < nizObjekata.size(); i++) {
			if (najmanjiPorez == nizObjekata.get(i).porez()) {
				objekat = nizObjekata.get(i);
			}
		}
		return objekat;
	}
	
	public double ukupanPorez() {
		double ukupanPorez = 0;
		for (int i = 0; i < nizObjekata.size(); i++) {
			ukupanPorez = ukupanPorez + nizObjekata.get(i).porez();
		}
		return ukupanPorez;
	}
	
	public void stampaj() {
		for (int i = 0; i < nizObjekata.size(); i++) {
			nizObjekata.get(i).stampaj();
		}
	}
}
