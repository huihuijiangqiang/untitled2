package com.StatePattern;

public class Context {
    State state;
    State s1, s2, s3;

    public Context() {
        s1 = new HaveCoffeeNoCoin(this);

        s2 = new HaveCoffeeHaveCoin(this);
        s3 = new NoCoffee(this);
        state = s1;//初始状态
    }

    public void sellCoffee() {
        state.showMessage();
    }

    public void needAnCoin() {
        state.giveAnCupCoffee();
    }

    public void setState(State state) {
        this.state = state;
    }

}
