class Circle {
    double x;
    double y;
    double radius;

    void enlarge(double f) {
        // radius *= f ==> radius = radius * f
        radius *= f;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}