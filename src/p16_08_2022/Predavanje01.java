package p16_08_2022;

public class Predavanje01 {

	public static void main(String[] args) {
		
		Korisnik k = new Korisnik();
		
		k.ime = "Milan";
		k.email = "milan@gmail.com";
		k.godine = 27;
		k.imena.add("Svetolik");
		
		System.out.println(k.imena.get(0));
		
		
		
	}

}
