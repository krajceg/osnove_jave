package d19_08_2022;

import java.util.ArrayList;
import java.util.Random;

public class SkockoGame {

	private int brojOdigranihPokusaja;
	private String polje1;
	private String polje2;
	private String polje3;
	private String polje4;
	private String odigrano1;
	private String odigrano2;
	private String odigrano3;
	private String odigrano4;

	public void novaIgra() {
		
		Random random = new Random();
		ArrayList<String> znakovi = new ArrayList<String>();
		
		znakovi.add("D");
		znakovi.add("K");
		znakovi.add("L");
		znakovi.add("S");
		znakovi.add("Z");
		znakovi.add("T");
		
		this.polje1 = znakovi.get(random.nextInt(5));
		this.polje2 = znakovi.get(random.nextInt(5));
		this.polje3 = znakovi.get(random.nextInt(5));
		this.polje4 = znakovi.get(random.nextInt(5));
		
		this.brojOdigranihPokusaja = 0;
		
		this.odigrano1 = "";
		this.odigrano2 = "";
		this.odigrano3 = "";
		this.odigrano4 = "";
	}

	public boolean isGameOver() {
		if (this.brojOdigranihPokusaja == 6) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isWinner() {
		if (this.polje1.equals(odigrano1) && this.polje2.equals(odigrano2) && this.polje3.equals(this.odigrano3)
				&& this.polje4.equals(odigrano4)) {
			return true;
		} else {
			return false;
		}
	}

	public void odigrajKombinaciju(String odigrano1, String odigrano2, String odigrano3, String odigrano4) {
		this.odigrano1 = odigrano1;
		this.odigrano2 = odigrano2;
		this.odigrano3 = odigrano3;
		this.odigrano4 = odigrano4;
		this.brojOdigranihPokusaja++;
	}

	public int brojPogodakaNaMestu() {
		int brojPogodakaNaMestu = 0;
		if (this.polje1.equals(odigrano1)) {
			brojPogodakaNaMestu++;
		}
		if (this.polje2.equals(odigrano2)) {
			brojPogodakaNaMestu++;
		}
		if (this.polje3.equals(odigrano3)) {
			brojPogodakaNaMestu++;
		}
		if (this.polje4.equals(odigrano4)) {
			brojPogodakaNaMestu++;
		}
		return brojPogodakaNaMestu;
	}

	public int brojPogodakaAliNisuNaMestu() {
		int brojPogodakaAliNisuNaMestu = 0;
		ArrayList<String> nizTrazene = new ArrayList<String>();
		ArrayList<String> nizOdigrane = new ArrayList<String>();

		nizTrazene.add(polje1);
		nizTrazene.add(polje2);
		nizTrazene.add(polje3);
		nizTrazene.add(polje4);

		nizOdigrane.add(odigrano1);
		nizOdigrane.add(odigrano2);
		nizOdigrane.add(odigrano3);
		nizOdigrane.add(odigrano4);

		for (int i = 0; i < nizTrazene.size(); i++) {
			for (int n = 0; n < nizOdigrane.size(); n++) {
				if (nizOdigrane.get(i).equals(nizTrazene.get(n)) && !nizOdigrane.get(n).equals(nizTrazene.get(n)) && !nizOdigrane.get(i).equals(nizTrazene.get(i))) {
					brojPogodakaAliNisuNaMestu++;
					nizTrazene.set(n, "");
					nizOdigrane.set(i, " ");
				}
			}

		}
		return brojPogodakaAliNisuNaMestu;
	}

	public void stampaTrazenu() {
		System.out.println("Trazena kombinacija:");
		System.out.println(this.polje1 + " | " + this.polje2 + " | " + this.polje3 + " | " + this.polje4);
	}

	public void stampaOdigranu() {
		System.out.print(this.odigrano1 + " | " + this.odigrano2 + " | " + this.odigrano3 + " | " + this.odigrano4);
	}

}
