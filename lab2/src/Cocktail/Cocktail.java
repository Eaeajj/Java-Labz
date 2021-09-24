package Cocktail;

/**
 * Represents a Cocktail abstract class
 * @author <a href="https://github.com/Eaeajj/Java-Labz">Zalesskiy Oleg</a>
 * @version 1.0
 */

 public abstract class Cocktail {
    
    protected Ingredient[] ingredients;
    protected Action[] actions;
    
    /**
     * 
     * @param actions an array of actions {@link Action} required for creating cocktail
     * @param ingredients 
     * @throws Exception
     */
    public Cocktail(Action[] actions, Ingredient[] ingredients) throws Exception{
        setActions(actions);
        setIngredients(ingredients);
    }
    /**
     * 
     * @param actionArray
     * @throws Exception
     */
    public void setActions(Action[] actionArray) throws Exception{
        this.actions = actionArray;
        System.out.println("\n\n\nParent setter!!");
    }

    /**
     * @return
     */
    public Action[] getActions() {
        return actions;
    }

    /**
     * @param ingredients
     * @throws Exception
     */
    public void setIngredients(Ingredient[] ingredients) throws Exception {
        this.ingredients = ingredients;
    }
    /**
     * @return
     */
    public Ingredient[] getIngredients() {
        return ingredients;
    }

    /**@return Returns alcohol by volume of the whole cocktail. It counts 
     * alcohol volume of the whole cocktail and volume of the whole cocktail.
     * Divides the first by the second to find alcohol by volume of the whole cocktail.
    */
    public float getAbv() {
        float totalVolume = ingredients[0].getVolume();
        float totalAlcohol = ingredients[0].getAbv() * ingredients[0].getVolume();
        for (int i = 1; i < ingredients.length; i++) {
            totalVolume += ingredients[i].getVolume();
            totalAlcohol = totalAlcohol + ingredients[i].getAbv() * ingredients[i].getVolume();
        }

        return totalAlcohol / totalVolume;
    }
}