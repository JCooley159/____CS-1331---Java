/**
 * creates a guitar subclass of stringed and instrument
 * @author Jeremy Cooley
 * @version 1.0 Oct. 20 2015
 */

public class Guitar extends Stringed {
     /**
      * does nothing except lets the class run/compile
      * @param args standard argument
      */
    public static void main(String[] args) {

    }


    /**
     * creates a guitar
     * @param price the price
     * @param serialNum the serialNum
     * @param numOfStrings the numOfStrings
     */
    public Guitar(int price, int serialNum, int numOfStrings) {
        super(price, serialNum, numOfStrings);
    }


    /**
     * plays the instrument
     * @return String of the sound
     */
    public String play() {
        return "Deedle lee, deedle lee, dedle lee, Bwahhhhh!!!";
    }


    /**
     * returns all of the guitar's methods
     * @return a string of all of the methods
     */
    public String toString() {
        return getPrice() + ", " + getSerialNum() + ", " + getNumOfStrings();
    }
}
