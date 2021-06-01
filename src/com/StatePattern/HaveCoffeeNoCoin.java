package com.StatePattern;

public class HaveCoffeeNoCoin implements State {
    Context context;

    public HaveCoffeeNoCoin(Context context) {
        this.context = context;
    }

    @Override
    public void showMessage() {
        System.out.println("请您投入一元硬币");
    }

    @Override
    public void giveAnCupCoffee() {
        context.setState(context.s2);
    }
}
