package com.stackroute.junitdemo;

import org.junit.*;

import java.util.Map;

import static org.junit.Assert.*;

public class CountOccurrenceUsingMapTest {
    CountOccurrenceUsingMap obj;
    @Before
    public void setUp(){
        obj = new CountOccurrenceUsingMap();
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
       assertEquals(Map.of("one",5,"two",2,"three",2),obj.countString("one one -one___two,,three,one @three*one?two"));
    }
    @Test
    public void givenStringShouldReturnNull(){
        assertNull(obj.countString(null));
    }
    @Test
    public void givenStringShouldReturnZero(){
        assertEquals(Map.of("six",1,"four",1,"one",1,"two",1,"three",1,"five",1),obj.countString("one two three four five six"));
    }
    @Test
    public void givenStringShouldReturnNum(){
        assertEquals(Map.of("1",1,"2",1,"3",1,"4",1,"5",1),obj.countString("1 2 3 4 5"));
    }
}