package com.learning.basicTesting;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClientTest {
    private Address addressA=new Address("street A");
    private Address addressB=new Address("street_B");

    private Client client;

    @Before
    public void setUp()
    {
        client=new Client();
    }

    @Test
    public void afterCreationShouldHaveNoAddress()
    {

        Assert.assertEquals(0,client.getAddresses().size());
    }

    @Test
    public void shouldAllowToAddress()
    {
        client.setAddresses(addressA);
        Assert.assertEquals(true,client.getAddresses().contains(addressA));
    }

    @Test
    public void shouldAllowtoAddManyAddresses()
    {
        client.setAddresses(addressA);
        client.setAddresses(addressB);
        Assert.assertEquals(2,client.getAddresses().size());
    }

}
