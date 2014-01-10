import java.lang.Math;

public class Coordinate {
    private double myX;
    private double myY;
    public Coordinate() {
        // default constructer sets coordinate to (0,0)
        myX = 0.0;
        myY = 0.0;
    }

    public Coordinate(double x, double y){
        myX = x;
        myY = y;
    }

    public double getX(){ return myX; }
    public double getY(){ return myY; }

    public String toString(){
        return "(" + myX + ", " + myY + ")";
    }

    public boolean equals(Coordinate rhs){
        double EPS = 0.001
        return Math.abs(rhs.getX()-myX)<EPS && Math.abs(rhs.getY()-myY)<EPS;
    }

    public double distance(Coordinate rhs) {
        // ((x2-x1)**2 + (y2-y1)**2)**0.5
        return Math.sqrt(Math.pow(myX-rhs.getX(),2)+Math.pow(myY-rhs.getY(),2));
    }

    public int compareTo(Coordinate rhs) {
        // compare distances to the origin
        // if rhs is further, value is negative
        // if rhs is closer, value is positive
        return distance(new Coordinate()) - rhs.distance(new Coordinate());
    }

    public void sort(ArrayList <Coordinate> list){
        int i,j,min;
        for (j=0; j<n-1; j++) {
            min = j;
            for (i=j+1; i<n; i++) {
                if (list.get(i).compareTo(list.get(min)) < 0)
                    min = i;
            }
            if ( min != j ) {
                Coordinate tmp = list.get(j);
                list.set(j, list.get(min));
                list.set(min, tmp);
            }
        }
    }
    public int search(ArrayList <Coordinate> list){
        int found = 0;
        for (Coordinate coord : list){
            double fromOrigin = coord.distance(new Coordinate());
            if (fromOrigin >= 4.0 && fromOrigin <= 7.0){
                System.out.println("Coordinate found: " + coord + ", with size: " + fromOrigin);
                found++;
            }
        }
    }
    main() {
        /* to do */
    }
}