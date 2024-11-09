package tools;

import java.io.*;

public class IsExist {
    public static boolean isExist(String id) {
        File file = new File("Dd1/src/File/users.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                String[] strings = str.split(" ");
                if (strings[0].equals(id)) {
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
