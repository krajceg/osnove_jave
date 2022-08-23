package d22_08_2022;

public class Vaga {
	
	private String mernaJedinica;
	private Proizvod proizvod;
	
	public Vaga(String mernaJedinica, Proizvod proizvod) {
		this.mernaJedinica = mernaJedinica;
		this.proizvod = proizvod;
	}

	public String getMernaJedinica() {
		return mernaJedinica;
	}

	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	
	public double sracunajCenu (double tezina) {
		if (this.mernaJedinica.equals("kg")) {
			return tezina * proizvod.getCenaKg();
		}
		else {
			return tezina * proizvod.getCenaLb();
		}
	}
	
	public void stampaj(double tezina) {
		this.proizvod.stampa();
		if (this.mernaJedinica.equals("kg")) {
			System.out.println("(" + proizvod.getCenaKg() + "din) (" + this.mernaJedinica + ") x (" + tezina + ")");
		}
		else {
			System.out.println("(" + proizvod.getCenaLb() + "din) (" + this.mernaJedinica + ") x (" + tezina + ")");
		}
		System.out.println("Ukupno: (" + sracunajCenu(tezina) + "din)");
	}
	
	
}
