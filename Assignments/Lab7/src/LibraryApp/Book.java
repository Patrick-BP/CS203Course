package LibraryApp;

import java.io.Serializable;

import javax.imageio.metadata.IIOMetadataController;


public class Book extends publication implements java.io.Serializable {
	/**
	 * 
	 */
	 private static final long serialVersionUID = 6529685098267757690L;
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
