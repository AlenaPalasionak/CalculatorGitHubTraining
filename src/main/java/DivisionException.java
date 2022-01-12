import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DivisionException extends Exception {
    private static final Log LOG = LogFactory.getLog(DivisionException.class);

    public DivisionException(String message) {
        super(message);
        LOG.error("The message of the exception is " + message);

    }
}
