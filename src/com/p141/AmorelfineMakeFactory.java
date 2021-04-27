package com.p141;

public class AmorelfineMakeFactory implements IDrugFactory{
    @Override
    public Drug getDurg() {
        return new Amorelfine();
    }
}
