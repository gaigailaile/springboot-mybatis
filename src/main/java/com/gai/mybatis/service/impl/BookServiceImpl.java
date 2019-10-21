package com.gai.mybatis.service.impl;

import com.gai.mybatis.dao.BookMapper;
import com.gai.mybatis.entity.Book;
import com.gai.mybatis.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Created by gaigaicoming on 2019/10/21.
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper bookMapper;

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }
}
