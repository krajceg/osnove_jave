package d23_08_2022;

public class Transakcija {

	private String id;
	private Racun racunPlaca;
	private Racun racunDobija;

	public Transakcija(String id, Racun racunPlaca, Racun racunDobija) {
		this.id = id;
		this.racunPlaca = racunPlaca;
		this.racunDobija = racunDobija;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Racun getRacunPlaca() {
		return racunPlaca;
	}

	public void setRacunPlaca(Racun racunPlaca) {
		this.racunPlaca = racunPlaca;
	}

	public Racun getRacunDobija() {
		return racunDobija;
	}

	public void setRacunDobija(Racun racunDobija) {
		this.racunDobija = racunDobija;
	}

	private double provizija(double trazenaVrednost) {
		if (trazenaVrednost > 4500) {
			return trazenaVrednost/100;
		}
		else {
			return 45;
		}
	}

	public void transakcijaMetoda(double trazenaVrednost) {
		if (trazenaVrednost > 0) {
			if ((this.racunPlaca.getStanjeRacun() - ((trazenaVrednost + provizija(trazenaVrednost))) >= 0)) {
				this.racunDobija.menjaStanje(trazenaVrednost);
				this.racunPlaca.menjaStanje(-(trazenaVrednost + provizija(trazenaVrednost)));
			}
		}
	}

	public void stampaj() {
		System.out.println("ID transakcije: " + this.id);
		System.out.println("Racun sa: " + this.racunPlaca.getPunoIme() + " - " + this.racunPlaca.getBrojRacuna());
		System.out.println("Racun na: " + this.racunDobija.getPunoIme() + " - " + this.racunDobija.getBrojRacuna());
		System.out.println();
	}

}
