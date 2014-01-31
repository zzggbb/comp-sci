public class TVShow extends AbstractFilm {

    private int mySeasons;
    private int myEpisodes;
    private int myEmmys;

    public TVShow(String name, String producer, String director, int year,
                      String[] actors, double length, int seasons,
                      int episodes, int emmys) {
        super(name, producer, director, year, actors, length);
        mySeasons = seasons;
        myEpisodes = episodes;
        myEmmys = emmys;
    }

    public void setSeason(int season){mySeasons = season;}
    public void setepisodes(int episodes){myEpisodes = episodes;}
    public void setEmmys(int emmys){myEmmys = emmys;}

    public int getSeason(){return mySeasons;}
    public int getepisodes(){return myEpisodes;}
    public int getEmmys(){return myEmmys;}

    public String toString(){
        return super.toString() +
        "\tSeasons: "+ mySeasons + "\n" +
        "\tEpisodes: " + myEpisodes + "\n" +
        "\tEmmys: " + myEmmys + "\n";
    }
}