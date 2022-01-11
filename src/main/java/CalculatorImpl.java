import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CalculatorImpl implements Calculator {
    private static final Log log = LogFactory.getLog(CalculatorImpl.class);

    @Override
    public int add(int value1, int value2) {
        return value1 + value2;
    }

    @Override
    public int subtract(int value1, int value2) {
        return value1 - value2;
    }

    @Override
    public int divide(int value1, int value2)  throws DivisionException {
        if(value2 == 0) {
            throw new DivisionException("value2 == 0");
        }else if (value1 % value2 != 0){
            throw new DivisionException("result is not Integer");
        }

        return value1/value2;
    }

    @Override
    public int multiply(int value1, int value2) {
        return value1*value2;
    }
}
