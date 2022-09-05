package p05_09_2022;

public class Pica extends Proizvod {
	
	protected double cena;

	public Pica(double cena) {
		super();
		this.cena = cena;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	@Override
	public double ukupnuRacunajCenu() {
		return cenaSvihDodataka() + this.cena;
	}

	@Override
	public void stampaj() {
		System.out.println("Cena: " + this.cena);
		System.out.println("Sastojci:");
		for (int i = 0; i < sastojci.size(); i++) {
			sastojci.get(i).stampaj();
		}
		System.out.println("Ukupna cena: " + ukupnuRacunajCenu());
	}
	
	

}
