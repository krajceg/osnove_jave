package p23_08_2022;

public class Korisnik {
	
	private String punoIme;
	private String tipLicence;
	
	public Korisnik(String punoIme) {
		this.punoIme = punoIme;
		this.tipLicence = "basic";
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getTipLicence() {
		return tipLicence;
	}
	
	public void setTipLicence (int suma) {
		if (suma == 100) {
			this.tipLicence = "pro";
		}
		if (suma == 150) {
			this.tipLicence = "premium";
		}
	}
	
	public void ponistiPretplatu () {
		this.tipLicence = "basic";
	}
	
	public int maxVideo () {
		if (this.tipLicence.equals("premium")) {
			return 1440;
		}
		if (this.tipLicence.equals("pro")) {
			return 240;
		}
		else {
			return 40;
		}
	}
	
	public void stampaj () {
		System.out.println(this.punoIme);
	}
	
	
	
}
