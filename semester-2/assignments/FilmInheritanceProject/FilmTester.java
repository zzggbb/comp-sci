public class FilmTester {
    public static void main(String[] args){
        AbstractFilm[] films = {
            new TVShow(
                "Breaking Bad", "Vince Gilligan", "Vince Gilligan", 2008,
                new String[]{
                    "Bryan Cranston", "Anna Gunn", "Aaron Paul", "Dean Norris",
                    "Betsy Brandt", "RJ Mitte", "Bob Odenkirk", "Laura Fraser",
                    "Giancarlo Esposito", "Jonathan Banks", "Jesse Piemons"
                }, 50.0, 5, 62, 10),
            new Movie(
                "Fight Club", "Art Linson", "Davic Fincher", 1999,
                new String[]{
                    "Brad Pitt", "Edward Norton", "Helena Bonham Carter"
                }, 139, 0)
        };
        for (AbstractFilm film : films){
            System.out.println(film);
        }
    }
}