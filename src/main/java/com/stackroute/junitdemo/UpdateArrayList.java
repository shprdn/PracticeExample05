package com.stackroute.junitdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdateArrayList {
        public String operations(String[] str, int index, String item)
        {
            String st="";
            //in case string ,index or item is null
            if (str==null || index<0 || index>=str.length || item==null)
                return null;
            //converting string to list
            List<String> l = Arrays.asList(str);
            //list to arraylist
            ArrayList<String> li = new ArrayList<>(l);
            //removing element at index
            li.remove(index);
                st += li.toString();
            st = st +"\n";
            //adding element at index
            li.add(index,item);
                st += li.toString();
            st = st +"\n";
            //clearing the arraylist
            li.clear();
                st += li.toString();
            return st.trim();
        }

}
