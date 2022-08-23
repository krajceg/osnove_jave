package d22_08_2022;

public class Proizvod {
	
	private String sifraProizvoda;
	private String nazivProizvoda;
	private int cenaKg;
	
	public Proizvod(String sifraProizvoda, String nazivProizvoda, int cenaKG) {
		this.sifraProizvoda = sifraProizvoda;
		this.nazivProizvoda = nazivProizvoda;
		this.cenaKg = cenaKG;
	}

	public String getSifraProizvoda() {
		return sifraProizvoda;
	}

	public void setSifraProizvoda(String sifraProizvoda) {
		this.sifraProizvoda = sifraProizvoda;
	}

	public String getNazivProizvoda() {
		return nazivProizvoda;
	}

	public void setNazivProizvoda(String nazivProizvoda) {
		this.nazivProizvoda = nazivProizvoda;
	}

	public void setCenaKG(int cenaKG) {
		this.cenaKg = cenaKG;
	}
	
	public int getCenaKg() {
		return this.cenaKg;
	}
	
	public double getCenaLb() {
		return this.cenaKg/2.2046;
	}
	
	public void stampa() {
		System.out.println("(" + this.sifraProizvoda + ") - (" + this.nazivProizvoda + ")");
	}
	
}
