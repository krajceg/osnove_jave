package p06_09_2022;

public class IcePoint extends Proizvod {

	protected String tipSladoleda; // vanila, cokolada...
	protected boolean velikiSladoled; // false = mali

	public IcePoint(String tipSladoleda, boolean velikiSladoled) {
		super();
		this.tipSladoleda = tipSladoleda;
		this.velikiSladoled = velikiSladoled;
	}

	public String getTipSladoleda() {
		return tipSladoleda;
	}

	public void setTipSladoleda(String tipSladoleda) {
		this.tipSladoleda = tipSladoleda;
	}

	public boolean isVelikiSladoled() {
		return velikiSladoled;
	}

	public void setVelikiSladoled(boolean velikiSladoled) {
		this.velikiSladoled = velikiSladoled;
	}

	@Override
	public double ukupnuRacunajCenu() {
		if(velikiSladoled == true) {
			return cenaSvihDodataka() + 130;
		}
		else {
			return cenaSvihDodataka() + 100;
		}
	}

	@Override
	public void stampaj() {
		System.out.println("Tip sladoleda: " + this.tipSladoleda);
		System.out.print("Velicina sladoleda: ");
		if (velikiSladoled == true) {
			System.out.println("veliki");
		}
		else {
			System.out.println("mali");
		}
		for (int i = 0; i < nizSastojka.size(); i++) {
			nizSastojka.get(i).stampaj();
		}
		System.out.println("Ukupna cena: " + ukupnuRacunajCenu());
		System.out.println();
	}

}
