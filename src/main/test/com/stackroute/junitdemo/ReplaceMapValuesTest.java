package com.stackroute.junitdemo;

import org.junit.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ReplaceMapValuesTest {
    ReplaceMapValues obj;
    @Before
    public void setUp(){
        obj = new ReplaceMapValues();
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
    public void givenStringShouldReturnReplacedKey(){
        Map<String,String> map = new HashMap<>();
        map.put("val1","c++");
        map.put("val2","java");

        assertEquals(Map.of("val1"," ","val2","c++"),obj.mapping(map));
    }
    @Test
    public void givenStringShouldReturnNull(){
       // Map<String,String> map = new HashMap<>(null);
        assertNull(obj.mapping(null));
    }
    @Test
    public void givenStringShouldReturnSpecialChar(){
        Map<String,String> map = new HashMap<>();
        map.put("val1","()");
        map.put("val2","++");

        assertEquals(Map.of("val1"," ","val2","()"),obj.mapping(map));
    }
    @Test
    public void givenStringShouldReturnSpace(){
        Map<String,String> map = new HashMap<>();
        map.put("val1"," ");
        map.put("val2"," ");

        assertEquals(Map.of("val1"," ","val2"," "),obj.mapping(map));
    }

}