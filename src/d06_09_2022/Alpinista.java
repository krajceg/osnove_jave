package d06_09_2022;

public class Alpinista extends Planinar {
	
	protected int poeni;

	public Alpinista(int jcib, String punoIme, int poeni) {
		super(jcib, punoIme);
		this.poeni = poeni;
	}

	public int getPoeni() {
		return poeni;
	}

	public void setPoeni(int poeni) {
		this.poeni = poeni;
	}

	@Override
	public double clanarina() {
		return 1500 - (50 * this.poeni);
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		if (planina.getVisinaPlanine() < 4000) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public void stampaj() {
		System.out.println("Alpinista, ID: (" + this.jcib + ")");
		System.out.println("Ime : (" + this.punoIme + ")");
		System.out.println("Broj poena: (" + this.poeni + ")");	
		System.out.println();
	}
	
	
}
