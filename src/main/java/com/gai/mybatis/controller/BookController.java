package com.gai.mybatis.controller;

import com.gai.mybatis.entity.Book;
import com.gai.mybatis.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gaigaicoming on 2019/10/21.
 */
@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping(value = "/bookOps")
    public int bookOps(){
        Book book = new Book();
        book.setName("西厢记");
        book.setAuthor("王实甫");
        return bookService.addBook(book);
    }
}
