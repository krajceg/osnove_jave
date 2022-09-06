package p06_09_2022;

import java.util.ArrayList;

public class Disciplina {
	
	private String imeDiscipline;
	private String tipDiscipline;	// trkacka/skakacka
	private ArrayList<Atleticar> atleticari = new ArrayList<Atleticar>();

	public Disciplina(String imeDiscipline, String tipDiscipline) {
		super();
		this.imeDiscipline = imeDiscipline;
		this.tipDiscipline = tipDiscipline;
	}

	public String getImeDiscipline() {
		return imeDiscipline;
	}

	public void setImeDiscipline(String imeDiscipline) {
		this.imeDiscipline = imeDiscipline;
	}

	public String getTipDiscipline() {
		return tipDiscipline;
	}

	public void setTipDiscipline(String tipDiscipline) {
		this.tipDiscipline = tipDiscipline;
	}
	
	public void dodajAtleticara(Atleticar atleticar) {
		this.atleticari.add(atleticar);
	}
	
	public void diskvalifikujAtleticara (String punoIme) {
		for (int i = 0; i < atleticari.size(); i++) {
			if (punoIme.equals(atleticari.get(i).getPunoIme())) {
				atleticari.remove(i);
			}
		}
	}
	
	private Atleticar saNajboljimRezultatom() {
		Atleticar saNajboljimRezultatom = atleticari.get(0);
		for (int i = 1; i < atleticari.size(); i++) {
			if (saNajboljimRezultatom.daLiJeRezultatBolji(atleticari.get(i)) == false) {
				saNajboljimRezultatom = atleticari.get(i);
			}
		}
		return saNajboljimRezultatom;
	}
	
	public void podaciPobednika() {
		System.out.println("Disciplina: " + this.imeDiscipline);
		System.out.println("Tip discipline: " + this.tipDiscipline);
		System.out.print("Pobednik ime: ");
		saNajboljimRezultatom().stampaj();
	}
	
}
