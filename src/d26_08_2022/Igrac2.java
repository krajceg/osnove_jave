package d26_08_2022;

import java.util.ArrayList;

public class Igrac2 extends Osoba2 {
	
	private int brojDresa;
	private String pozicija;
	private boolean kapiten;
	private ArrayList<Karton> kartoni = new ArrayList<Karton>();
	
	public Igrac2() {
		super();
	}

	public Igrac2(String punoIme, String jmbg, int godRodjenja, int brojDresa, String pozicija, boolean kapiten) {
		super(punoIme, jmbg, godRodjenja);
		this.brojDresa = brojDresa;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}

	public int getBrojDresa() {
		return brojDresa;
	}

	public void setBrojDresa(int brojDresa) {
		this.brojDresa = brojDresa;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}
	
	public void dodajKarton (Karton k) {
		this.kartoni.add(k);
	}
	
	public int brojZutih() {
		int zutiKartoni = 0;
		for (int i = 0; i < kartoni.size(); i++) {
			if (this.kartoni.get(i).getTipKartona().equals("zuti")) {
				zutiKartoni++;
			}
		}
		return zutiKartoni;
	}
	
	public int brojCrvenih() {
		return (this.kartoni.size() - this.brojZutih());
	}
	
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.print("Broj: " + this.brojDresa + "; Pozicija: " + this.pozicija);
		if (this.kapiten == true) {
			System.out.println("; Kapiten");
		}
		else {
			System.out.println();
		}
		System.out.println("Kartoni: Zuti: " + this.brojZutih() + " | Crveni: " + this.brojCrvenih());
		System.out.println();
	}
}
