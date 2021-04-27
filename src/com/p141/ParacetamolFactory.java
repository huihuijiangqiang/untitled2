package com.p141;

public abstract class ParacetamolFactory {
    ParacetamolFactory(){
        System.out.println("生产了一个成分为:"+createDurg().chengFen+"含量为:"+createDurg().hanLiang+"的Paracetamol");
    }
    public abstract Drug createDurg();//工厂方法
}
