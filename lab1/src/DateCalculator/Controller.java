package DateCalculator;
import java.util.Scanner;


/**
 * Controller level of DateCalculator
 * @author <a href="https://github.com/Eaeajj/Java-Labz">Zalesskiy Oleg</a>
 * @version 1.0
 */
public class Controller {
    
    /**@throws Exception called when user input is wrong */
    public static Date inputDate() throws Exception{
        Scanner sn = new Scanner(System.in);
        
        while (true) {
            try {
                String date = sn.nextLine();        
                String[] dateList = date.split(" ");
                if (dateList.length != 2) {
                    throw new Exception("Wrong input format");
                }
                
                int day = Integer.parseInt(dateList[0]);
                String month = dateList[1];
                
                for (int i = 0; i < Months.month.length; i++) {
                    if (month.equals(Months.month[i])) {
                        if (day < 1 || Months.monthDay[i] > day) {
                            sn.close();
                            return new Date(day, month);
                        }
                    }
                }
                
                throw new Exception("Oops, wrong input");
            } catch (Exception e) {
                View.error(e.getMessage());
                View.print("Try again, pls!");
            }        
        }
    }
}