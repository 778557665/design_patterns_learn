package com.db.design.interpreter;

public class Scale extends AbstractExpression {


    @Override
    protected void execute(String playKey, String playValue) {

        String scale = "";
        switch (playValue){
            case "1":
                scale = "低音";
                break;
            case "2":
                scale = "中音";
                break;
            case "3":
                scale = "高音";
                break;
        }
        System.out.println(scale);

    }
}
