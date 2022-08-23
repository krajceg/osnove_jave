package p22_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Korisnik korisnik = new Korisnik();
		
		FacebookPost facebookPost = new FacebookPost (korisnik, "pada kisa");
		
		korisnik.setIme("Svetolik");
		korisnik.setPrezime("Kljajic");
		
		facebookPost.stampajPost();
	}

}
