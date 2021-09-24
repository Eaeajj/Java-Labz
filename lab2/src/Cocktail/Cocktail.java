package Cocktail;

public abstract class Cocktail {
    protected Ingredient[] ingredients;
    protected Action[] actions;

    protected Cocktail() {
        Ingredient[] ings = new Ingredient[0];
        Action[] actions = new Action[0];
        this.actions = actions;
        this.ingredients = ings;
    }

    public Cocktail(Action[] actions, Ingredient[] ingredients) throws Exception{
        setActions(actions);
        setIngredients(ingredients);
    }

    public void setActions(Action[] actionArray) throws Exception{
        this.actions = actionArray;
    }

    public Action[] getActions() {
        return actions;
    }

    public void setIngredients(Ingredient[] ingredients) throws Exception {
        this.ingredients = ingredients;
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
}