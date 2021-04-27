package com.p141;

public abstract class AmorolfineCreator extends Drug {
    public Drug createDurg(){
        return new Amorolfine();
    }
}
