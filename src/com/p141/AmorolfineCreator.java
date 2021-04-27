package com.p141;

public abstract class AmorolfineCreator extends AmorolfineFactory {
    public Drug createDurg(){
        return new Amorolfine();
    }
}
