package LibraryApp;

import java.io.Serializable;

public class Book extends publication implements Serializable {
	String genre;

	public Book(String name, String publisher, int id, int qty, String category, String genre) {
		super(name, publisher, id, qty, category);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	@Override
	public String toString() {
		return super.toString()+ "genre: " + genre;
	}
}
