package p06_09_2022;

public class Zgrada extends Objekat {

	protected int brojStanova;

	public Zgrada(String adresa, double povrsinaObjekta, int zona, int brojStanova) {
		super(adresa, povrsinaObjekta, zona);
		this.brojStanova = brojStanova;
	}

	public int getBrojStanova() {
		return brojStanova;
	}

	public void setBrojStanova(int brojStanova) {
		this.brojStanova = brojStanova;
	}

	@Override
	public double porez() {
		return koeficijentPoreza() * this.povrsinaObjekta * this.brojStanova;
	}

	@Override
	public void stampaj() {
		System.out.println("Adresa: " + this.adresa + ", Zona: " + this.zona);
		System.out.println("Povrsina: " + this.povrsinaObjekta + ", Broj stanova: " + this.brojStanova);
		System.out.println("Porez: " + porez());
		System.out.println();
	}

}
