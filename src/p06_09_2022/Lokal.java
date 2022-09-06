package p06_09_2022;

public class Lokal extends Objekat {

	public Lokal(String adresa, double povrsinaObjekta, int zona) {
		super(adresa, povrsinaObjekta, zona);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double porez() {
		return koeficijentPoreza() * this.povrsinaObjekta * 1.3;
	}

	@Override
	public void stampaj() {
		System.out.println("Adresa: " + this.adresa + ", Zona: " + this.zona);
		System.out.println("Povrsina: " + this.povrsinaObjekta);
		System.out.println("Porez: " + porez());
		System.out.println();
	}

}
