import java.io.File;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) throws Exception {
        Day1 obj = new Day1();
        System.out.println(obj.firstCharBasement());
    }

    public Day1() {

    }

    // PART I METHOD
    public int whatFloor() {
        try {
            int floor = 0;
            File file = new File("data/Day1.txt");
            Scanner scanner = new Scanner(file);
            String line = "";

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
            }

            scanner.close();

            for (int i = 0; i < line.length(); i++) {
                if (line.substring(i, i + 1).equals("("))
                    floor++;
                else
                    floor--;
            }

            return floor;

        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    // PART II METHOD
    public int firstCharBasement() {
        try {
            int floor = 0;
            File file = new File("data/Day1.txt");
            Scanner scanner = new Scanner(file);
            String line = "";

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
            }

            scanner.close();

            for (int i = 0; i < line.length(); i++) {
                if (line.substring(i, i + 1).equals("("))
                    floor++;
                if (line.substring(i, i + 1).equals(")"))
                    floor--;
                if (floor == -1)
                    return i + 1;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

}
