package Cocktail.Ingredients;
import Cocktail.Ingredient;

/**
 * Represents a Vodka class extended from {@link Ingredient}
 * @author <a href="https://github.com/Eaeajj/Java-Labz">Zalesskiy Oleg</a>
 * @version 1.0
 */
public class Vodka extends Ingredient {
    /**
     * @param volume ingredient volume in milliliters
     * @param abv alcohol by volume in percent
     * @throws Exception  throws exception with correcponding message
     */
    public Vodka(int volume, float abv) throws Exception {
        super(volume, abv);
    }
    /**
     * @param abv overriden setter for class Vodka 
     * for validating input
     */
    @Override
    public void setAbv(float abv) throws Exception {
        if (abv < 36 || abv > 60) {
            throw new Exception("\nABV should be between [36, 60] for vodka");
        }
        this.abv = abv;
    }

}
