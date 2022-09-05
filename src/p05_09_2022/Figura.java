package p05_09_2022;

public abstract class Figura {
	
	public abstract double povrsina();
	
	public abstract double obim();
	
	public void stampaj() {
		System.out.println("Povrsina je " + povrsina());
		System.out.println("Obim je " + obim());
	}

}
