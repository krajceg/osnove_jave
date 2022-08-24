package d23_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		
		Ringla ringla1 = new Ringla("ekspres", 2);
		Ringla ringla2 = new Ringla("ekspres", 1.5);
		Ringla ringla3 = new Ringla("obicna", 0.8);
		Ringla ringla4 = new Ringla("obicna", 1);
		
		ElektricniSporet beko = new ElektricniSporet("Beko", 7, 3, ringla1, ringla2, ringla3, ringla4);
		
		beko.pojacaj("pozicija 1");
		beko.pojacaj("pozicija 1");
		beko.pojacaj("pozicija 1");
		beko.pojacaj("pozicija 1");
		beko.pojacaj("pozicija 1");
		beko.pojacaj("pozicija 1");
		
		beko.pojacaj("pozicija 2");
		beko.pojacaj("pozicija 2");
		
		
		
		beko.pojacaj("pozicija 4");
		beko.pojacaj("pozicija 4");
		
		beko.pojacaj("pozicija 3");
		beko.pojacaj("pozicija 3");
		beko.pojacaj("pozicija 3");
		beko.pojacaj("pozicija 3");

		beko.stampaj();
		
		beko.iskljuci("pozicija 3");
		System.out.println(beko.potrosnjaSporeta(10, 10, 10, 10));
		
		beko.stampaj();
		
	

	}

}
