package p05_09_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		StudentOsnovnih sveta = new StudentOsnovnih("Svetolik Kljajic", "12345", 2);
		
		StudentMaster	pera = new StudentMaster("Pera Peric", "1234556", 3);
		
		sveta.stampaj();
		System.out.println();
		pera.stampaj();

	}

}
