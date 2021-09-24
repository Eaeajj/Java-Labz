package Cocktail.Ingredients;

import Cocktail.Ingredient;

public class Ice extends Ingredient {
    
    public Ice(int volume, float abv) throws Exception {
        super(volume, abv);
    }

    @Override
    public void setAbv(float abv) throws Exception {
        if (abv != 0) {
            throw new Exception("sdasd");
        }
        this.abv = abv;
    }
}