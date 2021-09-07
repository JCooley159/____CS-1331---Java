/**
 * creates a woodwind subclass of instrument that also includes a hasAReed
 * variable
 * @author Jeremy Cooley
 * @version 1.0 Oct. 20 2015
 */

public abstract class Woodwind extends Instrument {
    private int price;
    private int serialNum;
    private boolean hasAReed;


    /**
     * creates a new woodwind object and adds a hasAReed boolean
     * @param price   price of instrument
     * @param serialNum  serialNumber of Instrument
     * @param hasAReed if the instrument has a reed
     */
    public Woodwind(int price, int serialNum, boolean hasAReed) {
        super(price, serialNum);
        this.hasAReed = hasAReed;
    }


    /**
     * returns if Instrument has a reed
     * @return a boolean representing ^
     */
    public boolean getHasAReed() {
        return hasAReed;
    }


    /**
     * plays the instrument
     * @return String
     */
    public abstract String play();
}
