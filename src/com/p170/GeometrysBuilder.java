package com.p170;

public class GeometrysBuilder implements GeometryBuilder{
    Geometry geometry;

    public GeometrysBuilder() {
        geometry=new Geometrys();
    }

    @Override
    public void buildTriangle() {
        geometry.setTriangle("建造三角形");
    }

    @Override
    public void buildRectangle() {
        geometry.setRectangle("建造长方形");
    }

    @Override
    public void buildCircular() {
        geometry.setCircular("建造原型");
    }

    @Override
    public Geometry buildGeometry() {
        return geometry;
    }
}
