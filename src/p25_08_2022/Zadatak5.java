package p25_08_2022;

public class Zadatak5 {

	public static void main(String[] args) {
		
		TableHeader header = new TableHeader();
		
		header.addHeaderCell("First Name");
		header.addHeaderCell("Last Name");
		header.addHeaderCell("Age");
//		header.stampaj();
//		header.printHTML();
		
		TableRow row1 = new TableRow();
		TableRow row2 = new TableRow();
		TableRow row3 = new TableRow();
		
		TableRow row4 = new TableRow();
		TableRow row5 = new TableRow();
		TableRow row6 = new TableRow();
		
		TableRow row7 = new TableRow();
		TableRow row8 = new TableRow();
		TableRow row9 = new TableRow();
		
		TableRow row10 = new TableRow();
		TableRow row11 = new TableRow();
		TableRow row12 = new TableRow();
		
		TableRow row13 = new TableRow();
		TableRow row14 = new TableRow();
		TableRow row15 = new TableRow();
		
		TableRow row16 = new TableRow();
		TableRow row17 = new TableRow();
		
		row1.addRowCell("Milan     ");
		row1.addRowCell("Milic     ");
		row1.addRowCell("25");

		row2.addRowCell("Milan     ");
		row2.addRowCell("Jovanovic");
		row2.addRowCell("26");
		
		row3.addRowCell("Milan     ");
		row3.addRowCell("Zakic     ");
		row3.addRowCell("27");
		
		row4.addRowCell("Milan     ");
		row4.addRowCell("Milic     ");
		row4.addRowCell("27");

		row5.addRowCell("Milan     ");
		row5.addRowCell("Jovanovic");
		row5.addRowCell("27");
		
		row6.addRowCell("Milan     ");
		row6.addRowCell("Zakic     ");
		row6.addRowCell("27");
		
		row7.addRowCell("Milan     ");
		row7.addRowCell("Milic     ");
		row7.addRowCell("25");

		row8.addRowCell("Milan     ");
		row8.addRowCell("Jovanovic");
		row8.addRowCell("26");
		
		row9.addRowCell("Milan     ");
		row9.addRowCell("Zakic     ");
		row9.addRowCell("27");
		
		row10.addRowCell("Milan     ");
		row10.addRowCell("Milic     ");
		row10.addRowCell("27");

		row11.addRowCell("Milan     ");
		row11.addRowCell("Jovanovic");
		row11.addRowCell("27");
		
		row12.addRowCell("Milan     ");
		row12.addRowCell("Zakic     ");
		row12.addRowCell("27");
		
		row13.addRowCell("Milan     ");
		row13.addRowCell("Cukic     ");
		row13.addRowCell("27");
		
		row14.addRowCell("Milan     ");
		row14.addRowCell("Lakic     ");
		row14.addRowCell("27");
		
		row15.addRowCell("Milan     ");
		row15.addRowCell("Bozic     ");
		row15.addRowCell("27");
		
		row16.addRowCell("Sveta     ");
		row16.addRowCell("Bozic     ");
		row16.addRowCell("27");
		
		row17.addRowCell("Sveta     ");
		row17.addRowCell("Bozic     ");
		row17.addRowCell("27");
		
		Table tabela1 = new Table();
		
		tabela1.setTableHeader(header);
		tabela1.dodajRed(row1);
		tabela1.dodajRed(row2);
		tabela1.dodajRed(row3);
		tabela1.dodajRed(row4);
		tabela1.dodajRed(row5);
		tabela1.dodajRed(row6);
		tabela1.dodajRed(row7);
		tabela1.dodajRed(row8);
		tabela1.dodajRed(row9);
		tabela1.dodajRed(row10);
		tabela1.dodajRed(row11);
		tabela1.dodajRed(row12);
		tabela1.dodajRed(row13);
		tabela1.dodajRed(row14);
		tabela1.dodajRed(row15);
		tabela1.dodajRed(row16);
		tabela1.dodajRed(row17);
		
//		tabela1.stampaj();
//		tabela1.printHTML();
		tabela1.filter("Jovanovic");
		tabela1.stampaj(4);
		tabela1.stampaPaginator();
		
		

	}

}
