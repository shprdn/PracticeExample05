package com.stackroute.junitdemo;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getAge()==o2.getAge())
        {
            if (o1.getName()==o2.getName())
            {
                if (o1.getId()==o2.getId())
                    return 0;
                else if (o1.getId()>o2.getId())
                    return 1;
                else
                    return -1;
            }
            else if (o1.getName().equals(o2.getName()))
                return 1;
            else
                return -1;
        }
         //   return 0;
        else if (o1.getAge()>o2.getAge())
            return 1;
        else
            return -1;
    }
}
