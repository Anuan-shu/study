package cmds;

import Lei.UserType;
import tools.DeleteUser;
import tools.IdCheck;
import tools.IsExist;

import java.io.*;

public class logout {
    public static boolean logout(String[] commands, boolean IsOut) throws FileNotFoundException {
        if (IsOut) {
            DeleteUser.Delete(commands[1], "Dd1/src/File/LoginUsers.txt");
            System.out.println(commands[1] + " Bye~");
            return true;
        }

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

        //登出成功
        if (commands.length == 1) {

            DeleteUser.Delete(id, "Dd1/src/File/NowOnlineUser.txt");
            DeleteUser.Delete(id, "Dd1/src/File/LoginUsers.txt");
            System.out.println(id + " Bye~");
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
            if (!commands[1].equals(id)) {
                System.out.println(commands[1] + " is not online");
                return false;
            }
            DeleteUser.Delete(id, "Dd1/src/File/NowOnlineUser.txt");
            DeleteUser.Delete(commands[1], "Dd1/src/File/LoginUsers.txt");
            System.out.println(commands[1] + " Bye~");
        }
        return true;
    }
}
