import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3 {

    public static void main(String[] args) {
        Day3 obj = new Day3();
        System.out.println();
    }

    public Day3() {

    }

    public int receiveAtLeastOne() {
        try {
            File file = new File("data/Day3.txt");
            Scanner scanner = new Scanner(file);
            String line = "";
            int horiz = 0;
            int vert = 0;
            

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
            }
            scanner.close();

            ArrayList<String> locations = new ArrayList<String>(); 
            int repeats = 0;

            for (int i = 0; i < line.length(); i++) {
                if (line.substring(i, i + 1).equals("^"))
                    vert++;
                if (line.substring(i, i + 1).equals("v"))
                    vert--;
                if (line.substring(i, i + 1).equals(">"))
                    horiz++;
                if (line.substring(i, i + 1).equals("<"))
                    horiz--;
                if ()
            }

            return repeats;

        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

}