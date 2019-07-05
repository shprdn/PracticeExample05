package com.stackroute.junitdemo;

import org.junit.*;

import static org.junit.Assert.*;

public class UpdateArrayListTest {
    UpdateArrayList obj;
    @Before
    public void setUp(){
        obj = new UpdateArrayList();
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
    public void givenStringShouldReturnValues() {
        String[] arr = {"Apple", "Grape", "Melon", "Berry"};
        String result = obj.operations(arr, 1, "Kiwi");
        assertEquals("[Apple, Melon, Berry]\n" +
                "[Apple, Kiwi, Melon, Berry]\n" +
                "[]", result);
    }
    @Test
    public void givenStringShouldReturnNullIndex(){
        String[] arr = {"Apple","Grape","Melon","Berry"};
        String result = obj.operations(arr,-2,"Kiwi");
        assertNull(result);
    }
    @Test
    public void givenStringShouldReturnNull()
    {
        String[] arr = null;
        String result = obj.operations(arr,3,"kiwi");
        assertNull(result);
    }
    @Test
    public void givenStringShouldReturnNoNewItem(){
        String[] arr = {"Apple","Grape","Melon","Berry"};
        String result = obj.operations(arr,5,null);
        assertNull(result);
    }
    @Test
    public void givenStringShouldReturnNumbers()
    {
        String[] arr = {"1","2","3","4","5"};
        String result = obj.operations(arr,2,"10");
       // String[] arr1 = {"[1, 2, 4, 5]\n"+"[1, 2, 10, 4, 5]\n"+"[]"};
        assertEquals("[1, 2, 4, 5]\n"+"[1, 2, 10, 4, 5]\n"+"[]",result);
    }
    @Test
    public void givenStringShouldReturnSpecialChar(){
        String[] arr = {"@","!","#","&","("};
        String result = obj.operations(arr,4,"_");
        assertEquals("[@, !, #, &]\n" +
                "[@, !, #, &, _]\n" +
                "[]",result);
    }

}