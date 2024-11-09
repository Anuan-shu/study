package cmds;

import Lei.UserType;
import tools.IdCheck;
import tools.IsExist;
import tools.LoginCheck;
import tools.SecondPasswordCheck;

import java.io.*;

public class login {
    public static boolean login(String[] commands) {
        //判断参数个数是否合法
        if (commands.length != 3) {
            System.out.println("Illegal argument count");
            return false;
        }

        //判断用户id是否合法
        UserType type = IdCheck.check(commands[1]);
        if (type == UserType.错误) {
            System.out.println("Illegal user id");
            return false;
        }

        //判断用户是否存在
        if (!IsExist.isExist(commands[1])) {
            System.out.println("User does not exist");
            return false;
        }

        //判断用户是否在线
        if (LoginCheck.check(commands[1])) {
            System.out.println(commands[1] + " is online");
            return false;
        }

        //获取用户密码
        File file = new File("Dd1/src/File/users.txt");
        String password = null;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                String[] strings = str.split(" ");
                if (strings[0].equals(commands[1])) {
                    password = strings[2];
                    break;
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //判断密码是否正确
        if (!SecondPasswordCheck.check(password, commands[2])) {
            System.out.println("Wrong password");
            return false;
        }

        //登录成功
        System.out.println("Welcome to ACP, " + commands[1]);

        //将用户id写入LoginUsers.txt
        file = new File("Dd1/src/File/LoginUsers.txt");
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(commands[1] + " " + type + "\n");
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
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

        //将用户id和身份写入NowOnlineUser.txt
        try {
            FileWriter fileWriter = new FileWriter(file1, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(commands[1] + " " + type + "\n");
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
