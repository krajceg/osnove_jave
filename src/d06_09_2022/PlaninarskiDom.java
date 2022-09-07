package d06_09_2022;

import java.util.ArrayList;

public class PlaninarskiDom {

	private String nazivDoma;
	private int godinaOsnivanja;
	private ArrayList<Planinar> nizPlaninara = new ArrayList<Planinar>();

	public PlaninarskiDom() {
		super();
	}

	public PlaninarskiDom(String nazivDoma, int godinaOsnivanja) {
		super();
		this.nazivDoma = nazivDoma;
		this.godinaOsnivanja = godinaOsnivanja;
	}

	public String getNazivDoma() {
		return nazivDoma;
	}

	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}

	public void uclaniPlaninara(Planinar planinar) {
		this.nizPlaninara.add(planinar);
	}

	public int brojUspenihPlaninara(Planina planina) {
		int broj = 0;
		for (int i = 0; i < nizPlaninara.size(); i++) {
			if (nizPlaninara.get(i).uspesanUspon(planina) == true) {
				broj++;
			}
		}
		return broj;
	}

	public void izbaciPlaninara(int id) {
		for (int i = 0; i < nizPlaninara.size(); i++) {
			if (id == (nizPlaninara.get(i).getJcib())) {
				nizPlaninara.remove(i);
			}
		}
	}
	
	public void stampaj() {
		System.out.println("Naziv doma: " + this.nazivDoma);
		System.out.println("Godina osnivanja: " + this.godinaOsnivanja);
		System.out.println();
		for (int i = 0; i < nizPlaninara.size(); i++) {
			nizPlaninara.get(i).stampaj();
		}
	}

}
