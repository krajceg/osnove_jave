package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza {
	
	protected double kaucijaZaFlasu;
	protected boolean daLiSePlacaKaucija;
	protected double osnovnaCena;
	
	public StaklenaAmbalaza() {
		super();
	}
	
	public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina,
			double kaucijaZaFlasu, boolean daLiSePlacaKaucija, double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.kaucijaZaFlasu = kaucijaZaFlasu;
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
		this.osnovnaCena = osnovnaCena;
	}
	
	public double getKaucijaZaFlasu() {
		return kaucijaZaFlasu;
	}

	public void setKaucijaZaFlasu(double kaucijaZaFlasu) {
		this.kaucijaZaFlasu = kaucijaZaFlasu;
	}

	public boolean isDaLiSePlacaKaucija() {
		return daLiSePlacaKaucija;
	}

	public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	
	public double racunaCenu() {
		double cena;
		if (this.daLiSePlacaKaucija == true) {
			cena = this.osnovnaCena * 1.2 + this.kaucijaZaFlasu;
		}
		else {
			cena = this.osnovnaCena * 1.2;
		}
		return cena;
	}
	@Override
	public void stampaj() {
		System.out.println("Naziv artikla: " + this.nazivArtikla);
		System.out.println("Barkod: " + this.barkod);
		System.out.println("Bruto tezina: " + this.brutoTezina + ", Neto tezina: " + this.netoTezina);
		System.out.println("Kaucija se placa: " + this.daLiSePlacaKaucija);
		if (this.isDaLiSePlacaKaucija() == true) {
			System.out.println("Kaucija: " + this.kaucijaZaFlasu);
		}
		System.out.println("Osnovna staklene ambalaze cena: " + this.osnovnaCena);
		System.out.println("Ukupna cena staklene ambalaze: " + this.racunaCenu());
		
	}

}
