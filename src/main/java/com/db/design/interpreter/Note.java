package com.db.design.interpreter;

import java.util.List;

public class Note extends AbstractExpression {


    @Override
    protected void execute(String playKey, String playValue) {

        String note = "";
        switch (playKey){
            case "C":
                note = "1";
                break;
            case "D":
                note = "2";
                break;
            case "E":
                note = "3";
                break;
            case "F":
                note = "4";
                break;
            case "G":
                note = "5";
                break;
            case "A":
                note = "6";
                break;
            case "B":
                note = "7";
                break;
        }
        System.out.println("音高：" + note);

    }
}
