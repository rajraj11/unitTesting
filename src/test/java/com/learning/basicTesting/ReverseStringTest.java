package com.learning.basicTesting;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void testReverseStringMethod()
    {
        Assert.assertEquals("abc",ReverseString.reverse("cba"));
        Assert.assertEquals("aaa",ReverseString.reverse("aaa"));
        Assert.assertEquals("xyz",ReverseString.reverse("zyx"));

    }

    @Test
    public void checkForEmptyString()
    {
        Assert.assertEquals("",ReverseString.reverse(""));
    }

    @Test(expected = NullPointerException.class)
    public void checkForNullValues()
    {
        ReverseString.reverse(null);
    }
}
