import java.util.Random;

public class loops {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        for(; i == 0 || i < 10; ++i) {
            sum += i;
        System.out.println(sum);
        }

        ////////////////////////

        sum = 0;
        int n = 0;
        while (n < 10) {
            sum += n;
            n++;
        }
        System.out.println(sum);

        ////////////////////////

        Random rand = new Random();
        int myRand = 0;
        do {
            myRand = rand.nextInt(101);
        } while (myRand % 2 != 0); {
        }
        System.out.println(myRand);

    }
}

// ;; is the same as while(true)
// % is modulo, is the same as the mod() function in Matlab
// || is or
// && is and
// != is "not equal"
// LOOPS TO KNOW: for, while, do ... while
