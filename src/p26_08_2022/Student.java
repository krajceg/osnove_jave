package p26_08_2022;

public class Student extends Osoba {
	
	private String brojIndexa;
	private int dugZaSkolarinu;
	
	public Student(String punoIme, String jmbg, String brojIndexa, int dugZaSkolarinu) {
		super(punoIme, jmbg);
		this.brojIndexa = brojIndexa;
		this.dugZaSkolarinu = dugZaSkolarinu;
	}
	
	public void uplatiSkolarinu (int uplata) {
		this.dugZaSkolarinu = this.dugZaSkolarinu - uplata;
	}

	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Broj indeksa: " + this.brojIndexa);
		System.out.println("Dug za skolarinu: " + this.dugZaSkolarinu);
		System.out.println();
	}
}
