package Practice.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteIntoFile {

    public static void main(String[] args) throws IOException {
        File file=new File("file.txt");
        Scanner scanner=new Scanner(file);
        try {
                while (scanner.hasNextLine()){
                    String data = scanner.nextLine();
                    System.out.println(data);

                }
            scanner.close();
        }catch (Exception e){};
    }
}
