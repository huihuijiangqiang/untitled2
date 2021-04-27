package com.p157;

public class DaDaDaFactory implements IGunFactory{
    @Override
    public IBullets createBullets() {
        return new  DaDaDaBullets();
    }

    @Override
    public IGun createGun() {
        return new  DaDaDaGun();
    }
}
