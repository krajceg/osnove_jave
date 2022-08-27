package p26_08_2022;

public class Profesor extends Osoba {

	private String predmet;
	private int iznosPlate;

	public Profesor(String punoIme, String jmbg, String predmet, int iznosPlate) {
		super(punoIme, jmbg);
		this.predmet = predmet;
		this.iznosPlate = iznosPlate;
	}

	public void povecajPlatu(int x) {
		this.iznosPlate = iznosPlate + (iznosPlate * x) / 100;
	}

	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Predmet: " + this.predmet);
		System.out.println("Iznost plate: " + this.iznosPlate);
		System.out.println();
	}

}
