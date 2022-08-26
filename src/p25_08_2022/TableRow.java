package p25_08_2022;

import java.util.ArrayList;

public class TableRow {

	private ArrayList<String> nizCelija = new ArrayList<String>();

	public TableRow() {
	}

	public void addRowCell(String cell) {
		this.nizCelija.add(cell);
	}

	public void stampaj() {
		for (int i = 0; i < nizCelija.size(); i++) {
			System.out.print(this.nizCelija.get(i) + "\t\t|\t\t");
		}
		System.out.println();
	}
	
	public void printHTML() {
		System.out.print("<tr>");
		for (int i = 0; i < nizCelija.size(); i++) {
			System.out.print("<td>" + this.nizCelija.get(i) + "</td>");
		}
		System.out.println("</tr>");
	}
	
	public boolean celijaPostoji (String celija) {
		boolean postoji = false;
		for (int i = 0; i < nizCelija.size(); i++) {
			if (celija.equals(nizCelija.get(i))) {				
				postoji = true;
			}
		}
		return postoji;
	}

}
