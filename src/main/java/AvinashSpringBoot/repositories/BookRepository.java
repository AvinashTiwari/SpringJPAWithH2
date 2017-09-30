package AvinashSpringBoot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import AvinashSpringBoot.Spring5WebApp.*;
@Component
public interface BookRepository extends CrudRepository<Book , Long> {

}
