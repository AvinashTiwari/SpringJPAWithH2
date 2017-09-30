package AvinashSpringBoot.Spring5WebApp;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.stereotype.Component;
@Entity
@Component
public class Book {
	private String title;
	private String isbn;
	@OneToOne
	private Publisher publisher;
	
	@ManyToMany
	@JoinTable(name="author_book", joinColumns = @JoinColumn(name="book_id"), 
	inverseJoinColumns = @JoinColumn(name="authors_id"))
	private Set<Author> authors = new HashSet<>();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long id;
	public long getId() {
		return id;
	}
 
	public void setId(long id) {
		this.id = id;
	}

	
	
	public Book() {
		//();
	}

	public Book(String title, String isbn, Publisher publisher) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.publisher = publisher;
	}

	public Book(String title, String isbn, Publisher publisher, Set<Author> authors) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.publisher = publisher;
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthor(Set<Author> authors) {
		this.authors = authors;
	}
	
	
	

}
