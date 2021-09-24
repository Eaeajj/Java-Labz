package Cocktail.Ingredients;

import Cocktail.Ingredient;

public class Vodka extends Ingredient {
    
    public Vodka(int volume, float abv) throws Exception {
        super(volume, abv);
    }

    @Override
    public void setAbv(float abv) throws Exception {
        if (abv < 36 || abv > 60) {
            throw new Exception("ABV is not correct for vodka");
        }
        this.abv = abv;
    }

}
