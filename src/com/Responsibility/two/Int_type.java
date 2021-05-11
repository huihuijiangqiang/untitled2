package com.Responsibility.two;

public class Int_type implements Handler{
    private Handler handler;

    @Override
    public void handleRequest(String number) {
        //判断是否为INT
        String flag="2147483647";
        if (number.compareTo(flag)<=0){
            System.out.println("int");
        }else {
            System.out.println("不是int");
            if (handler!=null)
                handler.handleRequest(number);
        }



    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler=handler;
    }

   
}
