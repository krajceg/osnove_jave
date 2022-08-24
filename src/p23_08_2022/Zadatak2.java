package p23_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		FizickoLice prodavac1 = new FizickoLice("Svetolik Kljajic", "12345", "66666666666");
		
		FizickoLice kupac1 = new FizickoLice("Milan Jovanovic", "54321", "55555555555");
		
		
		kupac1.setKupovala(true);
		
		Ugovor ugovor1 = new Ugovor("23-08-2022", prodavac1, kupac1, 1000, "Ostrva Vida 21");
		
		ugovor1.stampaj();

	}

}
