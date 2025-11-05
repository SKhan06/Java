package Lecture.Operator;

public class forLoop {
    public static void main(String[] args) {
        String[] array = new String[]{
                "ram","shayam","vinod","pandu","sohail","saman"
        };
        printArray(array);
        printArrayForeach(array);
    }
    public static void printArrayForeach(String[] array){
        for (String name : array){
            System.out.println(name);
        }
    }
    public static void printArray(String[] array){
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }


}
