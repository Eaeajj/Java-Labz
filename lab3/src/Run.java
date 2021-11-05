import java.util.ArrayList;

import Cocktail.Cocktail;
import Cocktail.Ingredient;
import Cocktail.Cocktails.IcedVodka;
import Cocktail.Cocktails.WhiteRussian;
import Cocktail.Ingredients.Ice;
import Cocktail.Ingredients.Liquor;
import Cocktail.Ingredients.MilkCream;
import Cocktail.Ingredients.Vodka;

public class Run {


  public static void addCocktail(ArrayList<Cocktail> arr) {
    while (true) {
      try {
        AppView.cocktailMenu();
        int c = AppController.addCocktail();
        switch (c) {
          case 1:
            WhiteRussian whiteRussian = addWhiteRussian();
            arr.add(whiteRussian);
            break;

          case 2:
            IcedVodka icedVodka = addIcedVodka();
            arr.add(icedVodka);
            break;
          
          default:
            throw new Exception("Run.addCocktail Exception!");
        }
      } catch (Exception e) {
        System.err.println("Oops. wrong input" + e.getMessage());
      }
      
    }
  }


  private static WhiteRussian addWhiteRussian() throws Exception{

    WhiteRussian whiteRussian = new WhiteRussian();
    Vodka vodka = AppController.addVodka();
    Liquor liquor = AppController.addLiquor();
    MilkCream milkCream = AppController.addMilkCream();
    Ice ice = AppController.addIce();

    Ingredient[] ingredients = {ice, milkCream, liquor, vodka};
    whiteRussian.setIngredients(ingredients);
    return whiteRussian;
  }
  
  private static IcedVodka addIcedVodka() throws Exception{

    IcedVodka icedVodka = new IcedVodka();
    return icedVodka;
  }

  public static void readCocktails(ArrayList<Cocktail> arr) {
    try {
      System.out.print("\n");
      for (int i = 0; i < arr.size(); i++) {
        System.out.print(arr.get(i).toString());
      }
      System.out.println("\nPress Enter key to continue...");
      System.in.read();  
    } catch (Exception e) {
      System.err.println("Exception" + e.getMessage());
    }
    
  }
}
