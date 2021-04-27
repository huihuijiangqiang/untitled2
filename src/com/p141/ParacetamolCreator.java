package com.p141;

public abstract class ParacetamolCreator extends Drug {
    public Drug createDurg(){
        return new Paracetamol();
    }
}
