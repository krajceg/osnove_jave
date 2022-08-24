package d23_08_2022;

import java.util.ArrayList;

public class Zadatak1 {
	
//	Zadatak
//	Kreirati klasu ZeleniKarton koja ima:
//	ime i prezime studenta 
//	broj indeksa 
//	naziv predmeta
//	ime i prezime profesora
//	ocenu - od 5 do 10
//	gettere i settere
//	konstruktore
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//			(naziv predmeta) - (ocena)
//			Student: ime i prezime, broj indeksa
//			Profesor: ime i prezime
//
//		U glavnoj klasi:
//	kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//	(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//	(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
	
	public static void main(String[] args) {
		
		ZeleniKarton zk1 = new ZeleniKarton("Svetolik Kljajic", "123123", "Matematika", "Milan Jovanovic", 10);
		ZeleniKarton zk2 = new ZeleniKarton("Svetolik Kljajic", "123123", "Informatika", "Pera Peric", 10);
		ZeleniKarton zk3 = new ZeleniKarton("Svetolik Kljajic", "123123", "Statistika", "Mika Mikic", 10);
		ZeleniKarton zk4 = new ZeleniKarton("Svetolik Kljajic", "123123", "Matematika 2", "Zika Zikic", 9);
		ZeleniKarton zk5 = new ZeleniKarton("Svetolik Kljajic", "123123", "Makro eko", "Marko Markic", 5);
		ZeleniKarton zk6 = new ZeleniKarton("Svetolik Kljajic", "123123", "Mikro eko", "Nenad Nedic", 5);
		ZeleniKarton zk7 = new ZeleniKarton("Svetolik Kljajic", "123123", "Fizika", "Sinisa Kostic", 8);
		ZeleniKarton zk8 = new ZeleniKarton("Svetolik Kljajic", "123123", "Engleski", "Vladimir Bozilovic", 10);
		ZeleniKarton zk9 = new ZeleniKarton("Svetolik Kljajic", "123123", "Engleski 2", "Aleksandar Petoric", 10);
		ZeleniKarton zk10 = new ZeleniKarton("Svetolik Kljajic", "123123", "Menadzment", "Vid Milacic", 10);
		
		zk1.stampaj();
		zk2.stampaj();
		zk3.stampaj();
		zk4.stampaj();
		zk5.stampaj();
		zk6.stampaj();
		zk7.stampaj();
		zk8.stampaj();
		zk9.stampaj();
		zk10.stampaj();
		
		ArrayList<ZeleniKarton> listaKartona = new ArrayList<ZeleniKarton>();
		
		listaKartona.add(zk1);
		listaKartona.add(zk2);
		listaKartona.add(zk3);
		listaKartona.add(zk4);
		listaKartona.add(zk5);
		listaKartona.add(zk6);
		listaKartona.add(zk7);
		listaKartona.add(zk8);
		listaKartona.add(zk9);
		listaKartona.add(zk10);
		
		int zbirOcena = 0;
		
		for (int i = 0; i < listaKartona.size(); i++) {
			zbirOcena = zbirOcena + listaKartona.get(i).getOcena();
		}
		double prosecnaOcena = 1.0 * zbirOcena / listaKartona.size();
		System.out.println("Prosecna ocena: " + prosecnaOcena);
		
		int brojPolozenihIspita = 0;
		int zbirOcenaPolozenihIspita = 0;
		for (int i = 0; i < listaKartona.size(); i++) {
			if (listaKartona.get(i).polozioIspit() == true) {
				zbirOcenaPolozenihIspita = zbirOcenaPolozenihIspita + listaKartona.get(i).getOcena();
				brojPolozenihIspita++;
			}
		}
		
		double prosecnaOcenaPolozenihIspita = 1.0 * zbirOcenaPolozenihIspita / brojPolozenihIspita;
		System.out.println("Prosecna ocena polozenih ispita: " + prosecnaOcenaPolozenihIspita);
	}

}
