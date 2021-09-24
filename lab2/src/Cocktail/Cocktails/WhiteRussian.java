package Cocktail.Cocktails;

import Cocktail.Cocktail;
import Cocktail.Action;
import Cocktail.Ingredient;
import Cocktail.Ingredients.Ice;
import Cocktail.Ingredients.Liquor;
import Cocktail.Ingredients.MilkCream;
import Cocktail.Ingredients.Vodka;



public class WhiteRussian extends Cocktail {
    
    private static Ingredient[] correctIngredients = setCorrectIngredients();
    private static Action[] correctActions = setCorrecActions();

    public WhiteRussian(Action[] actions, Ingredient[] ingredients) throws Exception {
        super();
        setActions(actions);
        setIngredients(ingredients);
    }

    private static Ingredient[] setCorrectIngredients() {
        Ice ice;
        Liquor liquor;
        Vodka vodka;
        MilkCream milkCream;
        Ingredient[] correcIngredients = new Ingredient[4];
        try {
            ice = new Ice(60, 0);
            liquor = new Liquor(30, 20);
            vodka = new Vodka(30, 40);
            milkCream = new MilkCream(30, 0);
            Ingredient[] tmp = {ice, milkCream, liquor, vodka};
            correcIngredients = tmp;
        } catch (Exception e) {
            System.out.println(e.getMessage() + "There is constants, don't touch it");
        }
        
        return correcIngredients;
    }

    private static Action[] setCorrecActions() {
        Action addIce = Action.ADD;
        Action pourMilkCream = Action.POUR;
        Action pourLiquor = Action.POUR;
        Action pourVodka = Action.POUR;
        Action stir = Action.STIR;

        Action[] correctActions = {addIce, pourMilkCream, pourLiquor, pourVodka, stir};

        return correctActions;
    }


    @Override
    public void setActions(Action[] actions) throws Exception {
        int len = actions.length;
        if (len != correctActions.length) 
            throw new Exception("Wrong amount of actions");
        for (int i = 0; i < len; i++) {
            if (actions[i].getClass() != correctActions[i].getClass()){
                throw new Exception("Wrong ingredients");
            }
        }
        
        this.actions = actions;
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
        if (volums[0] / volums[1] != 2) throw new Exception("Wrong ratio");
        if (volums[1] / volums[2] != 1) throw new Exception("Wrong ratio");
        if (volums[2] / volums[3] != 1) throw new Exception("Wrong ratio");

        this.ingredients = ingredients;
    }
}