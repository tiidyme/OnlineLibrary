package com.example.demo.mapper.Impl;

import com.example.demo.pojo.BookShelf;
import com.example.demo.mapper.BookShelfDao;
import com.example.demo.pojo.SqlSessionFactoryUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class BookShelfImpl implements BookShelfDao {
    @Override
    public List<BookShelf> getBooks() throws Exception {

        SqlSession sqlSession = null;
        List<BookShelf> books;
        try{
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            books = sqlSession.selectList("com.example.demo.mapper.BookShelfDao.getBooks");
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }

        }
        return books;
    }

    @Override
    public BookShelf getBook(String ISBN) throws Exception {
        SqlSession sqlSession = null;
        BookShelf bookShelf = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            bookShelf = sqlSession.selectOne("com.example.demo.mapper.BookShelfDao.getBook", ISBN);
        } finally {
            if(sqlSession != null)
            sqlSession.close();
        }
        return bookShelf;
//        try{
//            InputStream inputStream =Resources.getResourceAsStream("mybatis-config.xml");
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
//            sqlSession = factory.openSession();
//            bookShelf = sqlSession.selectOne("com.example.demo.mapper.BookShelfDao.getBook", ISBN);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (sqlSession != null) {
//                sqlSession.close();
//            }
//
//        }
    }
}
 