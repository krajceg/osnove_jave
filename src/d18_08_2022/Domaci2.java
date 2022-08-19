package d18_08_2022;

public class Domaci2 {
	
//		Kreirati klasu FacebookPost koja ima:
//		   Od atributa:
//		ime i prezime korisnika koji je objavio post
//		ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite 
//				objavu na tudjem profilu)
//		tekst objave
//		broj lajkova
//		broj deljenja
//		  Od metoda:
//		like(), koja povecava broj lajkova za 1.
//		dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//		share(), koja povecava broj deljenja za 1
//		print(), koja stampa objavu u formatu:
//		(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//		(tekst objave)
//		Likes (broj lajkova) | Shares (broj deljenja)
//
//		U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//		Primer stampanja:
//		Milan Jovanovic >>> Pera Peric
//		Ovo je tekst objave
//		Likes 3 | Shares 1

	
	
	public static void main(String[] args) {
		
		Domaci2_FacebookPost facebookPost = new Domaci2_FacebookPost();
		Domaci2_FacebookPost facebookPost2 = new Domaci2_FacebookPost();
		
		facebookPost.punoImePostera = "Svetolik Kljajic";
		facebookPost.punoImeProfila = "Pera Peric";
		facebookPost.tekstObjave = "Napokon sneg";
		facebookPost.lajk = 3;
		facebookPost.deljenje = 1;
		
		facebookPost.like();
		facebookPost.like();
		facebookPost.dislike();
		facebookPost.share();
		facebookPost.print();
		
		facebookPost2.punoImePostera = "Marko Kraljevic";
		facebookPost2.punoImeProfila = "Nenad Nedic";
		facebookPost2.tekstObjave = "Napokon kisa";
		facebookPost2.lajk = 1;
		facebookPost2.deljenje = 0;
		
		facebookPost2.like();
		facebookPost2.dislike();
		facebookPost2.dislike();
		facebookPost2.dislike();
		facebookPost2.share();
		facebookPost2.print();

	}

}
