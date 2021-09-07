/**
 * creates a percussion subclass of instrument that also includes a canBeBanged
 * variable
 * @author Jeremy Cooley
 * @version 1.0 Oct. 20 2015
 */

public abstract class Percussion extends Instrument {
    private int price;
    private int serialNum;
    private boolean canBeBanged;


    /**
     * creates a new percussion object and adds a canBeBanged boolean
     * @param price   price of instrument
     * @param serialNum  serialNumber of Instrument
     * @param canBeBanged if the instrument can be banged
     */
    public Percussion(int price, int serialNum, boolean canBeBanged) {
        super(price, serialNum);
        this.canBeBanged = canBeBanged;
    }


    /**
     * returns if Instrument can be banged
     * @return a boolean representing ^
     */
    public boolean getCanBeBanged() {
        return canBeBanged;
    }

    /**
     * plays the instrument
     * @return String
     */
    public abstract String play();
}
