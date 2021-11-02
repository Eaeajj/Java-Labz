import Cocktail.Ingredient;
import Cocktail.Cocktails.WhiteRussian;
import Cocktail.Ingredients.Ice;
import Cocktail.Ingredients.Liquor;
import Cocktail.Ingredients.MilkCream;
import Cocktail.Ingredients.Vodka;
import Cocktail.Action;

/**
 * @author <a href="https://github.com/Eaeajj/Java-Labz">Zalesskiy Oleg</a>
 * @version 1.0
 */
public class App {
    public static void main(String[] args) throws Exception {
        Vodka vodka = new Vodka(30, 40);
        Liquor liquor = new Liquor(30, 20);
        MilkCream milkCream = new MilkCream(30, 0);
        Ice ice = new Ice(60, 0);

        Action addIce = Action.ADD;
        Action pourMilkCream = Action.POUR;
        Action pourLiquor = Action.POUR;
        Action pourVodka = Action.POUR;
        Action stir = Action.STIR;

        Ingredient[] ingredients = {ice, milkCream, liquor, vodka};
        Action[] actions = {addIce, pourMilkCream, pourLiquor, pourVodka, stir};
        
        WhiteRussian whiteRussian = new WhiteRussian(actions, ingredients);

        System.out.println("\nAlcohol by volume in this cocktail " + whiteRussian.getAbv());

    }
}
