package d19_08_2022;

import java.util.ArrayList;


public class BrojPogodakaAliNisuNaMestu {

	private int brojOdigranihPokusaja;
	private String polje1;
	private String polje2;
	private String polje3;
	private String polje4;
	private String odigrano1;
	private String odigrano2;
	private String odigrano3;
	private String odigrano4;

	public void novaIgra(String polje1, String polje2, String polje3, String polje4) {
		this.polje1 = polje1;
		this.polje2 = polje2;
		this.polje3 = polje3;
		this.polje4 = polje4;
		this.brojOdigranihPokusaja = 0;
		this.odigrano1 = "";
		this.odigrano2 = "";
		this.odigrano3 = "";
		this.odigrano4 = "";
	}

	public void isGameOver() {
		if (this.brojOdigranihPokusaja == 6) {
			System.out.println("Kraj igre!");
		}
	}

	public void isWinner() {
		if (this.polje1.equals(odigrano1) && this.polje2.equals(odigrano2) && this.polje3.equals(this.odigrano3)
				&& this.polje4.equals(odigrano4)) {
			System.out.println("Cestitamo! Pobedili ste!");
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

		for (int i = 0; i < 4; i++) {
			for (int n = 0; n < 4; i++) {
				if (nizOdigrane.get(n) == nizTrazene.get(i) ) {
					if (n != i) {
						brojPogodakaAliNisuNaMestu++;
					}
				}
			}
		}
		return brojPogodakaAliNisuNaMestu;
	}


	public void stampaTrazenu() {
		System.out.println(this.polje1 + " | " + this.polje2 + " | " + this.polje3 + " | " + this.polje4);
	}

	public void stampaOdigranu() {
		System.out.print(this.odigrano1 + " | " + this.odigrano2 + " | " + this.odigrano3 + " | " + this.odigrano4);
	}
}

