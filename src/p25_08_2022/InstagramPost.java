package p25_08_2022;

import java.util.ArrayList;

public class InstagramPost {
	
	ArrayList<InstagramImage> nizSlika1 = new ArrayList<InstagramImage>();
	private String opisPost;
	
	public void dodajSliku(InstagramImage slika1) {
		this.nizSlika1.add(slika1);
	}
	
	public void stampaj () {
		for (int i = 0; i < nizSlika1.size(); i++) {
			System.out.println(this.nizSlika1.get(i).getPutanjaDoSlike());
			this.nizSlika1.get(i).stampaj();
			System.out.println();
		}
	}
}
