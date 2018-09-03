package com.yunda.boot.mybatis2.dao;

import com.yunda.boot.mybatis2.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/*
 * Description
 *@author Ruimeng
 *@Date 2018/9/3 14:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao dao ;
    @Test
    public void findUserById() {
        User result = dao.findUserById(123);
        System.out.print(result.toString());
        Assert.assertNotNull(result);
    }
    @Test
    public void testSaveUser() {
        User user = new User();
        user.setPassword("edcrf");
        user.setPhone("1881790807956");
        user.setUserId(125);
        user.setUserName("李广");
        dao.saveUser(user);
    }
}