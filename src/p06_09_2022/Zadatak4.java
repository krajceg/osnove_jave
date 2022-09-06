package p06_09_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Disciplina disciplina1 = new Disciplina("skok u dalj", "skakacka");
		Disciplina disciplina2 = new Disciplina("100m sa preponama", "trkacka");
		
		Skakac skakac1 = new Skakac("Svetolik Kljajic", 1);
		Skakac skakac2 = new Skakac("Pera Peric", 3);
		Skakac skakac3 = new Skakac("Milan Milic", 2);
		Skakac skakac4 = new Skakac("Marko Markic", 5);
		Skakac skakac5 = new Skakac("Zuza Zuzic", 4);
		
		disciplina1.dodajAtleticara(skakac1);
		disciplina1.dodajAtleticara(skakac2);
		disciplina1.dodajAtleticara(skakac3);
		disciplina1.dodajAtleticara(skakac4);
		disciplina1.dodajAtleticara(skakac5);
		
		Trkac trkac1 = new Trkac("Mitar Miric", 14);
		Trkac trkac2 = new Trkac("Dzoni Blaze", 10);
		Trkac trkac3 = new Trkac("Miroslav Ilic", 15);
		Trkac trkac4 = new Trkac("Tozovac", 16);
		Trkac trkac5 = new Trkac("Aca Lukas", 25);
		
		disciplina2.dodajAtleticara(trkac1);
		disciplina2.dodajAtleticara(trkac2);
		disciplina2.dodajAtleticara(trkac3);
		disciplina2.dodajAtleticara(trkac4);
		disciplina2.dodajAtleticara(trkac5);
		
		disciplina1.podaciPobednika();
		System.out.println();
		disciplina2.podaciPobednika();

	}

}
