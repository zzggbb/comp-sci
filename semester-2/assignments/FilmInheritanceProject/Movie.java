
public class Movie extends AbstractFilm {

    public Movie(String name, String producer, String director, int year,
                String[] actors, double length) {
        super(name, producer, director, year, actors, length);
        this.actors = actors;
        this.length = length;
    }
}