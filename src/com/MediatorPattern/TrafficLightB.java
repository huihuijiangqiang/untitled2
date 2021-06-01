package com.MediatorPattern;

public class TrafficLightB extends TrafficLight{
    @Override
    public void receive(String light) {
        if (light.equals("红灯")){
            System.out.println("Tb变为绿灯");
        }else  System.out.println("Tb变为红灯");
    }

    @Override
    public void send(String light) {

        System.out.println("Tb变为"+light);
        mediator.relay(this, light);
    }
}
