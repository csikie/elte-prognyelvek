class CircleMain {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.x = 0;
        c.y = 0;
        c.radius = 5;

        System.out.println(c.getArea());

        c.enlarge(3.0);
        System.out.println(c.radius);
    }
}