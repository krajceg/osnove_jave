package p25_08_2022;

import java.util.ArrayList;

public class InstagramImage {
	
	private ArrayList<InstagramTag> nizTagova1 = new ArrayList<InstagramTag>();
	private int xSlike;
	private int ySlike;
	private String putanjaDoSlike;
	
	public InstagramImage(int xSlike, int ySlike, String putanjaDoSlike) {
		this.xSlike = xSlike;
		this.ySlike = ySlike;
		this.putanjaDoSlike = putanjaDoSlike;
	}

	public ArrayList<InstagramTag> getNizTagova1() {
		return nizTagova1;
	}

	public void setNizTagova1(ArrayList<InstagramTag> nizTagova1) {
		this.nizTagova1 = nizTagova1;
	}

	public int getxSlike() {
		return xSlike;
	}

	public void setxSlike(int xSlike) {
		this.xSlike = xSlike;
	}

	public int getySlike() {
		return ySlike;
	}

	public void setySlike(int ySlike) {
		this.ySlike = ySlike;
	}

	public String getPutanjaDoSlike() {
		return putanjaDoSlike;
	}

	public void setPutanjaDoSlike(String putanjaDoSlike) {
		this.putanjaDoSlike = putanjaDoSlike;
	}
	
	public void dodajTag (InstagramTag tag1) {	// mozda da se doda if da proveri x i y taga u odnosu na velicinu slike
		this.nizTagova1.add(tag1);
	}
	
	public void stampaj () {
		for (int i = 0; i < nizTagova1.size(); i++) {
			System.out.println(nizTagova1.get(i).getUserTagovan().getUsername() + " - " + nizTagova1.get(i).getUserTagovan().getPunoIme() + " (" + nizTagova1.get(i).getxKoordinata() + 
					", " + nizTagova1.get(i).getyKoordinata() + ")");
		}
	}
	
}
