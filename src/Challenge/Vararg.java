package Challenge;

public class Vararg {
    public static void main(String[] args) {
        System.out.println("Sohail");
        System.out.println("Khan");
        System.out.println("Welcome to my coding world");
    }
    public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
      for(String str : strs){
          sb.append(str).append(" ");
      }
      return sb.toString();
    }
}
