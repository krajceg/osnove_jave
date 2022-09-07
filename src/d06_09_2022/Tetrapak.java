package d06_09_2022;

public class Tetrapak extends Ambalaza {
	
	protected boolean mozeReciklaza;
	protected double osnovnaCena;
	
	public Tetrapak() {
		super();
	}
	
	public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean mozeReciklaza,
			double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.mozeReciklaza = mozeReciklaza;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isMozeReciklaza() {
		return mozeReciklaza;
	}

	public void setMozeReciklaza(boolean mozeReciklaza) {
		this.mozeReciklaza = mozeReciklaza;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	
	public double racunaCenu() {
		double cena;
		if (this.mozeReciklaza == true) {
			cena = this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
		}
		else {
			cena = this.osnovnaCena;
		}
		return cena;
	}
	
	@Override
	public void stampaj() {
		System.out.println("Naziv artikla: " + this.nazivArtikla);
		System.out.println("Barkod: " + this.barkod);
		System.out.println("Bruto tezina: " + this.brutoTezina + ", Neto tezina: " + this.netoTezina);
		System.out.println("Moze se reciklirati: " + this.mozeReciklaza);
		System.out.println("Osnovna cena: " + this.osnovnaCena);
		System.out.println("Ukupna cena: " + this.racunaCenu());
	}

}
