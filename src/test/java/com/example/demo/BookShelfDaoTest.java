package com.example.demo;

import com.example.demo.mapper.Impl.BookShelfImpl;
import com.example.demo.mapper.Impl.UserDaoImpl;
import com.example.demo.mapper.UserDao;
import com.example.demo.pojo.BookShelf;
import com.example.demo.mapper.BookShelfDao;
import com.example.demo.pojo.User;
import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BookShelfDaoTest {
    private BookShelfDao bookShelfDao;
    private UserDao userDao;

    @Test
    void contextLoads() throws Exception {
/*        bookShelfDao = new BookShelfImpl();
        BookShelf book = bookShelfDao.getBook("10001");
        List<BookShelf> books = bookShelfDao.getBooks();
        String g=book.toString();
        System.out.println(g);
        System.out.println(books);*/
        userDao = new UserDaoImpl();
        User user = null;
        userDao.pushUser("1472420911","1098407034","1472420911@qq.com");
        List<User> users = userDao.getUsers();
        System.out.println(users);


//        Thread ta = new Thread(() -> {
//            try {
//
//                List<BookShelf> books;
//                books = bookShelfDao.getBooks();
//                System.out.println(books);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        });
//        Thread tb = new Thread(() -> {
//            try {
//                List<BookShelf> books;
//                books = bookShelfDao.getBooks();
//                System.out.println(books);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        });
//        ta.start();
//        tb.start();
//        ta.join();
//        tb.join();

    }
}
