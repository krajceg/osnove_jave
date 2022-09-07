package d06_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		SuperKartica kartica = new SuperKartica("123-321", "Svetolik Kljajic", 200);
		Korpa korpa = new Korpa();
		
		Tetrapak jogurt = new Tetrapak("555-555-555", "Jogurt", 1000, 1100, true, 50);
		Tetrapak mleko = new Tetrapak("444-444-444", "Mleko", 1000, 1050, true, 40);
		
		StaklenaAmbalaza pivo = new StaklenaAmbalaza("222-222", "Amstel", 500, 505, 100, true, 80);
		
		korpa.dodajAmbalazu(jogurt);
		korpa.dodajAmbalazu(mleko);
		korpa.dodajAmbalazu(pivo);
		
		korpa.stampaj();
		System.out.println("Ukupna cena korpe: " + korpa.cenaKorpe(kartica));
		
	}

}
