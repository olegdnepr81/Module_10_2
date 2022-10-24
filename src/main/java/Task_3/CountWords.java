package Task_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

public class CountWords {
    public void count(File file) throws FileNotFoundException {
        InputStream textFileStream = new FileInputStream(file);
        Scanner scanner = new Scanner(textFileStream);
        Map<String, Integer> wordsTable = new HashMap<>();
        if (file.exists()) {
            while (scanner.hasNext()) {
                String[] wordArray = scanner.nextLine().split(" ");
                for (int i = 0; i < wordArray.length; i++) {
                    String word = wordArray[i];
                    Integer wordCount = 1;
                    if (!wordsTable.containsKey(word)) {
                        wordsTable.put(word, wordCount);
                    } else {
                        wordsTable.put(word, wordsTable.get(word) + wordCount);
                    }
                }
            }
            //System.out.println(wordsTable);
            Comparator<String> comparator = new Comparator<String>() {
                Map<String, Integer> localMap = wordsTable;

                @Override
                public int compare(String o1, String o2) {
                    return localMap.get(o1) < localMap.get(o2) ? 1 : -1;
                }
            };
            Map<String, Integer> treeMap = new TreeMap<>(comparator);
            treeMap.putAll(wordsTable);

//            System.out.println(treeMap);
//            System.out.println(treeMap.size());
            for (Map.Entry<String, Integer> tree : treeMap.entrySet()) {
                System.out.println(tree.getKey() + " " + tree.getValue());
            }
        }
    }
}