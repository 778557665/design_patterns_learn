package com.db.design.flyweights;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {
    private Map<String,WebSite> map = new HashMap<>();

    public WebSite getWebSite(String key){
        if(!map.containsKey(key)){
            map.put(key,new ConcreteWebSite(key));
        }
        return map.get(key);
    }

    public Integer getWebSiteCount(){
        return map.size();
    }
}
