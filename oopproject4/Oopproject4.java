
package oopproject4;


public class Oopproject4 {

    
    public static void main(String[] args) {
        Student s1 = new Student("Ahmed", "Shawa");
      s1.addCourseGrade("math", 97);
      s1.addCourseGrade("physices", 95);
      s1.printGrades();
      
      System.out.println("Average is " + s1.getAverageGrade());
      

    
      Teacher t1 = new Teacher("Ebrahim", "mansoura");
      System.out.println(t1);
      
      String[] courses = {"communications", "logic", "programming"};
      for (String course: courses) {
         if (t1.addCourse(course)) {
            System.out.println(course + " added");
         } else {
            System.out.println(course + " cannot be added");
         }
      }
    }
    
}
