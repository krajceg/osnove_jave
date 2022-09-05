package p05_09_2022;

public class Sastojak {
	
	private String naziv;
	private int cena;
	
	public Sastojak(String naziv, int cena) {
		super();
		this.naziv = naziv;
		this.cena = cena;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}
	
	public void stampaj() {
		System.out.println("(" + this.naziv + ") (" + this.cena + ")");
	}

}
