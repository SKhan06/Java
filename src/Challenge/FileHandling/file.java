package Challenge.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Entre File Name");
        String fileName = input.next();
        try(FileReader reader = new FileReader(fileName)){
            int read;
//            do {
//                read =reader.read();
//                System.out.print((char)read);
//            }while (read!= -1);

            while (( read = reader.read()) != -1){
                System.out.print((char)read);
            }
        }catch (FileNotFoundException exception){
            System.out.printf("%s, not found", exception.getMessage());

        } catch (IOException e){
            System.out.printf("Exception occurred : %s", e.getMessage());
        }
    }

}
