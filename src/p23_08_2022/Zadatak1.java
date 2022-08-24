package p23_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Korisnik host = new Korisnik("Milan Jovanovic");
		
		host.setTipLicence(150);
		
		Korisnik guest = new Korisnik("Svetolik Kljajic");
		
		ZoomCall call = new ZoomCall("zoom.com/123asd", "222333", host);
		
		call.setGuest(guest);
		
		call.stampa();

	}

}
