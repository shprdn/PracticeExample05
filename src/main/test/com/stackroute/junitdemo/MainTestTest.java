package com.stackroute.junitdemo;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class MainTestTest {
    MainTest obj;
    @Before
    public void setUp(){
        obj = new MainTest();
    }
    @After
    public void tearUp(){}
    @BeforeClass
    public static void setUpClass(){
        System.out.println("Before Class");
    }
    @AfterClass
    public static void tearUpClass(){
        System.out.println("After Class");
    }

    @Test
    public void givenStringShouldReturnOrder() {
        List<Student> al = new ArrayList<>();
        al.add(new Student(1,"Nilakshi",21));
        al.add(new Student(21,"Arpita",22));
        al.add(new Student(54,"Suchita",10));
        al.add(new Student(2,"Shubhi",20));
        al.add(new Student(60,"Shivani",70));
        assertEquals("[Student{id=54, name='Suchita', age=10}, Student{id=2, name='Shubhi', age=20}, Student{id=1, name='Nilakshi', age=21}, Student{id=21, name='Arpita', age=22}, Student{id=60, name='Shivani', age=70}]",obj.ordering(al).toString());
    }
    @Test
    public void givenStringShouldReturnNull(){
        //List<Student> al = null;
        assertNull(obj.ordering(null));
    }
    @Test
    public void givenStringShouldReturnSerialOrder() {
        List<Student> al = new ArrayList<>();
        al.add(new Student(1,"Nilakshi",21));
        al.add(new Student(-21,"Arpita",22));
        al.add(new Student(54,"Suchita",10));
        al.add(new Student(2,"Shubhi",20));
        al.add(new Student(60,"|$@#%&%",70));
        assertEquals("[Student{id=54, name='Suchita', age=10}, Student{id=2, name='Shubhi', age=20}, Student{id=1, name='Nilakshi', age=21}, Student{id=-21, name='Arpita', age=22}, Student{id=60, name='|$@#%&%', age=70}]",obj.ordering(al).toString());
    }
    @Test
    public void givenStringShouldReturnSameAge() {
        List<Student> al = new ArrayList<>();
        al.add(new Student(1,"Nilakshi",21));
        al.add(new Student(-21,"Arpita",21));
        al.add(new Student(54,"Suchita",10));
        al.add(new Student(2,"Shubhi",10));
        al.add(new Student(60,"|$@#%&%",70));
        assertEquals("[Student{id=2, name='Shubhi', age=10}, Student{id=54, name='Suchita', age=10}, Student{id=-21, name='Arpita', age=21}, Student{id=1, name='Nilakshi', age=21}, Student{id=60, name='|$@#%&%', age=70}]",obj.ordering(al).toString());
    }
    @Test
    public void givenStringShouldReturnSameName() {
        List<Student> al = new ArrayList<>();
        al.add(new Student(1,"Nilakshi",21));
        al.add(new Student(-21,"Nilakshi",21));
        al.add(new Student(54,"Suchita",10));
        al.add(new Student(2,"Shubhi",10));
        al.add(new Student(60,"|$@#%&%",70));
        assertEquals("[Student{id=2, name='Shubhi', age=10}, Student{id=54, name='Suchita', age=10}, Student{id=-21, name='Nilakshi', age=21}, Student{id=1, name='Nilakshi', age=21}, Student{id=60, name='|$@#%&%', age=70}]",obj.ordering(al).toString());
    }



}