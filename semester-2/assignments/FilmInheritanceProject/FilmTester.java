/*
    Program: FilmTester.java
    Purpose: Show off the uses of the Movie and TVShow objects
             by displaying them
             Demonstrate polymorphism through the use of methods
             like AbstractFilm.getName() that are resolved at runtime
*/

public class FilmTester {
    public static void main(String[] args){
        AbstractFilm[] films = {
            new TVShow(
                "Breaking Bad", "Vince Gilligan", "Vince Gilligan", 2008,
                new String[]{
                    "Bryan Cranston", "Anna Gunn", "Aaron Paul", "Dean Norris",
                    "Betsy Brandt", "RJ Mitte", "Bob Odenkirk", "Laura Fraser",
                    "Giancarlo Esposito", "Jonathan Banks", "Jesse Piemons"
                }, 50, 5, 62, 10),
            new TVShow(
                "Twin Peaks", "Mark Frost", "David Lynch", 1990,
                new String[]{
                    "Kyle MacLachlan","Michael Ontkean","Madchen Amick",
                    "Dana Ashbrook","Richard Beymer","Lara Flynn Boyle",
                    "Joan Chen","Eric Da Re","Sherilyn Fenn","Warren Frost",
                    "Harry Goaz","Michael Horse","Piper Laurie","Sheryl Lee",
                    "Peggy Lipton","James Marshall","Everett McGill",
                    "Jack Nance","Kimmy Robertson","Russ Tamblyn",
                    "Kenneth Welsh","Ray Wise"
                }, 47, 2, 30, 2),
            new Movie(
                "Fight Club", "Art Linson", "Davic Fincher", 1999,
                new String[]{
                    "Brad Pitt", "Edward Norton", "Helena Bonham Carter"
                }, 139, 0),
            new Movie(
                "The Godfather", "Albert S. Ruddy", "Francis Ford Cappola",
                1972, new String[]{
                    "Marlon Brando", "Al Pacino", "James Caan", "John Marley",
                    "Richard Castellano", "Robert Duval", "Sterling Hayden",
                    "Richard Conte", "Diane Keaton"
                }, 175, 3)
        };
        for (AbstractFilm film : films){
            System.out.println(film.toString());
        }
        System.out.println(
            films[0].getName() + " compared to " + films[1].getName() + ":"
        );
        System.out.println("\t" +
            (films[0].compareTo(films[1]) > 0 ?
                films[0].getName() : films[1].getName()) +
            " is the better TV Show"
        );
        System.out.println(
            films[2].getName() + " compared to " + films[3].getName() + ":"
        );
        System.out.println("\t" +
            (films[2].compareTo(films[1]) > 0 ?
                films[2].getName() : films[3].getName()) +
            " is the better Movie"
        );
    }
}
