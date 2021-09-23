package DateCalculator;


/**
 * View level of DateCalculator
 * @author <a href="https://github.com/Eaeajj/Java-Labz">Zalesskiy Oleg</a>
 * @version 1.0
 */
class View {
    /**@param msg View msg */
    public static void print(String msg) {
        System.out.println(msg);
    }

    /**@param msg View error msg */
    public static void error(String msg) {
        print("Error: " + msg);
    }
}