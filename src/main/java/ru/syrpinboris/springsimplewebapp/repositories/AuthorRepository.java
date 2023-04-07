package ru.syrpinboris.springsimplewebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.syrpinboris.springsimplewebapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
