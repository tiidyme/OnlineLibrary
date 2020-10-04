package com.example.demo.mapper;

import com.example.demo.pojo.BookShelf;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookShelfDao{
    List<BookShelf> getBooks() throws Exception;
    BookShelf getBook(String ISBN) throws Exception;
}

