
package oopproject3;


public class Movie {
 private String title;
 private String studio;
 private String rating;

    public Movie() {
    }

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "pG";
    }
    public static Movie[] getPG(Movie[] M) {
 Movie[] pgMov = new Movie[M.length];
 int newArrayIndex = 0;
 for (int i = 0; i < M.length; i++) {
 if (M[i].rating.equals("PG")) {
 pgMov[newArrayIndex] = M[i];
 newArrayIndex++;
 }
 }
 return pgMov;
}
 
}
