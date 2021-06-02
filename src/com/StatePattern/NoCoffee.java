package com.StatePattern;

public class NoCoffee implements State {
    Context context;

    public NoCoffee(Context context) {
        this.context = context;
    }

    @Override
    public void showMessage() {
        System.out.println("没有咖啡");
    }

    @Override
    public void giveAnCupCoffee() {
        System.out.println("投币也没有咖啡");
    }
}
