import java.util.Arrays;

public abstract class AbstractFilm implements Film {

    private String myName, myProducer, myDirector;
    private int myYear;
    private String[] myActors;
    private double myLength;

    public AbstractFilm(String name, String producer, String director,
                        int year, String[] actors, double length) {
        myName = name;
        myProducer = producer;
        myDirector = director;
        myYear = year;
        myActors = actors;
        myLength = length;
    }

    public final void setName(String name){myName = name;}
    public final void setProducer(String producer){myProducer = producer;}
    public final void setDirector(String director){myDirector = director;}
    public final void setYear(int year){myYear = year;}
    public final void setActors(String[] actors){myActors = actors;}
    public final void setLength(double length){myLength = length;}

    public final String getName(){return myName;}
    public final String getProducer(){return myProducer;}
    public final String getDirector(){return myDirector;}
    public final int getYear(){return myYear;}
    public final String[] getActors(){return myActors;}
    public final double getLength(){return myLength;}

    public String toString(){
        return myName + ":\n" +
            "\tProducer: " + myProducer + "\n" +
            "\tDirector: " + myDirector + "\n" +
            "\tYear: " + myYear + "\n" +
            "\tActors: " + displayActors() + "\n" +
            "\tLength: " + formatLength() + "\n";
    }

    public String displayActors(){
        StringBuffer result = new StringBuffer();
        String[] actors = getActors();
        for (int i = 0; i < actors.length; i++) {
            result.append(actors[i] + ", ");
        }
        return result.toString();
    }

    // length is given in minutes
    // in: 92.5
    // out "1:32:30"

    /*
        days = seconds / ( 24 * 60 * 60 )
        seconds -= ( days * ( 24 * 60 * 60 ) )

        hours = seconds / ( 60 * 60 )
        seconds -= ( hours * ( 60 * 60 ) )

        minutes = seconds / 60
        seconds -= ( minutes * 60 )
    */
    public String formatLength(){
        double length = myLength;
        int hours = (int)length/60;
        length -= hours;
        int minutes = (int)length;
        length -= minutes;
        int seconds = (int)length;
        return hours + ": " + minutes + ": " + seconds;
    }


}