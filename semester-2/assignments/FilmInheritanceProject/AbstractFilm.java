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

    abstract public void setName(String name){myName = name;}
    abstract public void setProducer(String producer){myProducer = producer;}
    abstract public void setDirector(String director){myDirector = director;}
    abstract public void setYear(int year){myYear = year;}
    abstract public void setActors(String[] actors){myActors = actors;}
    abstract public void setLength(double length){myLength = length;}

    abstract public String getName(){return myName;}
    abstract public String getProducer(){return myProducer;}
    abstract public String getDirector(){return myDirector;}
    abstract public int getYear(){return myYear;}
    abstract public String[] getActors(){return myActors;}
    abstract public double getLength(){return myLength;}

}