package com.Responsibility.two;

public class long_type implements Handler{
    private Handler handler;

    @Override
    public void handleRequest(String number) {
        //判断是否为INT
        String flag="9223372036854774807";
        if (number.length()<flag.length()){
            System.out.println(Math.sqrt(Long.parseLong(number)));
        }else if (number.length()==flag.length() && number.compareTo(flag)<0){
            System.out.println(Math.sqrt(Long.parseLong(number)));
        }
        else {
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
