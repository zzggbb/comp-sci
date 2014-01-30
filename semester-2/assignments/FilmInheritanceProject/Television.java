public class Television extends AbstractFilm {

    private int mySeason;
    private int myEpisodeNumber;
    private int myEmmys;

    public Television(String name, String producer, String director, int year,
                   String[] actors, double length, int season,
                   int episodeNumber, int emmys) {
        super(name, producer, director, year, actors, length);
        mySeason = season;
        myEpisodeNumber = episodeNumber;
        myEmmys = emmys;
    }

    public void setSeason(int season){mySeason = season;}
    public void setEpisodeNumber(int episodeNumber){myEpisodeNumber = episodeNumber;}
    public void setEmmys(int emmys){myEmmys = emmys;}

    public int getSeason(){return mySeason;}
    public int getEpisodeNumber(){return myEpisodeNumber;}
    public int getEmmys(){return myEmmys;}

}