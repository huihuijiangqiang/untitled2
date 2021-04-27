package com.wsq;

import com.wsq.intreface.Aggregate;
import com.wsq.intreface.Iterator;


import java.util.ArrayList;
import java.util.List;

/**
 * 完成文件遍历
 */
public class my_folder implements Aggregate{

    private List<Aggregate> list;
    String name;
    String time;

    public my_folder(String name, String time) {
        this.name = name;
        this.time = time;
        this.list=new ArrayList<>();
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
        return 0;
    }

    public Aggregate getFolderAt(int index) {
        return (Aggregate)this.list.get(index);
    }


    @Override
    public void add(Aggregate var1) {
        this.list.add(var1);
    }

    @Override
    public void remove(Aggregate var1) {
        this.list.remove(var1);
    }

    @Override
    public Aggregate getChild(int var1) {
        return (Aggregate) this.list.get(var1);
    }

    @Override
    public Iterator<Aggregate> getAllChildren() {
        return new my_folder_iterator(this);
    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public int getLength() {
        return this.list.size();
    }


    public Aggregate getFilAt(int position) {
        return (Aggregate)this.list.get(position);
    }


}