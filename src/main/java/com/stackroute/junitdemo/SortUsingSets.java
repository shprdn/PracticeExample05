package com.stackroute.junitdemo;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SortUsingSets {
    public ArrayList<String> sorting(Set<String> strings)
    {   //when set is null
        if (strings==null)
            return null;
        //when one or more element is null in set
        if (strings.contains(null))
           return null;        //sorting the set using treeset
        Set<String> set = new TreeSet<>(strings);
        //converting the set to arraylist
        ArrayList<String> arr = new ArrayList<>(set);
        //returning the arraylist
        return arr;

    }
}
