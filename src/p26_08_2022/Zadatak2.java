package p26_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
//		PlatnaKartica kartica1 = new PlatnaKartica(10000, "123-123-123-123", 2024, 10);
		
//		kartica1.stampaj();
		
//		VisaKartica visa = new VisaKartica(10000, "123-123-123-123", 2024, 10, "Svetolik Kljajic");
//		
//		visa.izvrsiTransakciju(1);
//		
//		visa.stampaj();
//		
		
		MasterKartica master = new MasterKartica(10000, "123-123-123-123", 2024, 10);
		
		master.stampaj();
		
		master.dodajSredstva(1000);
		master.stampaj();
		master.naplatiOdrzavanje();
		master.stampaj();
		master.izvrsiTransakciju(1000);
		master.stampaj();

	}

}
