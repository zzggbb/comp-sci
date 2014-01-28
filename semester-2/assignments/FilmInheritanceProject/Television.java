public class Episode extends AbstractFilm {

    private int mySeason;
    private int myEpisodeNumber;

    public Episode(String name, String producer, String director, int year,
                   String[] actors, double length, int season,
                   int episodeNumber) {
        super(name, producer, director, year, actors, length);
        mySeason = season;
        myEpisodeNumber = episodeNumber;
    }

    public void setSeason(){}
    public void setEpisodeNumber(){}

    public int getSeason(){}
    public int getEpisodeNumber(){}

}