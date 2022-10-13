package Practice.filehandling;

import io.cucumber.java.zh_cn.但是;

import java.io.*;

public class FileHandling {
    public static FileInputStream fileInputStream;
    public static FileOutputStream fileOutputStream;

    public static File file;

    public static void main(String[] args) throws IOException {

        file = new File("D:\\shrikant.txt");
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            if (file.exists()) {
                System.out.println(file.getPath());
            }
            file.createNewFile();
            System.out.println("file Created");
        } catch (Exception e) {
            e.printStackTrace();
        }
        int sd = fileInputStream.read("shrikant lohar".getBytes());



    }
}
