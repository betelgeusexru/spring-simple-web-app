package ru.syrpinboris.springsimplewebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.syrpinboris.springsimplewebapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}