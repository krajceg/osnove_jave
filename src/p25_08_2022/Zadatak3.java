package p25_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		
		HistoryPage google = new HistoryPage("Google", "www.google.com", 20, 30);
		HistoryPage google2 = new HistoryPage("Google2", "www.google.com/2", 20, 00);
		HistoryPage google3 = new HistoryPage("Google3", "www.google.com/3", 20, 33);
		HistoryPage google4 = new HistoryPage("Google4", "www.google.com/4", 20, 34);
		
		
		History history = new History();
		
		history.otvoriStranicu(google);
		history.otvoriStranicu(google2);
		history.otvoriStranicu(google3);
		history.otvoriStranicu(google4);
		
		
		
		history.sacuvajKredencija("Google", "pera", "pera123");
		history.sacuvajKredencija("Google2", "pera", "pera123");
		history.sacuvajKredencija("Google3", "pera", "pera123");
		history.sacuvajKredencija("Google4", "pera", "pera123");
//		history.pogledajIstoriju();
		history.pogledajIstoriju();
		history.obrisiSveKolaciceZaZadnjihSatVremena(21, 15);
		history.pogledajIstoriju();
//		history.obrisiKolacicePremaLinku("www.google.com");
//		history.pogledajIstoriju();
		history.obrisiIstoriju();
		history.pogledajIstoriju();
		
		
		
	}

}
