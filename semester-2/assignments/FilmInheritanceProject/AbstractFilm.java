abstract public class AbstractFilm implements Film {

    private String myName, myProducer, myDirector;
    private int myYear;
    private String[] myActors;
    private double myLength;

    public AbstractFilm(String name, String producer, String director,
                        int year, String[] actors, double length){
        myName = name;
        myProducer = producer;
        myDirector = director;
        myYear = year;
        myActors = actors;
        myLength = length;

    }

    public void setName(String name){myName = name;}
    public void setProducer(String producer){myProducer = producer;}
    public void setDirector(String director){myDirector = director;}
    public void setYear(int year){myYear = year;}
    public void setActors(String[] actors){myActors = actors;}
    public void setLength(double length){myLength = length;}

    public String getName(){return myName;}
    public String getProducer(){return myProducer;}
    public String getDirector(){return myDirector;}
    public int getYear(){return myYear;}
    public String[] getActors(){return myActors;}
    public double getLength(){return myLength;}

}