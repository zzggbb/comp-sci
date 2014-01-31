public class Movie extends AbstractFilm {

    private int myOscars;

    public Movie(String name, String producer, String director, int year,
                String[] actors, int length, int oscars) {
        super(name, producer, director, year, actors, length);
        myOscars = oscars;
    }

    public void setOscars(int oscars){myOscars = oscars;}
    public int getOscars(){return myOscars;}

    public String toString(){
        return super.toString() +
        "\tOscars: " + myOscars + "\n";
    }
}