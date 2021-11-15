package LibraryApp;

import java.security.KeyStore.PrivateKeyEntry;

public class publication {
	private String name;
	private String publisher;
	private int id;
	private int qty;
	private String category;

	public publication(String name, String publisher, int id, int qty,String category) {
		this.name = name;
		this.publisher = publisher;
		this.id = id;
		this.qty = qty;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getId() {
		return id;
	}

	public int getQty() {
		return qty;
	}

	public String getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "id: " + id +"name: " + name + ", publisher: " + publisher + ", category: " + category +  ", qty: " + qty  ;
	}
}
