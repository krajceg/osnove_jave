package d26_08_2022;

public class Igrac extends Osoba {
	
	private int brojDresa;
	private String pozicija;
	private boolean kapiten;
	
	public Igrac(String punoIme, String jmbg, int godRodjenja) {
		super(punoIme, jmbg, godRodjenja);
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
	
	@Override
	public void stampaj() {
		super.stampaj();
		System.out.print("Broj: " + this.brojDresa + ", pozicija: " + this.pozicija);
		if (this.kapiten == true) {
			System.out.println(", Kapiten");
		}
		else {
			System.out.println();
		}
		System.out.println();
	}
}
