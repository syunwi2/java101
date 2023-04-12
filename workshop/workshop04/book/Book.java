package book;

public class Book {
	// instance variable
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;

	// constructor
	public Book() {}
	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	// getter and setter methods for variables
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	// return discounted price of book, as double
	public double getDiscountBookPrice() {
		double price = (double)this.bookPrice - this.bookPrice * (this.bookDiscountRate / 100);
		
		return price;
	}
	
}
