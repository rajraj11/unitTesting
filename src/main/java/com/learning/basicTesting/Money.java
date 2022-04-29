package com.learning.basicTesting;

import java.util.Objects;

public class Money {
    private final int amount;
    private final String currency;

    public Money(int amount, String currency) {
        if(amount<0)
            throw new IllegalArgumentException("illegal amount :[ "+amount+"]");
        if(currency==null || currency.isEmpty())
            throw new IllegalArgumentException("illegal currency :[ "+currency +" ]");
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount && Objects.equals(currency, money.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }
}
