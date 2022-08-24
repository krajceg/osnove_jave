package p23_08_2022;

public class FizickoLice {
	
	private String punoIme;
	private String brojLicneKarte;
	private String jmbg;
	private boolean kupovala;
	
	public FizickoLice(String punoIme, String brojLicneKarte, String jmbg) {
		this.punoIme = punoIme;
		this.brojLicneKarte = brojLicneKarte;
		this.jmbg = jmbg;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getBrojLicneKarte() {
		return brojLicneKarte;
	}

	public void setBrojLicneKarte(String brojLicneKarte) {
		this.brojLicneKarte = brojLicneKarte;
	}

	public boolean isKupovala() {
		return kupovala;
	}

	public void setKupovala(boolean kupovala) {
		this.kupovala = kupovala;
	}

	public String getJmbg() {
		return jmbg;
	}
	
	public void stampaj () {
		System.out.print(this.punoIme + ", " + this.brojLicneKarte);
	}
}
