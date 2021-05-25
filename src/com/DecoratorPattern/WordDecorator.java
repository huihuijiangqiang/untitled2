package com.DecoratorPattern;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class WordDecorator extends ReadWord{
    private ReadWord readWord;
    private File docoratorFile;
    public WordDecorator(ReadWord readWord, File docoratorFile) {
        this.readWord = readWord;
        this.docoratorFile = docoratorFile;
    }

    @Override
    public ArrayList<String> readWords(File file) {
        ArrayList<String> wordList = readWord.readWords(file);
        try {
            FileReader fileReader = new FileReader(docoratorFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = null;
            int index = 0;
            while ((str = bufferedReader.readLine()) != null) {
                String word = wordList.get(index);
                word = word.concat(" | " + word.length());
                wordList.set(index, word);
                index++;
                if (index > wordList.size()) {
                    break;
                }
            }
            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return wordList;
    }

}
