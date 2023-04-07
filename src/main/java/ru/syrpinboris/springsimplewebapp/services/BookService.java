package ru.syrpinboris.springsimplewebapp.services;

import ru.syrpinboris.springsimplewebapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
