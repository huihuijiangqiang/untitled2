package com.MediatorPattern;

public abstract class TrafficLight {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public  abstract void receive(String light);
    public  abstract void send(String light);
}
