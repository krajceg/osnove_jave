package d18_08_2022;

public class Domaci3_SmartAirConditioning {
	
	public String marka;
	public double potrosnjaHladi;
	public double potrosnjaGreje;
	public double temperatura;
	public String mod;
	
	
	
	public void stampa () {
		System.out.println(this.marka + " - " + this.mod + " - " + this.temperatura + "c");
	}
	
	public double potrosnjaMetoda () {
		if (this.mod.equals("hladi")) {
			return (30 * 15 * this.potrosnjaHladi);
		}
		else {
			return (30 * 15 * this.potrosnjaGreje);
		}
	}
	
	public double racunMetoda () {
		if (potrosnjaMetoda() <= 350) {
			return potrosnjaMetoda() * 6;
		}
		else {
			return (350 * 6) + ((potrosnjaMetoda() - 350) * 9); 
		}
	}
	
}
