public class TVShow extends AbstractFilm {

    private int mySeasons, myEpisodes, myEmmys;

    public TVShow(String name, String producer, String director, int year,
                      String[] actors, int length, int seasons,
                      int episodes, int emmys) {
        super(name, producer, director, year, actors, length);
        mySeasons = seasons;
        myEpisodes = episodes;
        myEmmys = emmys;
    }

    public void setSeasons(int season){mySeasons = season;}
    public void setepisodes(int episodes){myEpisodes = episodes;}
    public void setEmmys(int emmys){myEmmys = emmys;}

    public int getSeasons(){return mySeasons;}
    public int getEpisodes(){return myEpisodes;}
    public int getEmmys(){return myEmmys;}

    public String toString(){
        return super.toString() +
        "\tSeasons: "+ getSeasons() + "\n" +
        "\tEpisodes: " + getEpisodes() + "\n" +
        "\tEmmys: " + getEmmys + "\n";
    }
}