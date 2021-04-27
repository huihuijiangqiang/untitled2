package com.wsq.intreface;



// 遍历集合中的元素


public interface  Iterator<A> {
    //是否还有更多元素
    public abstract boolean hasNext();
    //返回聚合中的下一个元素
    public abstract Object next();
}