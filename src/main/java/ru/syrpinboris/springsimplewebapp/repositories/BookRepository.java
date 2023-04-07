package ru.syrpinboris.springsimplewebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.syrpinboris.springsimplewebapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
