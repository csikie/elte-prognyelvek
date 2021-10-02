class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Circle setRadius: invalid radius.");
        } 

        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() { return this.x; }
    public double getY() { return this.y; }
    public double getRadius() { return this.radius; }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Circle setRadius: invalid radius.");
        }

        this.radius = radius; 
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle(5,2,10);
        System.out.println(c.getArea());
    }
}