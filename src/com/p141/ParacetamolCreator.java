package com.p141;

public abstract class ParacetamolCreator extends ParacetamolFactory {
    public Drug createDurg(){
        return new Paracetamol();
    }
}
