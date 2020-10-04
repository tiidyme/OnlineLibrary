package com.example.demo.mapper.Impl;

import com.example.demo.mapper.UserDao;
import com.example.demo.pojo.SqlSessionFactoryUtils;
import com.example.demo.pojo.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Override
    public List<User> getUsers() throws Exception {
        SqlSession sqlSession =  null;
        List<User> users ;
        try{
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            users = sqlSession.selectList("com.example.demo.mapper.UserDao.getUsers");
        }finally {
            if (sqlSession != null) {
                sqlSession.close();
            }

        }

        return users;
    }

    @Override
    public void pushUser(String user_name, String password, String e_mail) throws Exception {
        SqlSession sqlSession = null;
        User user = new User(user_name,password,e_mail);
        try{
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            sqlSession.insert("com.example.demo.mapper.UserDao.pushUser",user);
        }finally {
            if(sqlSession != null){
                sqlSession.commit();
                sqlSession.close();
            }
        }

    }
}
