public class Episode extends AbstractFilm {

    private int season;
    private int episodeNumber;

    public Episode(String name, String producer, String director, int year,
                   String[] actors, double length, int season,
                   int episodeNumber) {
        super(name, producer, director, year, actors, length);
        this.season = season;
        this.episodeNumber = episodeNumber;
    }

    public void setSeason(){}
    public void setEpisodeNumber(){}
    public int getSeason(){}
    public int getEpisodeNumber(){}

}