package com.p141;

public class ParacetamolMakeFactory implements IDrugFactory{
    @Override
    public Drug getDurg() {
        return new Paracetamol();
    }
}
