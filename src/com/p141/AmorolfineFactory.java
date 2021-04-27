package com.p141;

public abstract class AmorolfineFactory {
    AmorolfineFactory(){
        System.out.println("生产了一个成分为:"+createDurg().chengFen+"含量为:"+createDurg().hanLiang+"的Amorolfine");
    }
    public abstract Drug createDurg();//工厂方法
}
