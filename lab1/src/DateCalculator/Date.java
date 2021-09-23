package DateCalculator;
/**
 * Model level of DateCalculator
 * @author <a href="https://github.com/Eaeajj/Java-Labz">Zalesskiy Oleg</a>
 * @version 1.0
 */
public class Date {

    private final int day;
    private final String month;
    Date(int day, String month) {
        this.month = month;
        this.day = day;
    }
    
    /**@return Returns the number of days that have passed 
     * from the beginning of the year to Date date*/
    public int returnDaysSinceLastYear(){
        int counter = 0;
        for (int i = 0; i < Months.month.length; i++) {
            if (this.month.equals(Months.month[i])) {
                return counter + this.day - 1;
            }
            counter += Months.monthDay[i];
        }

        return counter;
    }
}