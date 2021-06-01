import com.MediatorPattern.*;


public class MediatorPatternMain {
    public static void main(String[] args) {
        Mediator m=new ConcreteMediator();
        TrafficLight ta,tb;
        ta = new TrafficLightA();
        tb = new TrafficLightB();
        m.trregister(ta);
        m.trregister(tb);
        ta.send("绿灯");
        System.out.println("-------------------");
        tb.send("绿灯");

    }
}
