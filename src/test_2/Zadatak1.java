package test_2;

public class Zadatak1 {

	public static void main(String[] args) {
		
		InstagramUser sveta = new InstagramUser("sveta");
		sveta.setPunoIme("Svetolik Kljajic");
		
		InstagramUser milan = new InstagramUser("milan");
		InstagramUser stefan = new InstagramUser("stefan13");
		InstagramUser pera = new InstagramUser("pera Peric");
		
		milan.setPunoIme("Milan Jovanovic");
		stefan.setPunoIme("Stefan Stefanovic");
		pera.setPunoIme("Pera Peric");
		
		InstagramUser zoki = new InstagramUser("zoki");
		InstagramUser miki = new InstagramUser("miki");
		InstagramUser zika = new InstagramUser("zika");
		
		zoki.setPunoIme("Zoka Zokic");
		miki.setPunoIme("Miki Mikic");
		zika.setPunoIme("Zika Zikic");
		
		InstagramStory story = new InstagramStory(sveta, "https://www.instagram.com/p/CecrcPyrPMj/");
		
		InstagramLocationAddOn lokacija = new InstagramLocationAddOn("AAABBBCCC", 100, 100, 150, 150, "Krusevac");
		InstagramMentionAddOn mention1 = new InstagramMentionAddOn("CCCBBB", 90, 90, 110, 160, milan);
		InstagramMentionAddOn mention2 = new InstagramMentionAddOn("AAAAAA", 90, 90, 110, 160, stefan);
		InstagramMentionAddOn mention3 = new InstagramMentionAddOn("BBBBBB", 90, 90, 110, 160, pera);
		
		story.dodajDodatak(lokacija);
		story.dodajDodatak(mention1);
		story.dodajDodatak(mention2);
		story.dodajDodatak(mention3);
		story.setSwipeUp("<<< swipe up >>>");
		
		story.postaviStory();
		
		story.pogledajStory(zika);
		story.pogledajStory(pera);
		story.pogledajStory(miki);
		System.out.println();
		story.stampaj();
		
		System.out.println();
		story.brisiDodatak("CCCBBB");
		story.postaviStory();

	}

}
