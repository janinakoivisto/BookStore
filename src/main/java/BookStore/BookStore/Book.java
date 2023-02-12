package BookStore.BookStore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	private String title;
	private String author;
	private int publicationYear;
	private int isbn;
	private double price;
	

	
	public Book() {}
	
		public Book(String title, String author, int publicationYear,
				int isbn, double price) {
			super();
			this.title = title;
			this.author = author;
			this.publicationYear = publicationYear;
			this.isbn = isbn;
			this.price = price;

			
		}
		
	public long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public int getIsbn() {
		return isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setId(long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	
	
	@Override
	public String toString() {
		
			return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publicationYear=" + publicationYear + " price =" + price + "]";		

	}
	
}
