package com.p170;

public class GeometryDirector {
    public Geometry constructGeometry(GeometryBuilder gb){
        gb.buildCircular();
        gb.buildTriangle();
        gb.buildRectangle();
        return gb.buildGeometry();
    }
}
