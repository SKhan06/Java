package Challenge.NestedProblem.PersonEqual;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
       if (!(o instanceof Person)){
           return false;
       }
       Person person= (Person) o;
       return ((Person) o).name.equals(name)&&
               ((Person) o).age==age&&
               ((Person) o).id.equals(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
    }

    public static void main(String[] args) {
        Person person= new Person("sohail",22,"445");
        System.out.println(person);
    }
}
