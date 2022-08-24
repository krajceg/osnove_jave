package p23_08_2022;

public class ViberKorisnik {
	
	private String punoIme;
	private int broj;
	private boolean aktivan;
	
	public ViberKorisnik(String punoIme, int broj) {
		this.punoIme = punoIme;
		this.broj = broj;
		this.aktivan = false;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public boolean isAktivan() {
		return aktivan;
	}

	public void setAktivan(boolean aktivan) {
		this.aktivan = aktivan;
	}
	
	
	
}
