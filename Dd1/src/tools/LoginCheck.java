package tools;

import java.io.*;

public class LoginCheck {
    public static boolean check(String id) {
        File file = new File("Dd1/src/File/LoginUsers.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                String[] strings = str.split(" ");
                if (strings[0].equals(id)) {
                    bufferedReader.close();
                    fileReader.close();
                    return true;
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
