package com.ChainResponsibilityPattern;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {
    public void save_File(String content){
        try{


            File file =new File("save.txt");

            //if file doesnt exists, then create it
            if(!file.exists()){
                file.createNewFile();
            }

            //true = append file
            FileWriter fileWritter = new FileWriter(file.getName(),true);
            fileWritter.write(content);
            fileWritter.close();

            System.out.println("Done");

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
