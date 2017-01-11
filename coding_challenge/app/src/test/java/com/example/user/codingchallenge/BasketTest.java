package com.example.user.codingchallenge;
import org.junit.*;
import static org.junit.Assert.*;
/**
 * Created by user on 09/01/2017.
 */
public class BasketTest {

    Basket basket1;
    Item item1;
    Item item2;
    Item item3;
    Item item4;

    @Before
    public void before() {
        basket1=new Basket();
        item1 = new Item ("String", 0.99, false);
        item2 = new Item ("Cheese", 2.11, false);
        item3 = new Item ("Wine", 5.31, true);
        item4 = new Item ("Talisker Storm Whisky", 24.99, false );
    }

    @Test
    public void addItemToBasketTest(){
        basket1.addItem(item1);
        assertEquals(1, basket1.basketSize());
    }

    @Test
    public void removeItemFromBasketTest(){
        basket1.addItem(item1);
        basket1.addItem(item2);
        basket1.addItem(item3);
        assertEquals(4, basket1.basketSize());
        assertEquals(8.41, basket1.valueOfBasket(),0.01);
        basket1.removeItem(item1);
        basket1.removeItem(item3);
        assertEquals(1, basket1.basketSize());
        assertEquals(2.11,basket1.valueOfBasket(),0.01);
    }

    @Test
    public void emptyBasketTest(){
        basket1.addItem(item1);
        basket1.addItem(item2);
        assertEquals(2, basket1.basketSize());
        basket1.emptyBasket();
        assertEquals(0,basket1.basketSize());
    }

    @Test
    public void getValueOfBasketTest(){
        basket1.addItem(item1);
        basket1.addItem(item2);
        assertEquals(2, basket1.basketSize());
        assertEquals(3.10, basket1.valueOfBasket(),0.01);
    }

    @Test
    public void bogofTest(){
        basket1.addItem(item1);
        basket1.addItem(item3);
        assertEquals(3, basket1.basketSize());
        assertEquals(6.30,basket1.valueOfBasket(),0.01);
    }

    @Test
    public void discountOver20Test(){
        basket1.addItem(item4);
        basket1.addItem(item3);
        assertEquals(3, basket1.basketSize());
        assertEquals(27.27, basket1.valueOfBasket(),0.01);
    }

    @Test
    public void loyaltyDiscountTest(){
        basket1.addItem(item4);
        basket1.addItem(item3);
        Double value = basket1.valueOfBasket();

        assertEquals(26.72,basket1.loyaltyDiscount(value),0.01);
    }



}
