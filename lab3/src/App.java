import java.util.ArrayList;
import java.util.Properties;

import Cocktail.Cocktail;


/**
 * @author <a href="https://github.com/Eaeajj/Java-Labz">Zalesskiy Oleg</a>
 * @version 1.0
 */
public class App {

    public static Properties prop;
    public static void main(String[] args) throws Exception {

        // WhiteRussian whiteRussian = new WhiteRussian();
        // IcedVodka icedVodka = new IcedVodka();

        // try {
        //     prop = new Properties();
        //     ArrayList<Cocktail> cs = new ArrayList<Cocktail>();

        //     cs.add(whiteRussian);
        //     cs.add(icedVodka);
        //     IOFileHandler.writeToFile("./src/mockdb.txt", cs);
        //     ArrayList<Cocktail> arr = IOFileHandler.readFromFile("./src/mockdb.txt");
        //     System.out.println("\n---------------\n");
        //     for (int i = 0; i < arr.size(); i++) {
        //         System.out.println(arr.get(i).toString());
        //     }
        // } catch (IOException e) {
        //     System.err.println("IOexc" + e.getMessage());;
        // }
        


        ArrayList<Cocktail> arr = IOFileHandler.readFromFile("./src/mockdb.txt");
        while (true) {
            try {
                int sw = AppController.menu();
                switch (sw) {
                    case 1:
                        Run.readCocktails(arr);
                        break;
                    case 2:
                        Run.addCocktail(arr);
                        break;
                    case 3:

                        break;
                    case 4:
                        
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                System.err.println("Somethig happened" + e.getMessage());
            }
        }
        
    
}   

}
