package com.example.demo.controller;

import com.example.demo.mapper.BookShelfDao;
import com.example.demo.mapper.Impl.BookShelfImpl;
import com.example.demo.mapper.Impl.UserDaoImpl;
import com.example.demo.mapper.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
//@RequestMapping(value = {"/url1"})
public class BookController {
    BookShelfDao dao = new BookShelfImpl();
    UserDao userDao = new UserDaoImpl();
//    //    @ResponseBody
//    @RequestMapping(value = {"/hello"}, method = {RequestMethod.GET, RequestMethod.POST})
//    public String sayHello() {
//        return "/static/index.html";
//    }

    @ResponseBody
    @RequestMapping(value = {"/getBooks"})
    public String sayHello1() throws Exception {
        return dao.getBooks().toString();
    }

    @RequestMapping(value ="/Login.html")
    public void index_js(@RequestParam(value = "username",required = false) String username,
                         @RequestParam(value = "password",required = false) String password,
                         @RequestParam(value = "e_mail",required = false) String e_mail) throws Exception {
        if(username!=null||password!=null||e_mail!=null){
            userDao.pushUser(username,password,e_mail);
        }
        else{
            System.out.println("Wrong_Page");//当添加return，，return页面变化
        }

    }

}
