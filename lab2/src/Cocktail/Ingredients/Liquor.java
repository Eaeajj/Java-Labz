package Cocktail.Ingredients;

import Cocktail.Ingredient;

public class Liquor extends Ingredient {
    
    public Liquor(int volume, float abv) throws Exception {
        super(volume, abv);
    }

    @Override
    public void setAbv(float abv) throws Exception {
        if (abv < 15 || abv > 30) {
            throw new Exception("ABV is not correct for liquor!");
        }
        this.abv = abv;
    }
}
