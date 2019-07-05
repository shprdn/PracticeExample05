package com.stackroute.junitdemo;

import java.util.Collections;
import java.util.List;

public class MainTest {
    public List<Student> ordering(List<Student> li)
    {
        if (li==null)
            return null;
        li.sort(new StudentSorter());
        return li;
    }
}
