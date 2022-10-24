package Task_1;

import java.io.File;
import java.io.IOException;


public class PhoneReaderTest {
    public static void main(String[] args) throws IOException {
        File file = new File("phones.txt");
        PhoneReader phoneReader = new PhoneReader();
        phoneReader.phoneChecker(file);
    }
}





