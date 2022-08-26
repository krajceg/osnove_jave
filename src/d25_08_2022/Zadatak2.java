package d25_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		
		Listic listic1 = new Listic();
		Kombinacija pr1 = new Kombinacija("11111", 1, 1, 1, 1, 1, 1, 1);
		Kombinacija pr2 = new Kombinacija("22222", 2, 2, 2, 2, 2, 2, 2);
		Kombinacija pr3 = new Kombinacija("33333", 3, 3, 3, 3, 3, 3, 3);
		Kombinacija pr4 = new Kombinacija("44444", 1, 2, 3, 4, 5, 6, 7);
		Kombinacija pr5 = new Kombinacija("55555", 5, 5, 5, 5, 5, 5, 5);
		Kombinacija pr6 = new Kombinacija("66666", 6, 6, 6, 6, 6, 6, 6);
		Kombinacija pr7 = new Kombinacija("77777", 7, 7, 7, 7, 7, 7, 7);
		
		Kombinacija pr8 = new Kombinacija("2222222", 1, 2, 3, 4, 5, 6, 7);
		
		listic1.dodajKombinaciju(pr1);
		listic1.dodajKombinaciju(pr2);
		listic1.dodajKombinaciju(pr3);
		listic1.dodajKombinaciju(pr4);
		listic1.dodajKombinaciju(pr5);
		listic1.dodajKombinaciju(pr6);
		listic1.dodajKombinaciju(pr7);

		System.out.println(listic1.daLiJeKombinacijaDobitna(pr8));
		System.out.println();
		
		listic1.stampaj();

	}

}
