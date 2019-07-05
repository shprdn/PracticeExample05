package com.stackroute.junitdemo;

import org.junit.*;

import java.util.Map;

import static org.junit.Assert.*;

public class CountStringTest {
    CountString obj;
    @Before
    public void setUp(){
        obj = new CountString();
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
        assertEquals(Map.of("one",true,"two",false,"three",true),obj.calculate("one one -one___two,,three,one @three*one?"));
    }
    @Test
    public void givenStringShouldReturnNull(){
        assertNull(obj.calculate(null));
    }
    @Test
    public void givenStringShouldReturnFalse(){
        assertEquals(Map.of("six",false,"four",false,"one",false,"two",false,"three",false,"five",false),obj.calculate("one two three four five six"));
    }
    @Test
    public void givenStringShouldReturnTrue(){
        assertEquals(Map.of("1",true,"3",true,"5",true),obj.calculate("1 3 3 1 5 5"));
    }

}