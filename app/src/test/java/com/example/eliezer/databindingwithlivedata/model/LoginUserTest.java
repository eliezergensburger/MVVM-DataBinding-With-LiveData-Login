package com.example.eliezer.databindingwithlivedata.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginUserTest {

    private  LoginUser loginUser = new LoginUser("kuku@gmail.com","a123456Z");
    @Test
     void getStrEmailAddress() {
        String actual = loginUser.getStrEmailAddress();
        System.out.println("eize yofi");
        assertEquals("kuku@gmail.com", actual);
        assertEquals(123.0001,123,0.001);
    }

    @Test
     void getStrPassword() {
    }

    @Test
     void isEmailValid() {
    }

    @Test
      void isPasswordLengthGreaterThan5() {
    }
}