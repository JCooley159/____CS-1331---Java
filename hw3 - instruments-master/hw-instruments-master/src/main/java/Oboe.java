/**
 * creates an oboe subclass of woodwind and instrument
 * @author Jeremy Cooley
 * @version 1.0 Oct. 20 2015
 */

public class Oboe extends Woodwind {
     /**
      * does nothing except lets the class run/compile
      * @param args standard
      */
    public static void main(String[] args) {

    }


    /**
     * creates an oboe
     * @param price price of the oboe
     * @param serialNum serial num of the oboe
     * @param hasAReed if the oboe has a reed or not
     */
    public Oboe(int price, int serialNum, boolean hasAReed) {
        super(price, serialNum, hasAReed);
    }


    /**
     * plays the instrument
     * @return String
     */
    public String play() {
        return "Dooooooo doo doo doo-wah";
    }


    /**
     * returns all of the oboe's methods
     * @return a string of all of the methods
     */
    public String toString() {
        return getPrice() + ", " + getSerialNum() + ", " + getHasAReed();
    }
}
