package p25_08_2022;

public class InstagramTag {
	
	private int xKoordinata;
	private int yKoordinata;
	private InstagramUser userTagovan;
	
	public InstagramTag(int xKoordinata, int yKoordinata, InstagramUser userTagovan) {
		this.xKoordinata = xKoordinata;
		this.yKoordinata = yKoordinata;
		this.userTagovan = userTagovan;
	}

	public int getxKoordinata() {
		return xKoordinata;
	}

	public int getyKoordinata() {
		return yKoordinata;
	}

	public InstagramUser getUserTagovan() {
		return userTagovan;
	}
	
	
	
}
