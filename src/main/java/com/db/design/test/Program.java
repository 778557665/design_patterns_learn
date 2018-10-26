package com.db.design.test;


import java.math.BigDecimal;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入数字A");
            String numberA = scan.nextLine();
            BigDecimal a = new BigDecimal(numberA);
            System.out.println("请输入运算符");
            String operator = scan.nextLine();
            System.out.println("请输入数字B");
            String numberB = scan.nextLine();
            BigDecimal b = new BigDecimal(numberB);
            BigDecimal result = null;
            switch (operator){
                case "-":
                    result = a.subtract(b);
                    break;
                case "+":
                    result = a.add(b);
                    break;
                case "/":
                    result = a.divide(b);
                    break;
                case "*":
                    result = a.multiply(b);
                    break;
            }
            System.out.println("("+a+operator+b+")="+result);
        }catch (NumberFormatException e){
            System.out.println("请输入数字");
            e.printStackTrace();
        }

    }
}
