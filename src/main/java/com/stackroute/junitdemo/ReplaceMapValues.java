package com.stackroute.junitdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ReplaceMapValues {
    public Map<String,String> mapping(Map<String,String> map)
    {
         //in case map is null
            if (map==null)
                return null;
            String str = map.get("val1");       //getting the value of key val1
            map.replace("val1"," ");            // replacing the value of val2 with val1
            map.replace("val2",str);            // replacing the value of val1 with space
            return map;
    }
}
