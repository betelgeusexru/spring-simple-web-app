package ru.syrpinboris.springsimplewebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.syrpinboris.springsimplewebapp.services.BookService;

/**
 * Created by jt, Spring Framework Guru.
 */
@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {

        model.addAttribute("books", bookService.findAll());

        return "books";
    }

}