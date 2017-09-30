package AvinashSpringBoot.Spring5WebApp;

import java.util.*;

import javax.persistence.*;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long id;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String firstName;
	private String lastName;
	
	@ManyToMany(mappedBy ="authors")
	private Set<Book> books = new HashSet<>();
	
	
	
	

	public Author() {
		super();
	}

	public Author(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Author(String firstName, String lastName, Set<Book> books) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.books = books;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
	
	

}
