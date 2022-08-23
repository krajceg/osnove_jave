package p22_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Video video1 = new Video ("v6tuOipj5mk", "Ariana Grande - positions (official video)", 200, 10, 0, 1000);
		Video video2 = new Video ("HTdd8QxifbY", "Freddie Mercury - Living On My Own (1993 Remix Remastered)", 230, 100, 10, 20000);
		
		YoutubePlayer ytPlayer = new YoutubePlayer();
		ytPlayer.ucitajVideo(video1);
		
		ytPlayer.iscitaj();
		
		ytPlayer.pojacaj();
		ytPlayer.premotajUnapred();
		ytPlayer.premotajUnapred();
		ytPlayer.premotajUnapred();
		ytPlayer.aktivirajPrekoCelogEkranaMod();
		ytPlayer.postaviKvalitet(300);
		System.out.println();
		ytPlayer.iscitaj();
		System.out.println(ytPlayer.sherovanje());
		ytPlayer.smanji();
		ytPlayer.premotajUnazad();
		System.out.println();
		ytPlayer.iscitaj();
		System.out.println();
		ytPlayer.ucitajVideo(video2);
		ytPlayer.iscitaj();
	}

}
