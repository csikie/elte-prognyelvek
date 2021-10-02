class Greetings2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Túl kevés vagy túl sok argumentum adtál meg!");
        }

        System.out.println("Hello " + args[0] + "!");
    }
}
