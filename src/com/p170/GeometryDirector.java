package com.p170;

//Director 指挥者 构建一个使用Builder接口的对象

public class GeometryDirector {
    public Geometry constructGeometry(GeometryBuilder gb){
        gb.buildCircular();
        gb.buildTriangle();
        gb.buildRectangle();
        return gb.buildGeometry();
    }
}
