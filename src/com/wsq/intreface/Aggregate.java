package com.wsq.intreface;

//用于遍历的迭代器


import com.wsq.my_folder;


//所要遍历的接口

public interface Aggregate{

    void add(Aggregate var1);

    void remove(Aggregate var1);

    Aggregate getChild(int var1);

    Iterator<Aggregate> getAllChildren();

    boolean isLeaf();

    int getLength();

    String getName();

    String getTime();

    double getSize();
}