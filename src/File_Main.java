import com.wsq.my_folder;
import com.wsq.my_file;
import com.wsq.intreface.Iterator;
import com.wsq.intreface.Aggregate;

public class File_Main {
    public static void main(String[] args) {


        my_folder folder = new my_folder("F", "2021-5-1");
        my_folder folder1 = new my_folder("Fold1", "2021-5-1");
        my_folder folder2 = new my_folder("Fold2", "2021-5-2");
        my_folder folder3 = new my_folder("Fold3", "2021-5-3");
        my_file file1 = new my_file("file1", "2021-5-1", 256);
        my_file file2 = new my_file("file2", "2021-5-1", 256);
        my_file file3 = new my_file("file3", "2021-5-1", 256);
        my_file file4 = new my_file("fil44", "2021-5-1", 256);
        my_file file5 = new my_file("file5", "2021-5-1", 256);


        System.out.println("F文件夹下文件");
        folder.add(file1);
        folder.add(file2);
        folder.add(file3);
//      文件夹嵌套文件夹
        folder.add(folder1);


        folder1.add(file4);
        folder1.add(folder3);
        folder3.add(file5);
//        folder3.add(file4);
        folder.add(file4);

        folder.add(folder2);
        folder2.add(file2);
        folder2.add(file3);
        folder.add(file1);

        Iterator iterator = folder.getAllChildren();


//        pp(iterator);


        prfile(iterator, 1);


//        删除文件

        System.out.println("删除F下文件file2");
        Iterator iterator1 = folder.getAllChildren();
        folder.remove(file2);
        prfile(iterator1,1);

//        System.out.println("文件大小: " + fs);
//        System.out.println("文件数量: " + fn);


    }

    private static void prfile(Iterator iterator, int i) {
        String str1 = "-";
        for (int j = 1; j < i; j++) {
            str1 = str1 + "---";
        }
        while (iterator.hasNext()) {
            Aggregate file = (Aggregate) iterator.next();
            if (!file.isLeaf()) {
                Iterator iterator1 = file.getAllChildren();
                System.out.println("|" + str1 + file.getName() + "  " + file.getTime() + "  " + file.getSize() + "   ");
                prfile(iterator1, ++i);
                i--;
            }else
                System.out.println("|" + str1 + file.getName() + "  " + file.getTime() + "  " + file.getSize() + "   ");

        }
    }


}
