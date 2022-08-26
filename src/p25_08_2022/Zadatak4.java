package p25_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		
		InstagramUser svetolik = new InstagramUser("sveta", "Svetolik Kljajic", "sveta@gmail.com");
		InstagramUser miki = new InstagramUser("uki", "Milan Milanovic", "milan@gmail.com");
		
		
		InstagramImage slika1 = new InstagramImage(300, 300, "instagram.com/korsnik-pera/profilna1.jpg");
		InstagramImage slika2 = new InstagramImage(300, 300, "instagram.com/korsnik-pera/profilna2.jpg");
		InstagramImage slika3 = new InstagramImage(300, 300, "instagram.com/korsnik-pera/profilna3.jpg");
		
		InstagramPost post1 = new InstagramPost();
		
		post1.dodajSliku(slika1);
		post1.dodajSliku(slika2);
		post1.dodajSliku(slika3);
		
		InstagramTag tag1 = new InstagramTag(120, 120, svetolik);
		InstagramTag tag2 = new InstagramTag(100, 100, miki);
		
		slika1.dodajTag(tag1);
		slika1.dodajTag(tag2);
		slika2.dodajTag(tag1);
		slika3.dodajTag(tag2);
		
		post1.stampaj();
		

	}

}
