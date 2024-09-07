
package oopproject2;


public class Holiday {
 private String name;
 private int day;
 private String month;

    public Holiday() {
    }

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }
 public boolean inSameMonth(Holiday h){
     
            if ( month.equals(h.month))
            
            return true;
           
       
       else
              return false;
                
 }
     public static double  avgDate (Holiday [] arr)
     {
         int sum = 0;
         for (int i = 0; i < arr.length; i++) {
            sum  += arr[i].day;
             
         }
       return ((double) sum)/arr.length;
     }

}
