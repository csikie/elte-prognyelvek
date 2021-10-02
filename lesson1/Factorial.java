class Factorial {
    public static void main(String[] args) {
        int x = Integer.parseInt(System.console().readLine());

        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        System.out.println("Az " + x + " faktoriálisa: " + fact);
    }
}