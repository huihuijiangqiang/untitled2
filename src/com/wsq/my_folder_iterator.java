package com.wsq;
import com.wsq.intreface.Aggregate;
import com.wsq.intreface.Iterator;
// 完成文件遍历

public class my_folder_iterator implements Iterator {
    private my_folder folder;
    private int position = 0;//记录位置

    public my_folder_iterator(my_folder folder) {
        this.folder = folder;
    }

    @Override
    public boolean hasNext() {
        return position<folder.getLength()?true:false;
    }

    @Override
    public Object next() {
        Aggregate file=this.folder.getFilAt(position);
        position++;
        return file;
    }
}
