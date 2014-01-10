import java.util.Random;

public class CoordinateDriver {
    public static void main(String[] args) {

        final int COORDINATES = 10;
        final int MAX_RAND = 10
        ArrayList <Coordinate> coords = new ArrayList <Coordinate> ();
        Random r = new Random();
        Random c = new Coordinate();

        for (int i=0; i<COORDINATES; i++){
            double randX = MAX_RAND * r.nextDouble();
            double randY = MAX_RAND * r.nextDouble();
            coords.add(new Coordinate(randX, randY));
        }

        for (Coordinate coord : coords){
            System.out.println(coord);
        }

        System.out.println("Elements within given range: " + c.search(coords));
        c.sort(coords);

        for (Coordinate coord : coords){
            System.out.println(coord);
        }
        System.out.println("This should be false:");
        System.out.println(coords.get(0).equals(coords.get(1)));
        System.out.println("This should be true:");
        System.out.println(new Coordinate().equals(new Coordinate()));
    }
}