package p19_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Zadatak1_Tacka tackaA = new Zadatak1_Tacka();
		tackaA.setX(10);
		tackaA.setY(20);
		
		tackaA.stampaj();
		
		Zadatak1_Tacka tackaB = new Zadatak1_Tacka(30, 40);
		
		tackaB.stampaj();

	}

}
