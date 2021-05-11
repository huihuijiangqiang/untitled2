package com.Responsibility.two;

public class long_type implements Handler{
    private Handler handler;

    @Override
    public void handleRequest(String number) {
        //判断是否为INT
        String flag="9223372036854774807";
        if (number.compareTo(flag)<=0){
            System.out.println("long");
        }else {
            System.out.println("不是long");
            if (handler!=null)
                handler.handleRequest(number);
        }



    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler=handler;
    }

   
}
