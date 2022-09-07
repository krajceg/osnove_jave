package d06_09_2022;

public class SuperKartica {
	
	protected String brojKartice;
	protected String punoImeVlasnika;
	protected int popust;
	
	public SuperKartica() {
		super();
	}

	public SuperKartica(String brojKartice, String punoImeVlasnika, int popust) {
		super();
		this.brojKartice = brojKartice;
		this.punoImeVlasnika = punoImeVlasnika;
		this.popust = popust;
	}

	public String getBrojKartice() {
		return brojKartice;
	}

	public void setBrojKartice(String brojKartice) {
		this.brojKartice = brojKartice;
	}

	public String getPunoImeVlasnika() {
		return punoImeVlasnika;
	}

	public void setPunoImeVlasnika(String punoImeVlasnika) {
		this.punoImeVlasnika = punoImeVlasnika;
	}

	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}
	
	public void stampaj() {
		System.out.println("(" + this.brojKartice + ") (" + this.punoImeVlasnika + ")");
	}
	

}
