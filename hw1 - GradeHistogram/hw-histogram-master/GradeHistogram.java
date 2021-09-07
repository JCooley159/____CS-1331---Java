import java.util.Scanner;
import java.io.File;

public class GradeHistogram {
    public static void main(String[] args) throws Exception {


// Reads in the file and gets the interval size from the input.

        String fileName = args[0];
        Scanner scannerFile = new Scanner(new File (fileName));
        int intervalSize = 0;                                       ////////////

        if (args.length == 1) {
            System.out.print("Type a bucket size: ");
            Scanner scannerInterval = new Scanner(System.in);
            intervalSize = scannerInterval.nextInt();           ////////////
        } else {
            intervalSize = Integer.parseInt(args[1]);           ////////////
        }

// Iterates through file, gets all numbers and puts them in a long string
// separated by commas.
        String gradeString = "";
        while (scannerFile.hasNext()) {
            String line = scannerFile.nextLine();
            line = line.replaceAll("\\s", "");
            String[] separatedLine = line.split(",");
            gradeString += separatedLine[1] + ",";
        }

// Splits the gradeString by the commas, and then iterates through the array and
// sorts them by how they fit into the intervals.
        String[] gradeArray = gradeString.split(",");
        for (int i = 100; i >= 0; i -= intervalSize) {
            if (i == 100) {
                System.out.printf("\n%d - %d | ", i, i - intervalSize + 1);
            } else if (i < 100 && i > 10) {
                System.out.printf("\n %d - %d | ", i, i - intervalSize + 1);
            } else if (i == 10) {
                System.out.printf("\n %d - %d  | ", i, i - intervalSize + 1);
            } else if (i < 10 && i > 0) {
                System.out.printf("\n  %d - %d  | ", i, i - intervalSize + 1);
            } else if (i == 0) {
                System.out.printf("\n  0 - 0  | ");
            }
            for (int j = 0; j < gradeArray.length; j++) {
//                String gradeNumStr = gradeArray[j];
                int gradeNum = Integer.parseInt(gradeArray[j]);
                if (gradeNum <= i && gradeNum >= i - intervalSize) {
                    System.out.print("[]");
                }
            }
        }
        System.out.println();
    }
}
