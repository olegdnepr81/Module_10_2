package Task_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class PhoneReader{
    void phoneChecker(File file) throws IOException {

        if (file.exists()) {
            InputStream fis = new FileInputStream(file);
            Scanner phones = new Scanner(fis);
            while (phones.hasNext()) {
                String line = phones.nextLine();
                if (line.matches("\\d{3}-\\d{3}-\\d{4}") || line.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}")) {
                    System.out.println(line);
                }
                fis.close();
            }
        }
    }
}
