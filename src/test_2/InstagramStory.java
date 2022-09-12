package test_2;

import java.util.ArrayList;

public class InstagramStory {
	
	private InstagramUser kreiraoKorisnik;
	private String swipeUp;
	private String linkDoSlike;
	private ArrayList<InstagramAddOn> nizDodataka = new ArrayList<InstagramAddOn>();
	private ArrayList<InstagramUser> nizKorisnika = new ArrayList<InstagramUser>();
	
	public InstagramUser getKreiraoKorisnik() {
		return kreiraoKorisnik;
	}
	public String getSwipeUp() {
		return swipeUp;
	}
	public String getLinkDoSlike() {
		return linkDoSlike;
	}
	public ArrayList<InstagramAddOn> getNizDodataka() {
		return nizDodataka;
	}
	public ArrayList<InstagramUser> getNizKorisnika() {
		return nizKorisnika;
	}
	public void setSwipeUp(String swipeUp) {
		this.swipeUp = swipeUp;
	}
	
	public InstagramStory(InstagramUser kreiraoKorisnik, String linkDoSlike) {
		super();
		this.kreiraoKorisnik = kreiraoKorisnik;
		this.linkDoSlike = linkDoSlike;
		this.swipeUp = null;
	}
	
	public void dodajDodatak (InstagramAddOn dodatak) {
		this.nizDodataka.add(dodatak);
	}
	
	public void brisiDodatak (String id) {
		for (int i = 0; i < nizDodataka.size(); i++) {
			if (id.equals(nizDodataka.get(i).getId())) {
				nizDodataka.remove(i);
			}
		}
	}
	
	private boolean daLiJeKorisnikPogledao (String username) {
		for (int i = 0; i < nizKorisnika.size(); i++) {
			if (username.equals(nizKorisnika.get(i).getUsername())) {
				return true;
			}
		}
		return false;
	}
	
	public void pogledajStory (InstagramUser korisnik) {
		if (daLiJeKorisnikPogledao(korisnik.getUsername()) == false) {
			nizKorisnika.add(korisnik);
		}
	}
	
	public void postaviStory() {
		this.kreiraoKorisnik.stampaj();
		for (int i = 0; i < nizDodataka.size(); i++) {
			nizDodataka.get(i).stampaj();
		}
		System.out.println();
		if (this.swipeUp != null) {
			System.out.println(this.swipeUp);
		}
	}
	
	public int brojPregleda() {
		return nizKorisnika.size();
	}
	
	public void stampaj() {
		System.out.println("Viewers " + brojPregleda());
		for (int i = 0; i < nizKorisnika.size(); i++) {
			nizKorisnika.get(i).stampaj();
		}
	}
	
}
