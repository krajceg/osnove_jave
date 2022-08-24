package p23_08_2022;

public class Ugovor {
	
	private String datum;
	private FizickoLice prodavac;
	private FizickoLice kupac;
	private int cena;
	private String adresa;
	
	public Ugovor(String datum, FizickoLice prodavac, FizickoLice kupac, int cena, String adresa) {
		this.datum = datum;
		this.prodavac = prodavac;
		this.kupac = kupac;
		this.cena = cena;
		this.adresa = adresa;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public FizickoLice getProdavac() {
		return prodavac;
	}

	public void setProdavac(FizickoLice prodavac) {
		this.prodavac = prodavac;
	}

	public FizickoLice getKupac() {
		return kupac;
	}

	public void setKupac(FizickoLice kupac) {
		this.kupac = kupac;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	public double procenatZarade () {
		if (this.prodavac.isKupovala() == true) {
			return 0.02;
		}
		else {
			return 0.03;
		}
	}
	
	public double zarada () {
		return (1000 + (this.cena * procenatZarade()));
	}
	
	public void stampaj () {
		System.out.print("Dana " + this.datum + "god sklopljen je ugovor izmedju ");
		this.prodavac.stampaj();
		System.out.print(" i ");
		this.kupac.stampaj();
		System.out.println(" o kupovini nekretnine " + this.adresa + " po ceni od " + this.cena 
		+ " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " + zarada());
		
		
	}
}
