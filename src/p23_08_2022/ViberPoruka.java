package p23_08_2022;

public class ViberPoruka {

	private String tekst;
	private String vreme;
	private ViberKorisnik korisnikSalje;
	private ViberKorisnik korisnikPrima;
	private ViberReakcija reakcija;
	
	public ViberPoruka(String tekst, String vreme, ViberKorisnik korisnikSalje, ViberKorisnik korisnikPrima) {
		this.tekst = tekst;
		this.vreme = vreme;
		this.korisnikSalje = korisnikSalje;
		this.korisnikPrima = korisnikPrima;
		this.korisnikSalje.setAktivan(true);
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public String getVreme() {
		return vreme;
	}

	public ViberKorisnik getKorisnikSalje() {
		return korisnikSalje;
	}

	public ViberKorisnik getKorisnikPrima() {
		return korisnikPrima;
	}
	
	
	public ViberReakcija getReakcija() {
		return reakcija;
	}

	public void setReakcija(ViberReakcija reakcija) {
		this.reakcija = reakcija;
	}

	public void stampaj() {
		System.out.print("From: " + this.korisnikSalje.getPunoIme() + " * ");
		if (this.korisnikSalje.isAktivan() == true) {
			System.out.print("Active Now ");
		}
		else {
			System.out.print("Not Active ");
		}
		System.out.println("- at " + this.vreme);
		System.out.println("To " + this.korisnikPrima.getPunoIme());
		System.out.print(this.tekst + " ");
		if (this.reakcija != null) {
			this.reakcija.stampaj();
		}
		System.out.println();
		System.out.println();
	}
	
	
	
	
}
