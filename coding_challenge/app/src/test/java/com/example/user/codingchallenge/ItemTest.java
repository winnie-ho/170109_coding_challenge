package com.example.user.codingchallenge;
import org.junit.*;
import static org.junit.Assert.*;
/**
 * Created by user on 09/01/2017.
 */
public class ItemTest {

    Item item1;
    Item item2;

    @Before
    public void before(){
        item1 = new Item ("Apples", 0.95, false);
        item2 = new Item ("Toothbrush", 2.75, false);
    }

    @Test
    public void getNameTest(){
        assertEquals("Apples", item1.getName());
        assertEquals("Toothbrush", item2.getName());
    }

    @Test
    public void getPriceTest(){
        assertEquals(0.95, 1, item1.getPrice());
        assertEquals(2.75, 1, item2.getPrice());
    }

    @Test
    public void getBogofTest(){
        assertEquals(false, item1.getBogof());
    }

}
