/**
 * creates a trombone subclass of brass and instrument
 * @author Jeremy Cooley
 * @version 1.0 Oct. 20 2015
 */

public class Trombone extends Brass {
     /**
      * does nothing except lets the class run/compile
      * @param args standard
      */
    public static void main(String[] args) {

    }


    /**
     * creates a trombone
     * @param price price of trombone
     * @param serialNum serial number of trombone
     * @param numOfValves number of valves of trombone
     */
    public Trombone(int price, int serialNum, int numOfValves) {
        super(price, serialNum, numOfValves);
    }


    /**
     * plays the instrument
     * @return String
     */
    public String play() {
        return "Bwuh bwuh-uhhh!";
    }


    /**
     * returns all of the trombone's methods
     * @return a string of all of the methods
     */
    public String toString() {
        return getPrice() + ", " + getSerialNum() + ", " + getNumOfValves();
    }
}
