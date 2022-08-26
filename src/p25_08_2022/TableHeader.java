package p25_08_2022;

import java.util.ArrayList;

public class TableHeader {

	private ArrayList<String> nizCelija = new ArrayList<String>();

	public TableHeader() {
	}

	public void addHeaderCell(String cell) {
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
			System.out.print("<th>" + this.nizCelija.get(i) + "</th>");
		}
		System.out.println("</tr>");
	}
}
