package Task_2;

import java.io.File;
import java.io.IOException;

public class TextToJsonTest {
    public static void main(String[] args) throws IOException {
        File file = new File("userList.txt");
        TextToJson writeJsonChecker = new TextToJson();
        writeJsonChecker.writeToJson(file);
    }
}
