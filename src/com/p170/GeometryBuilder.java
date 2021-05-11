package com.p170;


// Builder 抽象生成器 为创建一个Product对象的各个部件指定抽象接口
public interface GeometryBuilder {
    void buildTriangle();//三角形
    void buildRectangle();//长方形
    void buildCircular();//原型
    Geometry buildGeometry();
}
