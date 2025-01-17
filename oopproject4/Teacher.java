
package oopproject4;


public class Teacher extends Person {
   int numCourses;   
   String[] courses; 
  int COURSES; 
   
  
   public Teacher(String name, String address) {
      super(name, address);
      numCourses = 0;
      courses = new String[COURSES];
   }
   public boolean addCourse(String course) {
    
      for (int i = 0; i < numCourses; i++) {
         if (courses[i].equals(course)) return false;
      }
      courses[numCourses] = course;
      numCourses++;
      return true;
   }
    public boolean removeCourse(String course) {
      boolean found = false;
      
      int courseIndex = -1;  
      for (int i = 0; i < numCourses; i++) {
         if (courses[i].equals(course)) {
            courseIndex = i;
            found = true;
            break;
         }
      }
      if (found) {
         
         for (int i = courseIndex; i < numCourses-1; i++) {
            courses[i] = courses[i+1];
         }
         numCourses--;
         return true;
      } else {
         return false;
      }
   }

    @Override
    public String toString() {
        return "Teacher{" + "numCourses=" + numCourses + ", courses=" + courses + ", COURSES=" + COURSES + '}';
    }
    
}
