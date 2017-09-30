package AvinashSpringBoot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import AvinashSpringBoot.Spring5WebApp.Author;

@Component
public interface AuthorRepository extends CrudRepository<Author , Long> {

}
