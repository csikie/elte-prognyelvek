class Calc {
    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                throw new IllegalArgumentException("Nem megfelelo szamu argumentum");
            }
            else {
                double x = Double.parseDouble(args[0]);
                char m = args[1].charAt(0);
                double y = Double.parseDouble(args[2]);

                switch (m) {
                    case '+':
                        System.out.println("Összeg: " + (x + y));
                        break;
                    case '-':
                        System.out.println("Különbség: " + (x - y));
                        break;
                    case '*':
                        System.out.println("Szorzat: " + (x * y));
                        break;
                    case '/':
                        if (y == 0) {
                            throw new ArithmeticException("Nullaval valo osztasa.");
                        }
                        System.out.println("Osztási maradék: " + (x / y));
                        break;
                    default:
                        throw new IllegalArgumentException("Nem tamogatott muvelet.");
                }  
            }
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}