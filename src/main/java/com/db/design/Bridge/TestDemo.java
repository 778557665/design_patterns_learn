package com.db.design.Bridge;

public class TestDemo {
    public static void main(String[] args) {
        Bridge bridge = new MyBridge();
        MySqlDriver mySqlDriver = new MySqlDriver();
        bridge.setDriver(mySqlDriver);
        bridge.connect();

        SqlServer sqlServer = new SqlServer();
        bridge.setDriver(sqlServer);
        bridge.connect();
    }
}

interface Driver{
    //连接方法
    public void connect();
}

//mysql
class MySqlDriver implements Driver{

    public void connect() {
        System.out.println("这是mysql的连接方法");
    }
}

class SqlServer implements Driver{

    public void connect() {
        System.out.println("这是sqlserver的连接方法");
    }
}

//抽象桥梁类
abstract class Bridge {

    public Driver driver;

    public void connect(){
        driver.connect();
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}

class MyBridge extends Bridge{

}

