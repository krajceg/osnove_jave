package p19_08_2022;

public class Zadatak1_Tacka {
	
	private int x;
	private int y;
	
	public Zadatak1_Tacka () {
		
	}
	
	public void stampaj () {
		System.out.println("X: " + this.x);
		System.out.println("Y: " + this.y);
	}
	
	public Zadatak1_Tacka (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX (int x) {
		this.x = x;
	}
	
	public void setY (int y) {
		this.y = y;
	}
	
	public int getX () {
		return this.x;
	}
	
	public int getY () {
		return this.y;
	}
}
