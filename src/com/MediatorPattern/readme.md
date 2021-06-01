## Mediator
```java
public abstract class Mediator {
    //信号灯发送状态
    public abstract void  trregister(TrafficLight t1);

    //转发状态
    public abstract void relay(TrafficLight t2, String light);
}
```

## ConcreteMediator
```java
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
```

## 抽象同事类：信号灯
```java
public abstract class TrafficLight {
    protected Mediator mediator;
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public  abstract void receive(String light);
    public  abstract void send(String light);
}
```

## 具体同事类：信号灯A
```java
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
```
## 具体同事类：信号灯B
```java
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
```

## 主函数
```java
public class MediatorPatternMain {
    public static void main(String[] args) {
        Mediator m=new ConcreteMediator();
        TrafficLight ta,tb;
        ta = new TrafficLightA();
        tb = new TrafficLightB();
        m.trregister(ta);
        m.trregister(tb);
        ta.send("红灯");
        System.out.println("-------------------");
        tb.send("绿灯");
    }
}
```