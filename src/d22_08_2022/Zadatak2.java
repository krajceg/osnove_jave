package d22_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Proizvod but = new Proizvod("444-555", "Svinjski but", 750);
		Proizvod plecka = new Proizvod("666-666", "Svinjska plecka", 800);
		
		Vaga vaga = new Vaga("kg", but);
		Vaga vaga2 = new Vaga("lb", plecka);
		
		vaga.stampaj(2);
		System.out.println();
		vaga2.stampaj(10); // 10ka za gulas haha

	}

}
