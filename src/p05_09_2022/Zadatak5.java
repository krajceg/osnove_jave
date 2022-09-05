package p05_09_2022;

import java.util.ArrayList;

public class Zadatak5 {

	public static void main(String[] args) {
		
		ArrayList<Proizvod> nizProizvoda = new ArrayList<Proizvod>();
		
		IcePoint icePoint1 = new IcePoint("cokolada", true);
		IcePoint icePoint2 = new IcePoint("cokolada", false);
		IcePoint icePoint3 = new IcePoint("vanila", true);
		
		Pica pica1 = new Pica(100);
		Pica pica2 = new Pica(120);
		
		nizProizvoda.add(icePoint1);
		nizProizvoda.add(icePoint2);
		nizProizvoda.add(icePoint3);
		nizProizvoda.add(pica1);
		nizProizvoda.add(pica2);
		
		Sastojak cokolada = new Sastojak("cokolada", 100);
		Sastojak mleko = new Sastojak("mleko", 80);
		Sastojak pecurke = new Sastojak("pecurke", 90);
		Sastojak masline = new Sastojak("masline", 200);
		
		pica1.ubaciSastojak(masline);
		pica1.ubaciSastojak(pecurke);
		
		icePoint1.ubaciSastojak(mleko);
		icePoint1.ubaciSastojak(cokolada);
		
		icePoint1.stampaj();
		System.out.println();
		
		pica1.stampaj();
		

	}

}
