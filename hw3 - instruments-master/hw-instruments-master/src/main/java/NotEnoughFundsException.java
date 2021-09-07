/**
 * creates an exception if musician doesn't have enough funds
 * @author Jeremy Cooley
 * @version 1.0 Oct. 20 2015
 */

public class NotEnoughFundsException extends Exception {
     /**
      * constructor for the exception
      * @param msg the message to display
      */
    public NotEnoughFundsException(String msg) {
        super(msg);
    }


    /**
     * constructor for the exception
     */
    public NotEnoughFundsException() {
        super();
    }
}
