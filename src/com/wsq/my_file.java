package com.wsq;

import com.wsq.intreface.Aggregate;
import com.wsq.intreface.Iterator;

import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class my_file implements Aggregate {
    String name;
    String time;
    double size;

    public my_file(String name, String time, double size) {
        this.name = name;
        this.time = time;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTime() {
        return time;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public void add(Aggregate var1) {

    }

    @Override
    public void remove(Aggregate var1) {

    }

    @Override
    public Aggregate getChild(int var1) {
        return null;
    }

    @Override
    public Iterator<Aggregate> getAllChildren() {
        return null;
    }

    @Override
    public boolean isLeaf() {
        return true;
    }

    @Override
    public int getLength() {
        return 0;
    }


}
