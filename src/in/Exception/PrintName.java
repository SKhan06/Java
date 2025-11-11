package in.Exception;

public class PrintName {
    public void printName(String name)throws IllegalArgumentException{
        if (name.contains("-")){
            throw new IllegalArgumentException("Name contain -");
        }
        System.out.println(name);
    }

    public static void main(String[] args) {
        PrintName printName = new PrintName();
        printName.printName("-");
    }
}
