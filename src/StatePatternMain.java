import com.StatePattern.Context;

public class StatePatternMain {
    public static void main(String[] args) {
        Context c = new Context();
        c.sellCoffee();
        c.needAnCoin();
        c.sellCoffee();
        c.needAnCoin();
        c.sellCoffee();
        c.needAnCoin();
    }
}
