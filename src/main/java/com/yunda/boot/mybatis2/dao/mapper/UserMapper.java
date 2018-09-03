package com.yunda.boot.mybatis2.dao.mapper;/*
 * Description
 *@author Ruimeng
 *@Date 2018/8/28 14:55
 */


import com.yunda.boot.mybatis2.domain.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    //采用注解方式，sql语句直接写在方法上
/*@Select("select * from t_user where user_id = #{userId}")
    @Results({
            @Result(column="user_id",property="userId"),
            @Result(column="user_name",property="userName"),
            @Result(column="password",property="password"),
            @Result(column="phone",property="phone")
    })*/
    User findByUserId(Integer userId);

    //采用xml方式
    int insertUser(User user);
}
