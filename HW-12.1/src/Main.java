public class Main {
    public static void main(String[] args) {
        Movie HarryPotter = new Movie();
        HarryPotter.nameOfMovie = "Harry Potter";
        HarryPotter.year = 1998;
        HarryPotter.director = "J.K. Roaling";
        HarryPotter.rating = "9/10";
        Movie Avatar = new Movie("Avatar" , 2005, " James Cameron", "9/10");
        Movie Avengers = new Movie();
        Avengers.nameOfMovie = "Avengers";
        Avengers.year = 2006;
        Avengers.director = "Russo Brothers";
        Avengers.rating = "8/10";
        Movie Gentlemen = new Movie("Gentlemen", 2018, "Gai Richie", "9/10");
        System.out.println(HarryPotter + "\n" + Avatar + "\n" + Avengers + "\n" + Gentlemen);
        System.out.println("--------------");
        HarryPotter.printInfo();
        HarryPotter.printRating();
        Avatar.printInfo();
        Avatar.printRating();
        Avengers.printInfo();
        Avengers.printRating();
        Gentlemen.printInfo();
        Gentlemen.printRating();
    }
}
