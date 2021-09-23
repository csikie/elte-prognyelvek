import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("Add meg a keresendo szovegreszletet: ");
        String sample = System.console().readLine();

        File input = new File(args[0]);
        Scanner sc = null;

        try {
            sc = new Scanner(input);
            int counter = 0;

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                if (line.contains(sample)) {
                    ++counter;
                }
            }

            System.out.println("counter=" + counter);
        } catch (FileNotFoundException ex) {
            System.out.println("Nem lehet megnyitni a fajlt! (" + args[0] + ")");
        } finally {
            System.out.println("Hello finally ag!");
            sc.close();
        }

        /*try (Scanner sc = new Scanner(input)) {
            int counter = 0;

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                if (line.contains(sample)) {
                    ++counter;
                }
            }

            System.out.println("counter=" + counter);
        } catch (FileNotFoundException ex) {
            System.out.println("Nem lehet megnyitni a fajlt! (" + args[0] + ")");
        }*/
    }
}