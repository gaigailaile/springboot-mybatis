package com.gai.mybatis.dao;

import com.gai.mybatis.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2019/10/21.
 */
@Mapper
@Component
public interface BookMapper {
    int addBook(Book book);
}
