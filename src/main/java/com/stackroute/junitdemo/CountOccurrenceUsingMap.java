package com.stackroute.junitdemo;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceUsingMap {

    public Map<String, Integer> countString(String string)
        {
            //when string is null
            if(string==null)
                return null;
            Integer count = 0;
            //changing special characters to spaces
            String str = string.replaceAll("[^a-zA-Z0-9]"," ");
            String[] wordArray = str.split("\\s+");
            Map<String, Integer> map = new HashMap<>();
            //mapping elements
            for (String s : wordArray) {
                if (map.containsKey(s)) {
                    count = map.get(s) + 1;
                    map.put(s, count);

                } else {
                    map.put(s, 1);
                }
            }
            //returning the count
            return map;
        }
    }
