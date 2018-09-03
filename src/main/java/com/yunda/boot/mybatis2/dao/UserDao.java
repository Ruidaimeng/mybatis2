package com.yunda.boot.mybatis2.dao;/*
 * Description
 *@author Ruimeng
 *@Date 2018/8/28 14:54
 */


import com.yunda.boot.mybatis2.dao.mapper.UserMapper;
import com.yunda.boot.mybatis2.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private UserMapper mapper ;

    public User findUserById (Integer id ){
       User user = mapper.findByUserId(id);
        return user ;
    }

     public void saveUser(User user){
          mapper.insertUser(user);
     }

}
