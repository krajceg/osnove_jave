package p22_08_2022;

public class FacebookPost {

	private String opis;
	private Korisnik korisnik;

	public FacebookPost(Korisnik korisnik, String opis) {
		this.korisnik = korisnik;
		this.opis = opis;
	}

	public String getOpis() {
		return opis;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void stampajPost() {
		korisnik.stampaj();
		System.out.println(this.opis);
	}
}
