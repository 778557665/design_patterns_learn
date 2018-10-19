package com.db.design.prototype;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMail {

    @Test
    public void test(){
        int i = 0;
        int MAX_COUNT = 10;
        Mail mail = new Mail("结婚","杭州","10月20号","bob");
        String nameList [] = {"a1","a2","a3","a4","a5","a6","a7","a8","a9","a10"};
        while (i < MAX_COUNT) {
            Mail cloneMail = null;
            try {
                cloneMail = mail.clone();
                cloneMail.setName(nameList[i]);
                System.out.println(cloneMail.toString());
                i++;
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }
}

