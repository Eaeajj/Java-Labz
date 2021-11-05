package Cocktail.Cocktails;

import Cocktail.Cocktail;
import Cocktail.Action;
import Cocktail.Ingredient;
import Cocktail.Ingredients.Ice;
import Cocktail.Ingredients.Vodka;



public class IcedVodka extends Cocktail {

    protected static final Ingredient[] correctIngredients = initCorrectIngredients();
    protected static final Action[] correctActions = initCorrectActions(); 

    public IcedVodka(Action[] actions, Ingredient[] ingredients) throws Exception {
        super(actions, ingredients);
    }

    public IcedVodka() throws Exception{
        super();
        setActions(getCorrectActions());
        setIngredients(getCorrectIngredient());

    }

    public static Action[] getCorrectActions() {
        return correctActions;
    }

    public static Ingredient[] getCorrectIngredient() {
        return correctIngredients;
    }

    protected static Ingredient[] initCorrectIngredients() {
        Ice ice;
        Vodka vodka;
        Ingredient[] correcIngredients = new Ingredient[4];
        try {
            ice = new Ice(60, 0);
            vodka = new Vodka(60, 40);
            Ingredient[] tmp = {ice, vodka};
            correcIngredients = tmp;
        } catch (Exception e) {
            System.out.println(e.getMessage() + "There are constants, don't touch it!!!");
        }
        return correcIngredients;
    }

    protected static Action[] initCorrectActions() {
        Action addIce = Action.ADD;
        Action pourVodka = Action.POUR;
        Action[] correctActions = {addIce, pourVodka};
        return correctActions;
    }


    @Override
    public void setIngredients(Ingredient[] ingredients) throws Exception {
        int len = ingredients.length;
        float[] volums = new float[len];
        if (len != correctIngredients.length) 
            throw new Exception("Wrong amount of ingredients");
        for (int i = 0; i < len; i++) {
            if (ingredients[i].getClass() != correctIngredients[i].getClass()){
                throw new Exception("Wrong ingredients");
            }
            volums[i] = ingredients[i].getVolume();
        }
        if (volums[0] / volums[1] != 1) throw new Exception("Wrong ratio of volums");

        this.ingredients = ingredients;
    }



    @Override
    public void setActions(Action[] actions) throws Exception{
        int len = actions.length;
        if (len != correctActions.length) 
            throw new Exception("Wrong amount of actions");
        for (int i = 0; i < len; i++) {
            if (!actions[i].equals(correctActions[i])){
                throw new Exception("Wrong sequence of actions");
            }
        }
        this.actions = actions;
    }

}