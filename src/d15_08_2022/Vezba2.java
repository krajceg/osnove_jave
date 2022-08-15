package d15_08_2022;

import java.util.ArrayList;

public class Vezba2 {

	public static void main(String[] args) {
		
		ArrayList<String> bookmarks = new ArrayList<>();
        bookmarks.add("Apps");
        bookmarks.add("YouTube");
        bookmarks.add("Google");
        bookmarks.add("Gmail");
        bookmarks.add("Miro | Online Whiteboard for Visual Collaboration");
        bookmarks.add("Confluence");
        bookmarks.add("JIRA");
        bookmarks.add("Bitbucket");
        bookmarks.add("Google Calendar");
        bookmarks.add("Timesheet");
        bookmarks.add("Google Drive");
        bookmarks.add("IX CIKLUS");
        
        int limit = 3;
        int prikazanoB = 0;
        int prikazanoC = bookmarks.get(0).length();
        
        for (int i = 1; i < bookmarks.size(); i++) {
        	if ((prikazanoC + 5 + bookmarks.get(i).length()) <= limit) {
        		prikazanoC = prikazanoC + 5 + bookmarks.get(i).length();
        		prikazanoB++;
        	}
        	else {
        		break;
        	}
        }
        for (int i = 0; i <= prikazanoB; i++)
        	System.out.print(bookmarks.get(i) + "     ");
	}

}
