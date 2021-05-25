import com.DecoratorPattern.ReadEnglishWord;
import com.DecoratorPattern.WordDecorator;

import java.io.File;
import java.util.ArrayList;

public class DecoratorPatternMain {

    public static void main(String[] args) {
        ReadEnglishWord readEnglishWord = new ReadEnglishWord();
        WordDecorator wordDecorator1 = new WordDecorator(readEnglishWord, new File( "D:\\github\\untitled2\\src\\w.txt"));
        ArrayList<String> wordList = wordDecorator1.readWords(new File( "D:\\github\\untitled2\\src\\w1.txt"));
        for (String s : wordList) {
            System.out.println(s);
        }



    }
}
