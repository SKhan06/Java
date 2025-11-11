package in.File;

import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public static void main(String[] args){
        String fileName = "java-course.txt";

        try(FileWriter writer=new FileWriter(fileName)) {
            writer.write("This is the best Java Course\n");
            for (int i = 0; i < 100; i++) {
                writer.write('*');
            }
            writer.flush();
            System.out.println("File Written Successfully");
        }catch (IOException e){
            System.out.printf("Exception occurred %s\n",e.getMessage());

        }
    }
}
