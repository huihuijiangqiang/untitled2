package com.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介
 */

public class ConcreteMediator extends Mediator {
    private List<TrafficLight> t= new ArrayList<TrafficLight>();


    @Override
    public void trregister(TrafficLight t1) {
        if (!t.contains(t1)){
            t.add(t1);
            t1.setMediator(this);
        }
    }

    @Override
    public void relay(TrafficLight t2, String light) {
        for (TrafficLight ob: t){
            if (!ob.equals(t2)) ((TrafficLight) ob).receive(light);
        }
    }
}
