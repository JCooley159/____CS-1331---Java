import java.util.ArrayList;

 /**
 * Tests all of the code within the folder
 * @author Jeremy Cooley
 * @version 1.0 Oct. 20 2015
 */

public class MusicStore {

    /**
     * tests all of the code within all of the classes and catches all of the
     * exceptions that could be thrown
     * @param args the usual String[] args argument
     */
    public static void main(String[] args) {
        try {
            Guitar fender = new Guitar(100, 12345, 6);
            Trombone tromboner = new Trombone(200, 23456, 0);
            Oboe hoboe = new Oboe(175, 00001, true);
            Gong gongitty = new Gong(25, 99999, true);

            ArrayList<Instrument> instrumentsArray = new ArrayList<Instrument>()
            { {
                    add(fender);
                } };
            Musician jerry = new Musician(instrumentsArray, "Jerry", 300);

            try {
                jerry.sell(fender);
            } catch (LastInstrumentException g) {
                System.out.println(g.getMessage());
            } catch (InstrumentNotFoundException h) {
                System.out.println(h.getMessage());
            }

            try {
                jerry.purchase(fender);
            } catch (NotEnoughFundsException e) {
                System.out.println(e.getMessage());
            } catch (SameInstrumentException f) {
                System.out.println(f.getMessage());
            }

            try {
                jerry.purchase(gongitty);
            } catch (NotEnoughFundsException e) {
                System.out.println(e.getMessage());
            } catch (SameInstrumentException f) {
                System.out.println(f.getMessage());
            }

            try {
                jerry.purchase(hoboe);
            } catch (NotEnoughFundsException e) {
                System.out.println(e.getMessage());
            } catch (SameInstrumentException f) {
                System.out.println(f.getMessage());
            }

            try {
                jerry.sell(tromboner);
            } catch (InstrumentNotFoundException h) {
                System.out.println(h.getMessage());
            } catch (LastInstrumentException g) {
                System.out.println(g.getMessage());
            }

            try {
                jerry.purchase(tromboner);
            } catch (NotEnoughFundsException e) {
                System.out.println(e.getMessage());
            } catch (SameInstrumentException f) {
                System.out.println(f.getMessage());
            }

            System.out.println(jerry.numOfInstruments());

            System.out.println(fender);
            System.out.println(tromboner);
            System.out.println(hoboe);
            System.out.println(gongitty);

            System.out.println(fender.play());
            System.out.println(tromboner.play());
            System.out.println(hoboe.play());
            System.out.println(gongitty.play());


        } catch (Exception i) {
        }
    }
}
