package test_2;

public class InstagramLocationAddOn extends InstagramAddOn {
	
	protected String nazivLokacije;

	public InstagramLocationAddOn(String id, int x, int y, int sirinaDodatka, int visinaDodatka, String nazivLokacije) {
		super(id, x, y, sirinaDodatka, visinaDodatka);
		this.nazivLokacije = nazivLokacije;
	}

	public String getNazivLokacije() {
		return nazivLokacije;
	}

	public void setNazivLokacije(String nazivLokacije) {
		this.nazivLokacije = nazivLokacije;
	}

	@Override
	public int minSirinaDodatka() {
		return 100;
	}

	@Override
	public int minVisinaDodatka() {
		return 50;
	}

	@Override
	public void stampaj() {
		System.out.println("[" + getX() + ", " + getY() + "] (" + this.visinaDodatka + ", " + this.sirinaDodatka + ") L " 
	+ this.nazivLokacije);
	}
	
	

}
