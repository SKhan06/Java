package in.polymorphism;

import javax.swing.plaf.basic.BasicTreeUI;

public class Overloading {
    public int add(int a, int b){
        return a + b;
    }
    Overloading(){
        System.out.println("Default constructor called. ");
    }
    Overloading(String pop){
        System.out.println(pop);

    }
    public int add(int a, int b, int c, int d){
        return a + b + c +d;
    }
    public String add(String a, String b){
        return a + b;
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        String add = overloading.add("sohail", "Khan");
        System.out.println(add);
    }

}
