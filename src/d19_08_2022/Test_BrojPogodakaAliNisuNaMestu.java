package d19_08_2022;

import java.util.ArrayList;

public class Test_BrojPogodakaAliNisuNaMestu {

	public static void main(String[] args) {

		int brojPogodakaAliNisuNaMestu = 0;
		ArrayList<String> nizTrazene = new ArrayList<String>();
		ArrayList<String> nizOdigrane = new ArrayList<String>();

		nizTrazene.add("D");
		nizTrazene.add("D");
		nizTrazene.add("K");
		nizTrazene.add("D");

		nizOdigrane.add("T");
		nizOdigrane.add("K");
		nizOdigrane.add("D");
		nizOdigrane.add("A");

		System.out.println(nizTrazene + " Trazeni niz");
		System.out.println(nizOdigrane + " Odigrani niz");

		for (int i = 0; i < nizTrazene.size(); i++) {
			for (int n = 0; n < nizOdigrane.size(); n++) {
				if (nizOdigrane.get(i).equals(nizTrazene.get(n)) && !nizOdigrane.get(n).equals(nizTrazene.get(n)) && !nizOdigrane.get(i).equals(nizTrazene.get(i))) {
					brojPogodakaAliNisuNaMestu++;
					nizTrazene.set(n, "");
					nizOdigrane.set(i, " ");
				}
			}

		}

		System.out.println("Broj pogodaka ali nisu na mestu: " + brojPogodakaAliNisuNaMestu);

	}

}
