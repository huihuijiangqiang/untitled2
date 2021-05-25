package com.MediatorPattern;

/**
 * 具体中介
 */

public class ConcreteMediator implements Mediator {
    TrafficLightA trafficLightA;
    TrafficLightB trafficLightB;
    public void registerTrafficLightA(TrafficLightA trafficLightA){
        this.trafficLightA=trafficLightA;
    }

    public void registerTrafficLightB(TrafficLightB trafficLightB){
        this.trafficLightB=trafficLightB;
    }

    @Override
    public void ChangeTrafficLight(TrafficLight trafficLight, String mess) {
        if (trafficLight==trafficLightA){

        }else {

        }
    }
}
