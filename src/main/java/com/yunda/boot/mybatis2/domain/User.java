package com.yunda.boot.mybatis2.domain;/*
 * Description
 *@author Ruimeng
 *@Date 2018/8/28 14:46
 */

public class User {
     /* `user_id` int(11) NOT NULL AUTO_INCREMENT,
     `user_name` varchar(255) NOT NULL,
    `password` varchar(255) NOT NULL,
     `phone` varchar(255) NOT NULL,*/
     private Integer userId ;
     private String userName ;
     private String  password ;
     private String phone ;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
