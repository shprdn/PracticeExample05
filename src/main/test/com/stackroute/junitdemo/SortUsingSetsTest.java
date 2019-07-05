package com.stackroute.junitdemo;

import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

public class SortUsingSetsTest {
    SortUsingSets obj;
    @Before
    public void setUp(){
        obj = new SortUsingSets();
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
    //counts the total number of occurrences of different strings
    @Test
    public void givenStringShouldReturnCount() {

        Set<String> hashset = new HashSet<>();
        hashset.add("Harry");
        hashset.add("Olive");
        hashset.add("Bluto");
        hashset.add("Eugene");
        hashset.add("Alice");
        ArrayList<String> a = new ArrayList<>();
        a.add("Alice");
        a.add("Bluto");
        a.add("Eugene");
        a.add("Harry");
        a.add("Olive");
        assertEquals(a,obj.sorting(hashset));
    }
    @Test
    public void givenStringShouldReturnNull() {
        assertNull(obj.sorting(null));
    }
    @Test
    public void givenStringShouldReturnNum(){
        Set<String> hashset = new HashSet<>();
        hashset.add("23");
            hashset.add("54");
            hashset.add("(");
            hashset.add("%");
            hashset.add("ft");
            ArrayList<String> a = new ArrayList<>();
        a.add("%");
        a.add("(");
        a.add("23");
        a.add("54");
        a.add("ft");
        assertEquals(a,obj.sorting(hashset));
    }

}