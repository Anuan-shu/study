package cmds;

import java.io.*;

public class quit {
    public static boolean quit(String[] commands) {
        if (commands.length != 1) {
            System.out.println("Illegal argument count");
            return false;
        }

        //清空NowOnlineUser.txt
        File file1 = new File("Dd1/src/File/NowOnlineUser.txt");
        try {
            FileWriter fileWriter = new FileWriter(file1);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("");
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //获取已登录用户
        File file = new File("Dd1/src/File/LoginUsers.txt");
        try {
            String id = null;
            String type = null;
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                String[] strings = str.split(" ");
                id = strings[0];
                type = strings[1];
                logout.logout(new String[]{"logout", id}, true);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("----- Good Bye! -----");
        return true;
    }
}
