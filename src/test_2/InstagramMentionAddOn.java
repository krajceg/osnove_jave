package test_2;

public class InstagramMentionAddOn extends InstagramAddOn {

	protected InstagramUser tagovanKorisnik;

	public InstagramMentionAddOn(String id, int x, int y, int sirinaDodatka, int visinaDodatka,
			InstagramUser tagovanKorisnik) {
		super(id, x, y, sirinaDodatka, visinaDodatka);
		this.tagovanKorisnik = tagovanKorisnik;
	}

	public InstagramUser getTagovanKorisnik() {
		return tagovanKorisnik;
	}

	public void setTagovanKorisnik(InstagramUser tagovanKorisnik) {
		this.tagovanKorisnik = tagovanKorisnik;
	}

	@Override
	public int minSirinaDodatka() {
		return 80;
	}

	@Override
	public int minVisinaDodatka() {
		return 50;
	}

	@Override
	public void stampaj() {
		System.out.println("[" + getX() + ", " + getY() + "] (" + this.visinaDodatka + ", " + this.sirinaDodatka + ") @"
				+ this.tagovanKorisnik.getUsername() + "/" + this.tagovanKorisnik.linkDoProfila());
	}

}
