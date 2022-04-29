package com.learning.basicTesting;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;

@RunWith(JUnitParamsRunner.class)
public class MoneyParameterizedTest {
    public static final Object[] getMoney()
    {
        return new Object[]
                {
                        new Object[] {10,"INR"},
                        new Object[] {20,"EUR"},
                        new Object[] {30,"INR"}
                };
    }
    public static final Object[] getMoney2()
    {
        return $
                (
                        $(10,"USD"),
                        $(20,"EUR")
                );
    }
    @Test
    @Parameters(method = "getMoney")
    public void constructorShouldSetAmountAndCurrency(int amount,String currency)
    {
        Money money=new Money(amount,currency);
        Assert.assertEquals(amount,money.getAmount());
        Assert.assertEquals(currency,money.getCurrency());
    }

    @Test
    @Parameters(method = "getMoney2")
    public void constructorShouldSetAmountAndCurrency2(int amount,String currency)
    {
        Money money=new Money(amount,currency);
        Assert.assertEquals(amount,money.getAmount());
        Assert.assertEquals(currency,money.getCurrency());
    }
}
