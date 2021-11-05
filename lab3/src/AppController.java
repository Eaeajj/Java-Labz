// import java.lang.reflect.Array;
// import java.util.ArrayList;

import java.util.Scanner;

import Cocktail.Ingredient;
import Cocktail.Cocktails.WhiteRussian;
import Cocktail.Ingredients.Ice;
import Cocktail.Ingredients.Liquor;
import Cocktail.Ingredients.MilkCream;
import Cocktail.Ingredients.Vodka;

// import Cocktail.Action;
// import Cocktail.Cocktail;
// import Cocktail.Ingredient;
// import Cocktail.Cocktails.WhiteRussian;
// import Cocktail.Ingredients.Ice;
// import Cocktail.Ingredients.Liquor;
// import Cocktail.Ingredients.MilkCream;
// import Cocktail.Ingredients.Vodka;

public class AppController {
  
  public static int menu() throws Exception {
    int input = -1;
    Scanner in = new Scanner(System.in); 
    while (true) {
      try {
        AppView.printMenu();
        String buf = in.next();
        input = Integer.parseInt(buf);
        if (input < 1 || input > 4 ) {
          throw new Exception("Wrong range of options\n");
        }
        break;
      } catch (Exception e) {
        System.err.println("\nOops wrong input\n"+ e.getMessage());
      }
    }
    return input;
  }

    private static int addVol() {
    int vol = -1;
    Scanner in = new Scanner(System.in);
    
    AppView.volume();
    String buf = in.nextLine();
    vol = Integer.parseInt(buf);
    return vol;
  }

  private static float addAbv() {
    float abv = -1;
    Scanner in = new Scanner(System.in);

    AppView.abv();
    String buf = in.nextLine();
    abv = Float.parseFloat(buf);
    return abv;
  }

  public static int addCocktail() throws Exception {
    int input = -1;
    Scanner in = new Scanner(System.in);
    String buf = in.nextLine();
    input = Integer.parseInt(buf);
    if (input < 1 || input > 2 ) {
      throw new Exception("wrong range of options"); 
    }
    return input;
  }

  public static Vodka addVodka() throws Exception {
    float abv = addAbv();
    int vol = addVol();
    Vodka vodka = new Vodka(vol, abv);
    return vodka;
  }

  public static Ice addIce() throws Exception {
    float abv = addAbv();
    int vol = addVol();
    Ice ice = new Ice(vol, abv);
    return ice;
  }

  public static Liquor addLiquor() throws Exception {
    float abv = addAbv();
    int vol = addVol();
    Liquor liquor = new Liquor(vol, abv);
    return liquor;
  }

  public static MilkCream addMilkCream() throws Exception {
    float abv = addAbv();
    int vol = addVol();
    MilkCream milkCream = new MilkCream(vol, abv);
    return milkCream;
  }

}
