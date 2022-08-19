package d19_08_2022;

public class Domaci1 {

	public static void main(String[] args) {
		
		FacebookPost post1 = new FacebookPost ("Svetolik Kljajic", "Pera Peric", "Ide nevreme");
		
		post1.like();
		post1.like();
		post1.share();
		
		post1.print();
		
		
		FacebookPost post2 = new FacebookPost ("Nikola Nikolic", "Jovan Jovic", "Ne znam de teram");
		
		post2.like();
		post2.share();
		post2.share();
		
		post2.print();
		
		

	}

}
