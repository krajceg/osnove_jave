package d18_08_2022;

public class Domaci1_Proizvod {

	public String naziv;
	public double cena;
	public double tezina;

	public void stampaj() {
		System.out.println("{{" + this.naziv + "}}, {{" + this.cena + "}}, {{" + this.tezina + "}}");
	}

	public void povecajCenu(double x) {
		this.cena = this.cena + x;
	}

	public double vratiCenuSaPopustom(double x) {
		double popust = this.cena * x / 100;
		return this.cena - popust;
	}

	public double racunajPostarinu() {
		if (this.tezina <= 100) {
			return 200;
		}
		else if (this.tezina <= 500) {
			return 400;
		}
		else {
			return 1000;
		}
	}

}
