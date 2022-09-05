package p05_09_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		VisaKartica visa = new VisaKartica(10000, "12345", 2024, 12, "Svetolik Kljajic");
		
		visa.stampaj();
		visa.dodajSredstva(500);
		visa.stampaj();
		visa.izvrsiTransakciju(1000);
		visa.stampaj();
		System.out.println();
		
		MasterKartica master = new MasterKartica(5000, "12345", 2023, 11);
		
		master.stampaj();
		master.izvrsiTransakciju(10);
		master.stampaj();
		master.naplatiOdrzavanje();
		master.stampaj();
		master.dodajSredstva(500);
		master.stampaj();

	}

}
