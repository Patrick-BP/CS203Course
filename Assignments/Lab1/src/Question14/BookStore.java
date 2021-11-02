package Question14;

public class BookStore {
    private long bookId ;
   private String bookCategeory, Author, Title, Publisher;
   private double price;
   private int qty;
  private  static int bookSold = 0;

    public BookStore(long bookId, String title, String bookCategeory, String author, String publisher, double price, int qty) {
        this.bookId = bookId;
        this.bookCategeory = bookCategeory;
        Author = author;
        Title = title;
        Publisher = publisher;
        this.price = price;
        this.qty = qty;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getBookCategeory() {
        return bookCategeory;
    }

    public void setBookCategeory(String bookCategeory) {
        this.bookCategeory = bookCategeory;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int saleBook(int numberOfBooks){
        if(this.qty>numberOfBooks) {
            this.qty -= numberOfBooks;
            this.bookSold += numberOfBooks;
            return bookSold;
        }
        else return 0 ;
    }

   public static  int trackSalesStatus(){
       return bookSold;
    }
    public int displayBookQuatity(){
       return this.qty;
    }
}
