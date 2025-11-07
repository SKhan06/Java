package Challenge;

import java.util.Locale;

public class ConcatenateAndConvert {
    public static void main(String[] args) {
        String firstName = "sohail";
        String SecondName = "Hello";
        String fullName= firstName.concat(" ").concat(SecondName);
        System.out.println(fullName.toUpperCase());
    }
}
