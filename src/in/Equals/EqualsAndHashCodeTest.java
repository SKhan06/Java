package in.Equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person = new Person("Sohail",17,"879");
        Person person1 = new Person("Sohail",17,"879");

        if (person.equals(person1)){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }
}
