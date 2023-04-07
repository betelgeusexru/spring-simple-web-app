package ru.syrpinboris.springsimplewebapp.services;

import org.springframework.stereotype.Service;
import ru.syrpinboris.springsimplewebapp.domain.Book;
import ru.syrpinboris.springsimplewebapp.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
