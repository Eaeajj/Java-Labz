package Cocktail;

import java.io.Serializable;


public abstract class Cocktail implements Serializable {
    
    protected Ingredient[] ingredients;
    protected Action[] actions;

    public Cocktail(Action[] actions, Ingredient[] ingredients) throws Exception{
        setActions(actions);
        setIngredients(ingredients);
    }

    public Cocktail(){}

    public abstract void setActions(Action[] actions) throws Exception;

    public abstract void setIngredients(Ingredient[] ingredients) throws Exception;

    public Action[] getActions() {
        return actions;
    }
    
    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public float getAbv() {
        float totalVolume = ingredients[0].getVolume();
        float totalAlcohol = ingredients[0].getAbv() * ingredients[0].getVolume();
        for (int i = 1; i < ingredients.length; i++) {
            totalVolume += ingredients[i].getVolume();
            totalAlcohol = totalAlcohol + ingredients[i].getAbv() * ingredients[i].getVolume();
        }

        return totalAlcohol / totalVolume;
    }
    


    // -------------------------------------- To Strings ------------------------------------
    protected String getStringIngredients() {
        String ings = "";
        for (int i = 0; i < ingredients.length; i++) {
            if (i == ingredients.length - 1)
                ings += ingredients[i].toString();    
            else
                ings += ingredients[i].toString() + ", ";
        }
        return ings;
    }

    protected String getStringActions() {
        String acts = "";
        for (int i = 0; i < actions.length; i++) {
            if (i == actions.length - 1)
                acts += actions[i].toString();
            else
                acts += actions[i].toString() + ", ";
        }
        return acts;
    }

    @Override
    public String toString() {
        return 
            Cocktail.this.getClass().getSimpleName()+ ": " +
            "{" +
            " ingredients: [" + getStringIngredients() + "]" +
            ", actions: [" + getStringActions() + "] " +
            "}\n";
    }
 
}