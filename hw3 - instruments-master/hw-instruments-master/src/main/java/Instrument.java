/**
 * Is an abstract superclass for all instruments that forces them to have the
 * specified methods
 * @author Jeremy Cooley
 * @version 1.0 Oct. 20 2015
 */

public abstract class Instrument {
    private int price;
    private int serialNum;


    /**
     * constructor for the instrument superclass
     * @param price the price of the instrument
     * @param serialNum the serial number of the instrument
     */
    public Instrument(int price, int serialNum) {
        this.price = price;
        this.serialNum = serialNum;
    }


    /**
     * a method to get the price of the instrument
     * @return an int for the price of the instrument
     */
    public int getPrice() {
        return price;
    }


    /**
     * a method to get the serial number of the instrument
     * @return an int for the serial number of the instrument
     */
    public int getSerialNum() {
        return serialNum;
    }


    /**
     * a method to play the instrument
     * @return a string representing the sound of the instrument
     */
    public abstract String play();


    /**
     * a method to compare instruments
     * @param other another object to compare
     * @return a boolean whether or not they are equal
     */
    public boolean equals(Object other) {
        if (null == other) {
            return false;
        } else if (this == other) {
            return true;
        }
        Instrument that = (Instrument) other;
        return this.getSerialNum() == that.getSerialNum();
    }


    /**
     * gets rid of hash code errors
     * @return int to get rid of the errors
     */
    public int hashCode() {
        return 1;
    }

}
