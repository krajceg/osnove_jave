package p22_08_2022;

public class Reziser {
	
	private String punoIme;
	private int starost;
	
	public void reziser (String punoIme, int starost) {
		this.punoIme = punoIme;
		this.starost = starost;
	}
	
	public String getPunoIme () {
		return this.punoIme;
	}
	
	public int getStarost () {
		return this.starost;
	}
	
	public void setPunoIme (String punoIme) {
		this.punoIme = punoIme;
	}
	
	public void setStarost (int starost) {
		this.starost = starost;
	}
	
	public void printReziser () {
		System.out.println(this.punoIme + ", " + this.starost);
	}
	
}
