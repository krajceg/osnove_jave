package p26_08_2022;

public class Auto extends Vozilo {
	
	private int brojVrata;

	public Auto() {

	}

	public Auto(String registracija, String marka, int brzina, int kubikaza, int maxBrzina, int brojVrata) {
		super(registracija, marka, brzina, kubikaza, maxBrzina);
		this.brojVrata = brojVrata;
	}

	public int getBrojVrata() {
		return brojVrata;
	}

	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}
	
	public void stampajAuto () {
		stampaj();
		System.out.println("Broj vrata: " + this.brojVrata);
	}
}
