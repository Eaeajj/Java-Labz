package Cocktail.Ingredients;

import Cocktail.Ingredient;

public class MilkCream  extends Ingredient {
    
    public MilkCream(int volume, float abv) throws Exception {
        super(volume, abv);
    }


    @Override
    public void setAbv(float abv) throws Exception {
        if (abv != 0) {
            throw new Exception("ABV should be equal 0 for milk cream ");
        }
        this.abv = abv;
    }
}