package p06_09_2022;

public class Sastojak {
	
	protected String nazivDodatka;
	protected double cenaDodatka;
	
	public Sastojak() {
		super();
	}
	public Sastojak(String nazivDodatka, double cenaDodatka) {
		super();
		this.nazivDodatka = nazivDodatka;
		this.cenaDodatka = cenaDodatka;
	}

	public String getNazivDodatka() {
		return nazivDodatka;
	}

	public void setNazivDodatka(String nazivDodatka) {
		this.nazivDodatka = nazivDodatka;
	}

	public double getCenaDodatka() {
		return cenaDodatka;
	}

	public void setCenaDodatka(double cenaDodatka) {
		this.cenaDodatka = cenaDodatka;
	}
	
	public void stampaj() {
		System.out.println("(" + this.nazivDodatka + ") (" + this.cenaDodatka + ")");
	}
}
