package p06_09_2022;

public class Pica extends Proizvod {

	protected double cenaPodloge;

	public Pica(double cenaPodloge) {
		super();
		this.cenaPodloge = cenaPodloge;
	}

	public double getCenaPodloge() {
		return cenaPodloge;
	}

	public void setCenaPodloge(double cenaPodloge) {
		this.cenaPodloge = cenaPodloge;
	}

	@Override
	public double ukupnuRacunajCenu() {
		return cenaSvihDodataka() + cenaPodloge;
	}

	@Override
	public void stampaj() {
		System.out.println("Pica ukupna cena: " + ukupnuRacunajCenu());
		for (int i = 0; i < nizSastojka.size(); i++) {
			nizSastojka.get(i).stampaj();
		}
		System.out.println();
	}

}
