package cmds;

import Lei.UserType;
import tools.IdCheck;
import tools.IsExist;

import java.io.*;

public class printInfo {
    public static boolean printInfo(String[] commands) {
        //判断参数个数是否合法
        if (!(commands.length == 2 || commands.length == 1)) {
            System.out.println("Illegal argument count");
            return false;
        }

        //获取当前用户id和身份
        File file = new File("Dd1/src/File/NowOnlineUser.txt");
        String id = null;
        String type = null;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = bufferedReader.readLine();
            String[] strings = str.split(" ");
            id = strings[0];
            type = strings[1];
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (id == null) {
            System.out.println("No one is online");
            return false;
        }
        if (commands.length == 1) {
            //获取姓名
            File fileUser = new File("Dd1/src/File/users.txt");
            try {
                FileReader fileReader = new FileReader(fileUser);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String str = null;
                while ((str = bufferedReader.readLine()) != null) {
                    String[] strings = str.split(" ");
                    if (strings[0].equals(id)) {
                        System.out.println("User id: " + id);
                        System.out.println("Name: " + strings[1]);
                        System.out.println("Type: " + strings[3]);
                        System.out.println("Print information success");
                        break;
                    }
                }
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            if (!type.equals("管理员")) {
                System.out.println("Permission denied");
                return false;
            }
            if (IdCheck.check(commands[1]) == UserType.错误) {
                System.out.println("Illegal user id");
                return false;
            }
            if (!IsExist.isExist(commands[1])) {
                System.out.println("User does not exist");
                return false;
            }
            File fileUser = new File("Dd1/src/File/users.txt");
            try {
                FileReader fileReader = new FileReader(fileUser);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String str = null;
                while ((str = bufferedReader.readLine()) != null) {
                    String[] strings = str.split(" ");
                    if (strings[0].equals(commands[1])) {
                        System.out.println("User id: " + commands[1]);
                        System.out.println("Name: " + strings[1]);
                        System.out.println("Type: " + strings[3]);
                        System.out.println("Print information success");
                        break;
                    }
                }
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}
