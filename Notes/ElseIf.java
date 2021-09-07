import java.util.Random;
public class ElseIf {
    public static void main(String[] args) {
        Random rand = new Random();
        in result = rand.nextInt(10);
        System.out.println("Got a "+result);

        if (result == 0) {
            System.out.println("It was 0");
        } else if (result == 1) {
            System.out.println("It was 1");
        } else {
            System.out.println("It was not 0 or 1");
        }


    }
}
