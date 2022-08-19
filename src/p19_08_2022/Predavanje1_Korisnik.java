package p19_08_2022;

public class Predavanje1_Korisnik {

	private String ime;
	private String prezime;
	private String email;
	
	
//	 difoltni konstruktor
	public Predavanje1_Korisnik () {
		
		
	}
	
//	 konstruktor sa parametrima
	 public Predavanje1_Korisnik (String i, String p, String e) {
		 this.ime = i;
		 this.prezime = p;
		 this.email = e;
	 }
	 
	 public Predavanje1_Korisnik (String ime) {
		 this.ime = ime;
	 }
	 
	 public void stampaj() {
		 System.out.println("ime");
	 }
	 
	 public void setIme (String ime) {
		 this.ime = ime;
	 }
	 
	 public void setPrezime (String prezime) {
		 this.prezime = prezime;
	 }
	 
	 public void setEmail (String email) {
		 this.email = email;
	 }
	 
	 public String getIme () {
		 return this.ime;
	 }
	 
	 public String getPrezime() {
		 return this.prezime;
	 }
	 
	 
//	 public void setNazivAtributa(tipAtributa nazivAtributa) {
//		 this.NazivAtribut = nazivAtributa;
//	 }
	 
	 
}
