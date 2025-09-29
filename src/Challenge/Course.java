package Challenge;

 class Course {
     static int maxCapacity = 100;
     String courseName;
     int enrollments;
     String[] enrolledStudents ;

     Course(String courseName){
         this.courseName = courseName;
         this.enrollments = 0;
         this.enrolledStudents= new String[maxCapacity];
     }
     static void setMaxCapacity(int maxCapacity){
         Course.maxCapacity=maxCapacity;
     }

     void enrollStudents(String studentName){
         enrolledStudents[enrollments]= studentName;
         enrollments++;
     }
     void unEnrollStudents(String studentName){
         System.out.println("Student removed");
         enrollments--;
     }

     public static void main(String[] args) {
         Course cours = new Course("Java");
         System.out.println(Course.maxCapacity);
         Course.setMaxCapacity(234 );
}
     }
