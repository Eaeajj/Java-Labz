package DateCalculator;


/**
 * App level of DateCalculator
 * @author <a href="https://github.com/Eaeajj/Java-Labz">Zalesskiy Oleg</a>
 * @version 1.0
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        View.print("\nEnter date in format '18 October'\n");
        Date d = Controller.inputDate();
        int days = d.returnDaysSinceLastYear();
        System.out.println("\n\nDays since beginning of year: " + days);
    }

}