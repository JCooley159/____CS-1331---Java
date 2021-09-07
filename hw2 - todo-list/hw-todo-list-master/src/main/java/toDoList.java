import java.util.Scanner;
import java.io.File;

public class toDoList {

    public static void main(String[] args) throws Exception {

        Scanner scannerFile = new Scanner(new File ("users.csv"));
        System.out.print("What is your name? ");
        Scanner scanName = new Scanner(System.in);
        String name = scanName.nextLine();
        for (int x = 0; x <= scannerFile.length - 1; x++) {
            if (name.equals(scannerFile[x])) {
                String nameFileStr = name + ".csv";
            } else {
                return null;
            }
        }
        Scanner goalArray = new Scanner(new File(nameFileStr));




        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j == 0) {
                    String goalName = goalArray[i][j];
                    System.out.println(goalName + " - Complete");
                } else if (j != 0) {
                    String taskLine = goalArray[i][j];
                    String[] taskLine = taskLine.split(" | ");

                    String taskName = taskLine[0];

                    Int priorityNum = Integer.parseInt(taskLine[1]);
                    if (priorityNum >= 1 && priorityNum <= 3) {
                        String priorityLvl = "Low Priority";
                    } else if (priorityNum >= 4 && priorityNum <= 6) {
                        String priorityLvl = "Medium Priority";
                    } else if (priorityNum >= 7 && priorityNum <= 10) {
                        String priorityLvl = "High Priority";
                    }

                    String dateAndTime = taskLine[2];
                    String[] dateAndTime = dateAndTime.split("T");
                    String dueDate = dateAndTime[0];
                    String dueTime = dateAndTime[1];

                    String completeBoolean = taskLine[3];
                    if (completeBoolean.equals("true")) {
                        String completeOrNot = "Complete";
                    } else if (completeBoolean.equals("false")) {
                        String completeOrNot = "Incomplete";
                    }

                    System.out.println("\t - " + taskName + " - " + priorityLvl + " - due" + dueDate + " " + dueTime + " - " + completeOrNot);
                }
            }
        }

    }
}
