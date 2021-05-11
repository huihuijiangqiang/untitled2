package com.Responsibility.two;

public class Int_type implements Handler{
    private Handler handler;

    @Override
    public void handleRequest(String number) {
        //判断是否为INT
        String flag="2147483647";
        System.out.println(number.compareTo(flag));
        if (number.length()<flag.length()){
            System.out.println(Math.sqrt(Integer.parseInt(number)));
        }else if (number.length()==flag.length() && number.compareTo(flag)<0){
            System.out.println(Math.sqrt(Integer.parseInt(number)));
        }
        else {
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
