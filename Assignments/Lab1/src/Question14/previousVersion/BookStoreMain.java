package Question14.previousVersion;

public class BookStoreMain {
    public static void main(String[] args) {
        BookStore2 book1 = new BookStore2(12138, "java","kids","Patrick","chadia",100, 300);
        BookStore2 book2 = new BookStore2(12148, "javascrpt","Engineering","Patrick","chadia",50, 200);
        BookStore2 book3 = new BookStore2(12158, "c++","Story","Patrick","chadia",60, 100);

        book1.saleBook(400);
        book2.saleBook(20);
        book3.saleBook(5);
        System.out.println( "BookID: " +book1.getBookId()+" has " + book1.displayBookQuatity() + " Books");
        System.out.println("BookID: " +book2.getBookId()+" has " +book2.displayBookQuatity() + " Books");
        System.out.println("BookID: " +book3.getBookId()+" has " +book3.displayBookQuatity()+ " Books");
        System.out.println("Total Books sold: "+ BookStore2.trackSalesStatus());
    }

}
