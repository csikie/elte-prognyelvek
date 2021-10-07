class Main {
    public static void main(String[] args) {
        System.out.print("Pontok mennyisege: ");
        int n = Integer.parseInt(System.console().readLine());
        Point[] array = new Point[n];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter x =");
            double x = Double.parseDouble(System.console().readLine());
            System.out.print("Enter y =");
            double y = Double.parseDouble(System.console().readLine());

            array[i] = new Point(x, y);
        }

        System.out.println("Tomegkozeppont: " + Point.centerOfMass(array));
    }
}