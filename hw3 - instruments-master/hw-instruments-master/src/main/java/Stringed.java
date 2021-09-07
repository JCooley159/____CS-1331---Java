/**
 * creates a stringed subclass of instrument that also includes a numOfStrings
 * variable
 * @author Jeremy Cooley
 * @version 1.0 Oct. 20 2015
 */

public abstract class Stringed extends Instrument {
    private int price;
    private int serialNum;
    private int numOfStrings;


    /**
     * creates a new stringed object and adds a numOfStrings int
     * @param price   price of instrument
     * @param serialNum  serialNumber of Instrument
     * @param numOfStrings how many strings the instrument has
     */
    public Stringed(int price, int serialNum, int numOfStrings) {
        super(price, serialNum);
        this.numOfStrings = numOfStrings;
    }


    /**
     * returns number of strings
     * @return int of the number of strings it has
     */
    public int getNumOfStrings() {
        return numOfStrings;
    }

    /**
     * plays the instrument
     * @return String
     */
    public abstract String play();
}
