package Cocktail.Ingredients;

import Cocktail.Ingredient;


/** 
 * Represents a Liquor class extended from {@link Ingredient}
 * @author <a href="https://github.com/Eaeajj/Java-Labz">Zalesskiy Oleg</a>
 * @version 1.0
 */
public class Liquor extends Ingredient {
    /**
     * @param volume ingredient volume in milliliters
     * @param abv alcohol by volume in percent
     * @throws Exception  throws exception with correcponding message
     */
    public Liquor(int volume, float abv) throws Exception {
        super(volume, abv);
    }

    /**
     * @param abv overriden setter for class Liquor
     * for validating input
     */
    @Override
    public void setAbv(float abv) throws Exception {
        if (abv < 15 || abv > 30) {
            throw new Exception("\nABV should be between [15, 30] for liquor!");
        }
        this.abv = abv;
    }





}
