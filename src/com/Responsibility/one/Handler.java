package com.Responsibility.one;

public interface Handler{
    public abstract void handleRequest(String number);
    public abstract void setNextHandler(Handler handler);
}

