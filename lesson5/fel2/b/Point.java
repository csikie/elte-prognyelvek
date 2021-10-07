public class Point
{
    private double x, y;

    public Point(double init_x, double init_y)
    {
        x = init_x;
        y = init_y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public static Point centerOfMass(Point[] array) {
        double centerX = 0;
        double centerY = 0;
        for (int i = 0; i < array.length; i++) {
            centerX += array[i].getX();
            centerY += array[i].getY();
        }

        centerX /= array.length;
        centerY /= array.length;

        return new Point(centerX, centerY);
    } 
}