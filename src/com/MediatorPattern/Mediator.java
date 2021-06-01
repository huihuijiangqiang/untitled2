package com.MediatorPattern;

/**
 * 抽象中介
 */
 public abstract class Mediator {
    //信号灯发送状态
    public abstract void  trregister(TrafficLight t1);

    //转发状态
    public abstract void relay(TrafficLight t2, String light);
}
