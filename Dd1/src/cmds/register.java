package cmds;

import Lei.UserType;
import tools.*;

import java.io.*;

public class register {
    public static boolean register(String[] commands) {
        //判断参数个数是否合法
        if (commands.length != 6) {
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
        if (IsExist.isExist(commands[1])) {
            System.out.println("User id exists");
            return false;
        }

        //判断用户名是否合法
        if (!NameCheck.check(commands[2])) {
            System.out.println("Illegal user name");
            return false;
        }

        //判断密码是否合法
        String password = FirstPasswordCheck.check(commands[3]);
        if (password == null) {
            System.out.println("Illegal password");
            return false;
        }

        //判断两次密码是否一致
        if (!SecondPasswordCheck.check(commands[4], password)) {
            System.out.println("Passwords do not match");
            return false;
        }

        //判断身份是否合法
        if (!TypeCheck.check(commands[5])) {
            System.out.println("Illegal identity");
            return false;
        }

        //注册成功
        System.out.println("Register success");

        //将用户信息写入文件
        File file = new File("Dd1/src/File/users.txt");
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(commands[1] + " " + commands[2] + " " + password + " " + commands[5] + "\n");
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
