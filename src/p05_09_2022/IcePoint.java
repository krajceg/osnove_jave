package p05_09_2022;

public class IcePoint extends Proizvod {

	protected String tipSladoleda; // vanila/cokolada;
	protected boolean velikiSladoled; // false = mali;
	
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


	public double ukupnuRacunajCenu() {
		double ukupnaCena;
		if (velikiSladoled == true) {
			ukupnaCena = cenaSvihDodataka() + 130;
		} else {
			ukupnaCena = cenaSvihDodataka() + 100;
		}
		return ukupnaCena;
	}

	@Override
	public void stampaj() {
		System.out.println("Tip sladoleda: " + this.tipSladoleda);
		System.out.print("Velicina sladoleda: ");
		if (velikiSladoled == true) {
			System.out.println("veliki");
		} else {
			System.out.println("mali");
		}
		System.out.println("Sastojci:");
		for (int i = 0; i < sastojci.size(); i++) {
			sastojci.get(i).stampaj();
		}
		System.out.println("Ukupna cena: " + ukupnuRacunajCenu());
	}

}
