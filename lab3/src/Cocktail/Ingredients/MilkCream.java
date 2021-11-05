package Cocktail.Ingredients;

import Cocktail.Ingredient;

/**
 * Represents a MilkCream class extended from {@link Ingredient}
 * @author <a href="https://github.com/Eaeajj/Java-Labz">Zalesskiy Oleg</a>
 * @version 1.0
 */
public class MilkCream  extends Ingredient {
    /**
     * @param volume ingredient volume in milliliters
     * @param abv alcohol by volume in percent
     * @throws Exception  throws exception with correcponding message
     */
    public MilkCream(int volume, float abv) throws Exception {
        super(volume, abv);
    }

    /**
     * @param abv overriden setter for class MilkCream 
     * for validating input
     */
    @Override
    public void setAbv(float abv) throws Exception {
        if (abv != 0) {
            throw new Exception("\nABV should be equal 0 for milk cream ");
        }
        this.abv = abv;
    }

}