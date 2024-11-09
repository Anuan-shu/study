import cmds.*;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();

            //按照空格进行分割
            String[] commands = str.split("\\s+");
            if (commands.length == 0) {
                continue;
            }
            if (commands[0].equals("quit")) {
                if (quit.quit(commands)) break;
            } else if (commands[0].equals("register")) {
                register.register(commands);
            } else if (commands[0].equals("login")) {
                login.login(commands);
            } else if (commands[0].equals("logout")) {
                logout.logout(commands, false);
            } else if (commands[0].equals("printInfo")) {
                printInfo.printInfo(commands);
            } else if (commands[0].equals("createCourse")) {
                System.out.println("创建课程");
            } else if (commands[0].equals("listCourse")) {
                System.out.println("查看课程");
            } else if (commands[0].equals("selectCourse")) {
                System.out.println("选课");
            } else if (commands[0].equals("cancelCourse")) {
                System.out.println("注销课");
            } else {
                System.out.println("Command '" + commands[0] + "' not found");
            }
        }
        sc.close();
    }
}
