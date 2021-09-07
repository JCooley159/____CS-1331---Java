/**
 * creates a brass subclass of instrument that also includes a numOfValves
 * variable
 * @author Jeremy Cooley
 * @version 1.0 Oct. 20 2015
 */

public abstract class Brass extends Instrument {
    private int price;
    private int serialNum;
    private int numOfValves;


    /**
     * creates a new brass object and adds a numOfValves int
     * @param price   price of instrument
     * @param serialNum  serialNumber of Instrument
     * @param numOfValves how many valves the instrument has
     */
    public Brass(int price, int serialNum, int numOfValves) {
        super(price, serialNum);
        this.numOfValves = numOfValves;
    }


    /**
     * returns number of valves
     * @return int of the number of valves it has
     */
    public int getNumOfValves() {
        return numOfValves;
    }


    /**
     * plays the instrument
     * @return String of the sound of the instrument
     */
    public abstract String play();
}
