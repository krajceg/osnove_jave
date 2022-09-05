package p05_09_2022;

public abstract class PlatnaKartica {
	
	protected double suma;
	protected String brojKartice;
	protected int godina;
	protected int mesec;
	
	public PlatnaKartica(double suma, String brojKartice, int godina, int mesec) {
		super();
		this.suma = suma;
		this.brojKartice = brojKartice;
		this.godina = godina;
		this.mesec = mesec;
	}

	public double getSuma() {
		return suma;
	}

	public String getBrojKartice() {
		return brojKartice;
	}

	public int getGodina() {
		return godina;
	}

	public int getMesec() {
		return mesec;
	}
	
	public void dodajSredstva(double unetaVrednost) {
		this.suma = this.suma + unetaVrednost;
	}
	
	public abstract void izvrsiTransakciju (double unetaVrednost);
	
	public abstract void stampaj();
}
