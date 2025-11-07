package Challenge;

public class StudentDetailsToString {
    String name;
    int age;
    int Class;
    int marks;

    public StudentDetailsToString(String name, int age, int aClass, int marks) {
        this.name = name;
        this.age = age;
        Class = aClass;
        this.marks = marks;
    }

    @Override
    public String toString() {
       return "Student Details:{name:"+name+"  ,age:"+age+" ,Class:"+Class+" ,marks:"+marks+"}";
    }

    public static void main(String[] args) {
        StudentDetailsToString details = new StudentDetailsToString("Sohail",22,10,429);
        System.out.println(details);
    }
}
