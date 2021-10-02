class PointMain {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 2;
        p.y = 3;
        System.out.println("x: " + p.x + " y: " + p.y);
        p.move(1,1);
        System.out.println("x: " + p.x + " y: " + p.y);
        //p.mirror(0,0);
        //System.out.println("x: " + p.x + " y: " + p.y);

        Point origin = new Point();
        origin.x = 0;
        origin.y = 0;
        p.mirror(origin);
        System.out.println("x: " + p.x + " y: " + p.y);
        System.out.println(p.distance(origin));
    }
}