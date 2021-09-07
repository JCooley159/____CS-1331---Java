/**
 * creates an exception if musician tries to sell their last instrument
 * @author Jeremy Cooley
 * @version 1.0 Oct. 20 2015
 */

public class LastInstrumentException extends Exception {
     /**
      * constructor for the exception
      * @param msg the message to display
      */
    public LastInstrumentException(String msg) {
        super(msg);
    }


    /**
     * constructor for the exception
     */
    public LastInstrumentException() {
        super();
    }
}
