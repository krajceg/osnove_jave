package p22_08_2022;

public class Proizvod {
	
	private String nazivProizvoda;
	private Kupac kupac;
	private int cenaIzrade;
	
	public Proizvod(String nazivProizvoda, Kupac kupac, int cenaIzrade) {
		this.nazivProizvoda = nazivProizvoda;
		this.kupac = kupac;
		this.cenaIzrade = cenaIzrade;
	}

	public String getNazivProizvoda() {
		return nazivProizvoda;
	}

	public void setNazivProizvoda(String nazivProizvoda) {
		this.nazivProizvoda = nazivProizvoda;
	}

	public Kupac getKupac() {
		return kupac;
	}

	public void setKupac(Kupac kupac) {
		this.kupac = kupac;
	}

	public int getCenaProizvoda() {
		return cenaIzrade;
	}

	public void setCenaProizvoda(int cenaProizvoda) {
		this.cenaIzrade = cenaProizvoda;
	}
	
	public double racunajCenu () {
		return (this.cenaIzrade * 1.9 * (100 - this.kupac.getClanskaKarta().getPopust())/100);
	}
	
	public void stampaj () {
		System.out.println(this.nazivProizvoda + " - " + racunajCenu());
		this.kupac.stampaj();
	}
}
