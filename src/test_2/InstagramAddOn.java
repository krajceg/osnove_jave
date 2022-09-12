package test_2;

public abstract class InstagramAddOn {

	protected String id;
	protected int x;
	protected int y;
	protected int sirinaDodatka;
	protected int visinaDodatka;

	public String getId() {
		return id;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSirinaDodatka() {
		return sirinaDodatka;
	}

	public int getVisinaDodatka() {
		return visinaDodatka;
	}

	public InstagramAddOn(String id, int x, int y, int sirinaDodatka, int visinaDodatka) {
		super();
		this.id = id;
		this.x = x;
		this.y = y;
		this.sirinaDodatka = sirinaDodatka;
		this.visinaDodatka = visinaDodatka;
	}

	public abstract int minSirinaDodatka();

	public abstract int minVisinaDodatka();

	public void povecanjeDimenzija(int sirina, int visina) {
		this.sirinaDodatka = this.sirinaDodatka + sirina;
		this.visinaDodatka = this.visinaDodatka + visina;
	}

	public void smanjenjeDimenzija(int sirina, int visina) {
		this.sirinaDodatka = this.sirinaDodatka - sirina;
		if (this.sirinaDodatka < minSirinaDodatka()) {
			this.sirinaDodatka = minSirinaDodatka();
		}
		this.visinaDodatka = this.visinaDodatka - visina;
		if (this.visinaDodatka < minVisinaDodatka()) {
			this.visinaDodatka = minVisinaDodatka();
		}
	}

	public abstract void stampaj();

}
