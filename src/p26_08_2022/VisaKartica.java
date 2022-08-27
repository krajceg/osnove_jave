package p26_08_2022;

public class VisaKartica extends PlatnaKartica {
	
	private String ovlascenoLice;				// ime i prezime osobe koja ima osvlascenje da podize novac

	public String getOvlascenoLice() {
		return ovlascenoLice;
	}

	public void setOvlascenoLice(String ovlascenoLice) {
		this.ovlascenoLice = ovlascenoLice;
	}

	public VisaKartica(int suma, String brojKartice, int godina, int mesec, String ovlascenoLice) {
		super(suma, brojKartice, godina, mesec);
		this.ovlascenoLice = ovlascenoLice;
	}
	
	@Override
	public void izvrsiTransakciju(double skida) {
		double provizija = (skida*1.8)/100;
		if (provizija < 4) {
			provizija = 4;
		}
		skida = skida + provizija;
		super.izvrsiTransakciju(skida);
	}
	
	@Override
	public void stampaj() {
		System.out.print("Visa Card: ");
		super.stampaj();
	}
	

}
