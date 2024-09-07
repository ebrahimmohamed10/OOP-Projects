
package oopproject4;


public class Student extends Person {
    int numCourses;   
    String[] courses;
    int[] grades;     
   int COURSES ;
    public Student(String name, String address) {
      super(name, address);
      numCourses = 0;
      courses = new String[COURSES];
      grades = new int[COURSES];
   }
   
   public void addCourseGrade(String course, int grade) {
      courses[numCourses] = course;
      grades[numCourses] = grade;
      ++numCourses;
   }
   
  
   public void printGrades() {
     
      for (int i = 0; i < numCourses; ++i) {
         System.out.print(" courses" + courses[i] + "grades" + grades[i]);
      }
      System.out.println();
   }
   
   /** Computes the average grade */
   public double getAverageGrade() {
      int sum = 0;
      for (int i = 0; i < numCourses; i++ ) {
         sum += grades[i];
      }
      return (double)sum/numCourses;
   }

    @Override
    public String toString() {
        return "Student{" + "numCourses=" + numCourses + ", courses=" + courses + ", grades=" + grades + ", COURSES=" + COURSES + '}';
    }
   
}
