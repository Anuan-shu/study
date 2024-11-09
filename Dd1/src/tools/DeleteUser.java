package tools;

import java.io.*;

public class DeleteUser {
    public static boolean Delete(String id, String filePath) {
        try {
            // 读取原文件内容
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder fileContent = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                // 如果该行不包含目标字符串，则添加到内容中
                if (!line.contains(id)) {
                    fileContent.append(line).append(System.lineSeparator());
                }
            }
            reader.close();

            // 将修改后的内容写回文件
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(fileContent.toString());
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
