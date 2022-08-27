package p26_08_2022;

public class PlatnaKartica {
	
	protected double suma;
	protected String brojKartice;
	protected int godina; 				// godina do kad vazi kartica
	protected int mesec;				// mesec do kad vazi kartica
	
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
	
	public void dodajSredstva (int uplata) {
		this.suma = this.suma + uplata;
	}
	
	public void izvrsiTransakciju (double skida) {
		this.suma = this.suma - skida;
	}
	
	public void stampaj() {
		System.out.println(this.brojKartice + ", " + this.mesec + "/" + this.godina + ", $" + this.suma);
	}
}
