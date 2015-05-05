/**
 * 
 */
package org.cuatrovientos.vector;

import java.util.Vector;

/**
 * Simple class to make us of Vector structure
 * @author Pello Altadill
 *
 */
public class VectorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vector<String> books = new Vector<String>();
		
		books.add("El juego de Ender");
		books.add("El hobbit");
		books.add("Fundación");
		
		System.out.println(books.elementAt(1));
		books.set(0, "El código da Vinci");
		System.out.println(books.elementAt(0));
		
		
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.elementAt(i));
		}
		
		for (String book: books) {
			System.out.println(book);
		}
		
		Vector<Book> myBooks = new Vector<Book>();
		Book oneBook = new Book("Hobbit","J.R.R Tolkien");
		Book otherBook = new Book("Fundación","Asimov");
		
		myBooks.add(oneBook);
		myBooks.add(otherBook);
		myBooks.add(new Book("Dune","F. Herbert"));
		
		for (Book book: myBooks) {
			System.out.println(book.toString());
		}
		
	}

}
