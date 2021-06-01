package com.StatePattern;

public class NoCoffee implements State {
    Context context;

    public NoCoffee(Context context) {
        this.context = context;
    }

    @Override
    public void showMessage() {
        System.out.println("No Coffee");
    }

    @Override
    public void giveAnCupCoffee() {
        System.out.println("No Coffee1");
    }
}
