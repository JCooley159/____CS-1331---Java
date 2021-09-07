/**
 * creates an exception if musician tries to sell instrument he doesn't have
 * @author Jeremy Cooley
 * @version 1.0 Oct. 20 2015
 */

public class InstrumentNotFoundException extends Exception {
     /**
      * constructor for the exception
      * @param msg the message to display
      */
    public InstrumentNotFoundException(String msg) {
        super(msg);
    }


    /**
     * constructor for the exception
     */
    public InstrumentNotFoundException() {
        super();
    }
}
