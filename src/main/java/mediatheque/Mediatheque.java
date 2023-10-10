package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	private final PrintCatalogue printCatalogue = new PrintCatalogue();
	private final PrintBook printBook = new PrintBook();

	private final PrintCD printCD = new PrintCD();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.accept(printCatalogue);
	}
	
	public void printOnlyBooks() {
	for(Item i : items){
		i.accept(printBook);
	}
		/*
		//avec instanceof
		for (Item i : items)
			if (i instanceof Book)
				System.out.println(i);
		*/
	}

	public void printOnlyCDs() {
		for(Item i : items){
			i.accept(printCD);
		}
	}

}
