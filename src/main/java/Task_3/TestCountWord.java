package Task_3;

import java.io.File;
import java.io.FileNotFoundException;

public class TestCountWord {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("words.txt");
        CountWords countWords = new CountWords();
        countWords.count(file);
    }
}
