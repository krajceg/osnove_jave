package p05_09_2022;

public class VisaKartica extends PlatnaKartica {
	
	protected String ovlascenoLice;

	public VisaKartica(double suma, String brojKartice, int godina, int mesec, String ovlascenoLice) {
		super(suma, brojKartice, godina, mesec);
		this.ovlascenoLice = ovlascenoLice;
	}
	
	public String getOvlascenoLice() {
		return ovlascenoLice;
	}

	public void setOvlascenoLice(String ovlascenoLice) {
		this.ovlascenoLice = ovlascenoLice;
	}

	@Override
	public void izvrsiTransakciju(double unetaVrednost) {
		double provizija = (unetaVrednost * 1.8) / 100;
		if (provizija < 4) {
			provizija = 4;
		}
		this.suma = this.suma - (unetaVrednost + provizija);
	}

	@Override
	public void stampaj() {
		System.out.println("Visa Card: " + this.brojKartice + ", " + this.mesec + "/" + this.godina + ", $" + this.suma);
	}
	
	
	
}
