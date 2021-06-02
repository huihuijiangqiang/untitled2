package com.StatePattern;

public class HaveCoffeeHaveCoin implements State {
    Context context;

    public HaveCoffeeHaveCoin(Context context) {
        this.context = context;
    }

    @Override
    public void showMessage() {
        System.out.println("售出一杯咖啡");

    }

    @Override
    public void giveAnCupCoffee() {
        System.out.println("现在不允许投币");
        context.setState(context.s3);
    }
}
