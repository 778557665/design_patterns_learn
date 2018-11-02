package com.db.design.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractExpression {

    public void interpreter(PlayContext playContext){
        String context = playContext.getText();
        if (context.length() == 0){
            return;
        }else {
//            String [] strings = context.split(" ");
//            List<String> playKey = new ArrayList<>();
//            List<String> playValue = new ArrayList<>();
//            for (int i = 0; i < strings.length; i++) {
//                String value = strings[i];
//                try{
//                    Integer.valueOf(value);
//                    playValue.add(value);
//                }catch (NumberFormatException e){
//                    playKey.add(value);
//                    continue;
//                }
//            }
//            execute(playKey,playValue);
//                String playKey = context.substring(0,2);
//                String playValue = context.substring(2,4);
//                playContext.setText(context.substring(4));
//                System.out.println(playContext.getText());

            String playKey = context.substring(0,1);
            String playText = context.substring(2);

            Double playValue = Double.valueOf(playText.substring(0,playText.indexOf(" ")));

            playContext.setText(playText.substring(playText.indexOf(" ") + 1));


            execute(playKey, Integer.toString(playValue.intValue()));


        }
    }

    protected abstract void execute(String playKey, String playValue);
}
