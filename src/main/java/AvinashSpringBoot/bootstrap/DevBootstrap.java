package AvinashSpringBoot.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import AvinashSpringBoot.Spring5WebApp.*;
import AvinashSpringBoot.repositories.AuthorRepository;
import AvinashSpringBoot.repositories.BookRepository;
import AvinashSpringBoot.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
	
	
   // @Autowired
	public DevBootstrap(AuthorRepository authorRepository, 
			BookRepository bookRepository,
			PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		// TODO Auto-generated method stub
		initData();
	}
	
	public void initData()
	{
		Publisher publisher = new Publisher();
		publisher.setName("Foo");
		publisherRepository.save(publisher);

		Author avinash = new Author("Avinash", "Tiwari");
		Book add = new Book( "Book1", "123",publisher);
		avinash.getBooks().add(add);
		add.getAuthors().add(avinash);
		
		authorRepository.save(avinash);
		bookRepository.save(add);
		
		System.out.println("This is had called init data");
		
		
		Author avinash1 = new Author("Avinash1", "Tiwari1");
		Book add1 = new Book( "Book1", "123", publisher);
		avinash1.getBooks().add(add1);
		add1.getAuthors().add(avinash1);
		authorRepository.save(avinash1);
		bookRepository.save(add1);
		
		
	}

}
