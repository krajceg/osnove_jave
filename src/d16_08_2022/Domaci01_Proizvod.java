package d16_08_2022;

public class Domaci01_Proizvod {

	public String nazivProizvoda;
	public double cenaProizvoda;
	public double tezinaProizvoda;

	public void stampa() {

		System.out.println(
				"{{" + this.nazivProizvoda + "}}, {{" + this.cenaProizvoda + "}}, {{" + this.tezinaProizvoda 
				+ "}}");

	}

	public double konvertuj(String jedinica) {
		if (jedinica.equals("kg")) {
			return (this.tezinaProizvoda / 1000);
		} else {
			return (this.tezinaProizvoda / 1000000);
		}
	}

}
