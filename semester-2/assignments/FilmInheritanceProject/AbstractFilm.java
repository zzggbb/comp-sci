public abstract class AbstractFilm implements Film {

    private String myName, myProducer, myDirector;
    private int myYear, myLength;
    private String[] myActors;

    public AbstractFilm(String name, String producer, String director,
                        int year, String[] actors, int length) {
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
    public final void setLength(int length){myLength = length;}

    public final String getName(){return myName;}
    public final String getProducer(){return myProducer;}
    public final String getDirector(){return myDirector;}
    public final int getYear(){return myYear;}
    public final String[] getActors(){return myActors;}
    public final int getLength(){return myLength;}

    public String toString(){
        return getName() + ":\n" +
            "\tProducer: " + getProducer() + "\n" +
            "\tDirector: " + getDirector() + "\n" +
            "\tYear: " + getYear() + "\n" +
            "\tActors: " + displayActors() + "\n" +
            "\tLength: " + formatLength() + "\n";
    }

    public String displayActors(){
        //StringBuffer result = new StringBuffer();
        String result = "";
        String[] actors = getActors();
        for (int i = 0; i < actors.length-1; i++) {
            //result.append(actors[i] + ", ");
            result += actors[i] + ", ";
        }
        //result.append(actors[actors.length-1]);
        result += actors[actors.length-1];
        return result.toString();
    }

    public String formatLength(){
        int length = myLength;
        int hours = (int)length/60;
        length -= hours*60;
        int minutes = (int)length;
        length -= minutes;
        return hours + ":" + minutes;
    }


}