package Task_2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class TextToJson implements Serializable {
    public void writeToJson(File file) throws IOException {

        List<UserIdDto> userIdDtoArrayList = new ArrayList<>();
        if (file.exists()) {
            InputStream fis = new FileInputStream(file);
            Scanner id = new Scanner(fis);
            id.nextLine();

            while (id.hasNext()) {
                String line = id.nextLine();
                String[] user = line.split(" ");
                UserIdDto info = new UserIdDto(user[0], parseInt(user[1]));
                userIdDtoArrayList.add(info);
            }
            //System.out.println(userIdDtoArrayList);
            fis.close();
        }
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(userIdDtoArrayList);
        System.out.println(json);
        OutputStream fs = new FileOutputStream("users.json");
        fs.write(json.getBytes());
    }

}
