class Calc {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Túl kevés vagy túl sok argumentum adtál meg!");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        System.out.println("Összeg: " + (x + y));
        System.out.println("Különbség: " + (x - y));
        System.out.println("Szorzat: " + (x * y));
        
        if (y != 0) {
            System.out.println("Osztási maradék: " + (x % y));
            System.out.println("Osztási maradék: " + ((double)x / y));
        }
    }
}