package com.p157;

public class TuTuTuFactory implements IGunFactory{
    @Override
    public IBullets createBullets() {
        return  new  TuTuTuBullets();
    }

    @Override
    public IGun createGun() {
        return new  TuTuTuGun();
    }
}
