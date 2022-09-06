package p06_09_2022;

public class Kuca extends Objekat {
	
	protected int brojClanova;

	public Kuca(String adresa, double povrsinaObjekta, int zona, int brojClanova) {
		super(adresa, povrsinaObjekta, zona);
		this.brojClanova = brojClanova;
	}

	public int getBrojClanova() {
		return brojClanova;
	}

	public void setBrojClanova(int brojClanova) {
		this.brojClanova = brojClanova;
	}

	@Override
	public double porez() {
		// TODO Auto-generated method stub
		return this.povrsinaObjekta * koeficijentPoreza();
	}

	@Override
	public void stampaj() {
		System.out.println("Adresa: " + this.adresa + ", Zona: " + this.zona);
		System.out.println("Povrsina: " + this.povrsinaObjekta + ", Broj clanova: " + this.brojClanova);
		System.out.println("Porez: " + porez());
		System.out.println();
	}

	
	
	
}
