package Challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getGrade() - t1.getGrade() ;
            }
        });
        queue.offer(new Student("Sohail",'B'));
        queue.offer(new Student("Irfan",'C'));
        queue.offer(new Student("Yeshu",'A'));
        queue.offer(new Student("Lucky",'D'));
        queue.offer(new Student("Shahil",'B'));
        queue.offer(new Student("Sufiyan",'D'));
        System.out.printf("Queue : %s\n",queue);
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());
        System.out.printf("Got %s\n",queue.poll());


    }
    public static class Student{
        private String name;
        private char grade;

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
           return name + (": ") +grade;
        }

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

    }
}
