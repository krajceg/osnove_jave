package d18_08_2022;

public class Domaci2_FacebookPost {
	
	public String punoImePostera;
	public String punoImeProfila;
	public String tekstObjave;
	public int lajk;
	public int deljenje;
	
	
	public void like () {
	this.lajk++;
	}
	
	public void dislike () {
		this.lajk--;
		if (this.lajk < 0) {
			this.lajk = 0;
		}
	}
	
	public void share () {
		this.deljenje++;
	}
	
	public void print () {
		System.out.println(this.punoImePostera + " >>> " + this.punoImeProfila);
		System.out.println(this.tekstObjave);
		System.out.println("Likes " + this.lajk + " | Shares " + this.deljenje);
	}
	
	
	
}
