class Main {
    public static void main(String[] args) {
        Point[] array = new Point[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter x =");
            double x = Double.parseDouble(System.console().readLine());
            System.out.print("Enter y =");
            double y = Double.parseDouble(System.console().readLine());

            array[i] = new Point(x, y);
        }

        double centerX = 0;
        double centerY = 0;
        for (int i = 0; i < 3; i++) {
            centerX += array[i].getX();
            centerY += array[i].getY();
        }

        centerX /= 3;
        centerY /= 3;

        Point center = new Point(centerX, centerY);
        System.out.println("Tomegkozeppont: " + center.toString());
    }
}