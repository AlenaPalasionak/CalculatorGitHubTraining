import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main {
    private static final Log LOG = LogFactory.getLog(Main.class);

    public static void main(String[] args) {
        //Property
        final int value1 = Integer.parseInt(args[0]);
        final int value2 = Integer.parseInt(args[1]);


        System.out.println("ADD()=" + new CalculatorImpl().add(value1, value2));
        System.out.println("MULTIPLY()=" + new CalculatorImpl().multiply(value1, value2));


        try {
            new CalculatorImpl().divide(value1, value2);
        } catch (DivisionException e) {
            //e.printStackTrace();
            System.out.println("All is good");
            LOG.error("All is good" , e);
            System.exit(0);
        }
        System.out.println("All ois bad!!!!");

        /*
         try {
             new CalculatorImpl().divide(0, 0);
         } catch (DivisionException e) {
             e.printStackTrace();
         }
        */


    }
}
