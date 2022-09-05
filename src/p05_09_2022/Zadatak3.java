package p05_09_2022;

import java.util.ArrayList;

public class Zadatak3 {

	public static void main(String[] args) {
		
		JednakostranicniTrougao trougao1 = new JednakostranicniTrougao(3);
		JednakostranicniTrougao trougao2 = new JednakostranicniTrougao(4);
		
		Pravougaonik pravougaonik1 = new Pravougaonik(2, 3);
		Pravougaonik pravougaonik2 = new Pravougaonik(2, 4);
		Pravougaonik pravougaonik3 = new Pravougaonik(2, 5);
		
		ArrayList<Figura> niz = new ArrayList<Figura>();
		
		niz.add(trougao1);
		niz.add(trougao2);
		niz.add(pravougaonik1);
		niz.add(pravougaonik2);
		niz.add(pravougaonik3);
		
		double zbir = 0;
		
		for (int i = 0; i < niz.size(); i++) {
			zbir = zbir + niz.get(i).povrsina() + niz.get(i).obim();
		}
		
		System.out.println("Zbir svih obima i povrsina je " + zbir);
		System.out.println();
		
		for (int i = 0; i < niz.size(); i++) {
			System.out.println("Povrsina = " + niz.get(i).povrsina());
			System.out.println("Obim = " + niz.get(i).obim());
			System.out.println();
		}
	}

}
