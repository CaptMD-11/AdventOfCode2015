import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
        Day2 obj = new Day2();
        System.out.println(obj.totalRibbon());
    }

    public Day2() {

    }

    // PART I METHOD
    public int totalSqFtWrapPaper() {
        try {
            File file = new File("data/Day2.txt");
            Scanner scanner = new Scanner(file);
            String line = "";
            int total = 0;

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                int length = Integer.parseInt(line.substring(0, line.indexOf("x")));
                int width = Integer.parseInt(line.substring(line.indexOf("x") + 1, line.lastIndexOf("x")));
                int height = Integer.parseInt(line.substring(line.lastIndexOf("x") + 1));
                int[] arr = { length * width, width * height, height * length };
                int min = arr[0];
                for (int i : arr) {
                    if (i < min)
                        min = i;
                }
                total += (2 * length * width) + (2 * width * height) + (2 * height * length) + min;
            }
            scanner.close();
            return total;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    // PART II METHOD
    public int totalRibbon() {
        try {
            File file = new File("data/Day2.txt");
            Scanner scanner = new Scanner(file);
            String line = "";
            int total = 0;

            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                int length = Integer.parseInt(line.substring(0, line.indexOf("x")));
                int width = Integer.parseInt(line.substring(line.indexOf("x") + 1, line.lastIndexOf("x")));
                int height = Integer.parseInt(line.substring(line.lastIndexOf("x") + 1));
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(length);
                list.add(width);
                list.add(height);
                int min1 = list.get(0);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) < min1)
                        min1 = list.get(i);
                }
                for (int i = list.size() - 1; i > -1; i--) {
                    if (min1 == list.get(i)) {
                        list.remove(i);
                        break;
                    }
                }
                int min2 = list.get(0);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i) < min2)
                        min2 = list.get(i);
                }
                for (int i = list.size() - 1; i > -1; i--) {
                    if (min2 == list.get(i)) {
                        list.remove(i);
                        break;
                    }
                }
                total += (2 * min1) + (2 * min2) + (length * width * height);
            }
            scanner.close();
            return total;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

}