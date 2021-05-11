package com.Responsibility.two;

import java.math.BigInteger;

public class bigInteger_type implements Handler{
    private Handler handler;

    @Override
    public void handleRequest(String number) {
        BigInteger n=new BigInteger(number);
        System.out.println(n.sqrt());

    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler=handler;
    }

   
}
