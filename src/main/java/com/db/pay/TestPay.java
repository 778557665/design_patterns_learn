package com.db.pay;

public class TestPay {

    public static void main(String[] args) {

        PayMent payMent = new AlipayPay();

        payMent.pay();
    }
}
