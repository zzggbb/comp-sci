/*
    Program: Film.java
    Purpose: A common interface that the AbstractFilm class
             implements to represent a film.
*/

public interface Film {

    public void setName(String name);
    public void setProducer(String producer);
    public void setDirector(String director);
    public void setYear(int year);
    public void setActors(String[] actors);
    public void setLength(int length);

    public String getName();
    public String getProducer();
    public String getDirector();
    public int getYear();
    public String[] getActors();
    public int getLength();
}