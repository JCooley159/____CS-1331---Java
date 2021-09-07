import java.util.ArrayList;
/**
 * Manages the into of and instruments of a musician
 * @author Jeremy Cooley
 * @version 1.0 Oct. 20 2015
 */

public class Musician {
    private String name;
    private int funds;
    private ArrayList<Instrument> instruments;


    /**
     * a constructor for a musician
     * @param instruments the arraylist of owned instruments
     * @param name the String name of the musician
     * @param funds the int number of funds the musician has
     */
    public Musician(ArrayList<Instrument> instruments, String name, int funds) {
        this.instruments = instruments;
        this.name = name;
        this.funds = funds;
    }


    /**
     * a method to get the name of the musician
     * @return an string for the name of the musician
     */
    public String getName() {
        return name;
    }


    /**
     * a method to get the funds of the musician
     * @return an int for the funds of the musician
     */
    public int getFunds() {
        return funds;
    }


    /**
     * a method to get the number of instruments the musician has
     * @return an int for the number of instruments
     */
    public int numOfInstruments() {
        return instruments.size();
    }


    /**
     * adds a new instrument to the array and subtracts the price from the funds
     * @param instrumentToBuy the instrument to buy
     * @throws NotEnoughFundsException if buying the instrument would put the
     * funds below zero
     * @throws SameInstrumentException is musician tries to buy the same
     * instrument
     */
    public void purchase(Instrument instrumentToBuy) throws
            NotEnoughFundsException, SameInstrumentException {
        if ((funds - instrumentToBuy.getPrice()) < 0) {
            throw new NotEnoughFundsException("You don't have enough money,"
                + "dummy! (And stealing is WRONG.)");
        }

        for (int i = 0; i < instruments.size(); i++) {
            if (instrumentToBuy.equals(instruments.get(i))) {
                throw new SameInstrumentException("You're killing me, smalls!"
                    + "You can't buy the same instrument!!!");
            }
        }
        funds -= instrumentToBuy.getPrice();
        instruments.add(instrumentToBuy);
    }


    /**
     * removes an instrument to the array and subtracts adds the price to the
     * funds
     * @param instrumentToSell the instrument to sell
     * @throws LastInstrumentException if the instrumentToSell is the only one
     * in the ArrayList
     * @throws InstrumentNotFoundException if the instrumentToSell is not in the
     * ArrayList
     */
    public void sell(Instrument instrumentToSell) throws
            LastInstrumentException, InstrumentNotFoundException {
        if (instruments.size() == 1) {
            throw new LastInstrumentException("Your music is your livelihood!"
                + "You can't sell your last instrument!");
        }
        if (!(instruments.remove(instrumentToSell))) {
            throw new InstrumentNotFoundException("Are you stupid? You can't"
                + "sell an instrument you don't have! That's called *lying*.");
        }

        funds += instrumentToSell.getPrice();
        instruments.remove(instrumentToSell);
    }

}
