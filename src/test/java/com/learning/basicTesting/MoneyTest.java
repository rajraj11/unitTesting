package com.learning.basicTesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {
    @Test
    public void constructorShouldSetAmountAndCurrency()
    {
        Money money=new Money(10,"USD");
        assertEquals(10,money.getAmount());
        assertEquals("USD",money.getCurrency());

        money=new Money(200,"EUR");
        assertEquals(200,money.getAmount());
        assertEquals("HII","EUR",money.getCurrency());
    }

}
