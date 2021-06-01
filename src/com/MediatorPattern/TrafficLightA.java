package com.MediatorPattern;

public class TrafficLightA extends TrafficLight{
    @Override
    public void receive(String light) {
        if (light.equals("红灯")){
            System.out.println("Ta变为绿灯");
        }else  System.out.println("Ta变为红灯");

    }

    @Override
    public void send(String light) {

        System.out.println("Ta变为"+light);
        mediator.relay(this,light);
    }
}
