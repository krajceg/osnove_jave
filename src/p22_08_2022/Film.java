package p22_08_2022;

public class Film {
	
	private String naziv;
	private int godina;
	private Reziser reziser;
	
	
	public void film (String naziv, int godina, Reziser reziser) {
		this.naziv = naziv;
		this.godina = godina;
		this.reziser = reziser;
	}
	
	public Reziser getReziser() {
		return reziser;
	}

	public void setReziser(Reziser reziser) {
		this.reziser = reziser;
	}

	public String getNaziv () {
		return this.naziv;
	}
	
	public String getGodina () {
		return this.naziv;
	}
	
	public void setNaziv (String naziv) {
		this.naziv = naziv;
	}
	
	public void setGodina (int godina) {
		this.godina = godina;
	}
	
	public void print () {
		System.out.println(this.naziv + ", " + this.godina);
		System.out.print("Rezirao je: ");
		this.reziser.printReziser();
	}
	
	
	
}
