package p25_08_2022;

import java.util.ArrayList;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Reakcija r1 = new Reakcija("smajli", "Milan");
		Reakcija r2 = new Reakcija("like", "Vlada");
		Reakcija r3 = new Reakcija("srce", "Pera");
		Reakcija r4 = new Reakcija("like", "Milos");
		FacebookPost post1 = new FacebookPost("Svetolik Kljajic", "Stala kisa");
		
		post1.stampaj();
		post1.reaguj(r1);
		post1.reaguj(r1);
		post1.reaguj(r1);
		post1.reaguj(r2);
		post1.reaguj(r3);
		post1.reaguj(r4);
		post1.stampaj();
	}

}
