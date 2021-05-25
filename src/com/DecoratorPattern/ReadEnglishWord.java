package com.DecoratorPattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadEnglishWord extends ReadWord{

    @Override
    public ArrayList<String> readWords(File file) {
        ArrayList<String> wordList = new ArrayList<>();
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String str = null;
                while ((str = bufferedReader.readLine()) != null){
                    wordList.add(str);
                }
                bufferedReader.close();
                fileReader.close();
            }catch (Exception e){
                e.printStackTrace();
            }

        return wordList;

    }
}
