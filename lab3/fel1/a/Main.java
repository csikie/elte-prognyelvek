import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        File input = new File(args[0]);

        try {
            BufferedReader br = new BufferedReader(new FileReader(input));

            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                int sum = 0;
                for (String num : parts) {
                    sum += Integer.parseInt(num);
                }
                System.out.println(sum);
            }
            br.close();
        
        } catch (FileNotFoundException ex) {
            System.out.println("Nem tudom elerni a fajlt. (" + args[0] + ")");
        } catch (IOException ex) {
            System.out.println("IO hiba.");
        } 
    }
}