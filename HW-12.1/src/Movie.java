public class Movie {
    String nameOfMovie;
    int year;
    String director;
    String rating;

    public Movie(String nameOfMovie, int year, String director, String rating){
        this.nameOfMovie = nameOfMovie;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public Movie(){

    }

    public void printInfo(){
        System.out.println("Name of Movie: " + this.nameOfMovie + " ; Year: " + this.year + " ; Director: " + this.director);
    }

    public void printRating(){
        System.out.println("Rating :" + this.rating);
    }

    public String toString (){
        return "Name of movie: " + nameOfMovie + " ; Year: " + year + " ; Director: " + director + " ; Rating : " + rating;
    }
}
