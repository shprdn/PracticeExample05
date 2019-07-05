package com.stackroute.junitdemo;

import java.util.HashMap;
import java.util.Map;

public class CountString {
    public Map<String,Boolean> calculate(String string)
    {
        //when string is null
        if(string==null)
            return null;
        Integer count;
        String str = string.replaceAll("[^a-zA-Z0-9]"," ");
        String[] wordArray = str.split("\\s+");
        Map<String,Boolean> map = new HashMap<>();
        for (String s: wordArray)
        {
            if(!map.containsKey(s))
            {
                map.put(s,false);
            }
            else
            {
                map.put(s,true);
            }
        }
        return map;

    }
}
