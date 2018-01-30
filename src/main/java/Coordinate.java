public class Coordinate {

    private int x;
    private int y;

    private Coordinate(final int x, final int y) {
        if(x <= 0 || y <= 0){
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
    }

    public static Coordinate of(int x, int y){
        return new Coordinate(x,y);
    }

}
