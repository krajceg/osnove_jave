package p26_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		EONPaket paket1 = new EONPaket("Svetolik", 2999, 24);
		
		paket1.stampaj();
		
		DUOPaket paket2 = new DUOPaket("Milan Milic", 3999, 24, "mobilni");
		
		paket2.povecajBrzinu(100);
		paket2.stampaj();
		paket2.produziUgovor();
		paket2.stampaj();
//		System.out.println(paket2.brojMeseciPoDinar()); full useless za sada, ali moze da se prima int parametar koji predstavlja koji je 
//														mesec od kako je ugovor poceo pa da nam vrati koliko je ostalo (ne manje od 0)
//														moze da se doda i nova metoda dodajMesecePoDinar?

	}

}
