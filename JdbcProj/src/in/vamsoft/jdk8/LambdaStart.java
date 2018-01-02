package in.vamsoft.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

class Book{
	int bookId;
	String author;
	String title;
	double price;
	
	public Book(int bookId, String author, String title, double price) {
		super();
		this.bookId = bookId;
		this.author = author;
		this.title = title;
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", author=" + author + ", title=" + title + ", price=" + price + "]";
	}
	
	
}

public class LambdaStart {


	public static void main(String[] args) {
		Book b1=new Book(1, "Origin", "Dan Brown",100);
		Book b2=new Book(2, "Two States", "chetan Bhagat",200);
		Book b3=new Book(3, "Daddy", "Sidney",300);
		
		//using stream
		
		List<Book> books=Arrays.asList(b1,b2,b3);
		
		/*Stream<Book> myBooks=books.stream();
		
		Stream<Book> priceBooks=myBooks.filter(b->b.getPrice()>200);
		priceBooks.forEach(b->System.out.println(b.toString()));
		
		//sorting of books
		
		Collections.sort(books,(Book obj1,Book obj2)  -> {
			return obj1.getTitle().compareTo(obj2.getTitle());
		});
		System.out.println(books);
		
		
		Collections.sort(books,(obj1,obj2)-> obj1.getAuthor().compareTo(obj2.getAuthor()));
		System.out.println(books);*/
		
		books.stream().map(b->b.getTitle().toUpperCase()).forEach(t->System.out.println(t));
		
		//Collections.sort(books,(Book obj1,Book obj2) ->{(Double)obj1.getPrice()).compareTo((Double)obj2.getPrice()});
			
		
		

	}

}
