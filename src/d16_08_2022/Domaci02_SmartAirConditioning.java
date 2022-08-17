package d16_08_2022;

public class Domaci02_SmartAirConditioning {

	public String markaKlime;
	public double temperatura;
	public String mod;

	public void stampa() {

		System.out.println("Marka klime: " + this.markaKlime);
		System.out.println("Temperatura klime: " + this.temperatura);
		System.out.println("Mod: " + this.mod);
	}

	public String provera(double tNapolju) {
		if (tNapolju > this.temperatura) {
			return "DA";
		} else {
			return "NE";
		}
	}

}
