/**
 * creates a gong subclass of percussion and instrument
 * @author Jeremy Cooley
 * @version 1.0 Oct. 20 2015
 */

public class Gong extends Percussion {
     /**
      * does nothing except lets the class run/compile
      * @param args the standard ars for a main method
      */
    public static void main(String[] args) {

    }

    /**
     * creates a gong
     * @param price self explanatory
     * @param serialNum self explanatory
     * @param canBeBanged self explanatory
     */
    public Gong(int price, int serialNum, boolean canBeBanged) {
        super(price, serialNum, canBeBanged);
    }


    /**
     * plays the instrument
     * @return String a string of the sound
     */
    public String play() {
        return "GOOOONNNNNGGGGGGGGGGGGGGG!!!!!! Save a drummer, bang a gong.";
    }


    /**
     * returns all of the gong's methods
     * @return a string of all of the methods
     */
    public String toString() {
        return getPrice() + ", " + getSerialNum() + ", " + getCanBeBanged();
    }
}
