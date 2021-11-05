package Cocktail.Cocktails;

import Cocktail.Cocktail;
import Cocktail.Action;
import Cocktail.Ingredient;
import Cocktail.Ingredients.Ice;
import Cocktail.Ingredients.Liquor;
import Cocktail.Ingredients.MilkCream;
import Cocktail.Ingredients.Vodka;


public class WhiteRussian extends Cocktail {
    protected static final Ingredient[] correctIngredients = initCorrectIngredients();
    protected static final Action[] correctActions = initCorrectActions(); 

    public WhiteRussian(Action[] actions, Ingredient[] ingredients) throws Exception {
        super(actions, ingredients);
    }

    public WhiteRussian() throws Exception {
        super();
        setActions(getCorrectActions());
        setIngredients(getCorrectIngredient());
    }


    private static Action[] initCorrectActions() {
        Action addIce = Action.ADD;
        Action pourMilkCream = Action.POUR;
        Action pourLiquor = Action.POUR;
        Action pourVodka = Action.POUR;
        Action stir = Action.STIR;
        Action[] correctActions = {addIce, pourMilkCream, pourLiquor, pourVodka, stir};

        return correctActions;
    }

    protected static Ingredient[] initCorrectIngredients() {
        Ingredient[] ingredients = new Ingredient[4];
        try {
            Vodka vodka = new Vodka(30, 40);
            Liquor liquor = new Liquor(30, 20);
            MilkCream milkCream = new MilkCream(30, 0);
            Ice ice = new Ice(60, 0);
            
            ingredients[0] = ice;
            ingredients[1] = milkCream;
            ingredients[2] = liquor;
            ingredients[3] = vodka;
            return ingredients;
        } catch (Exception e) {
            System.err.println("Do not touch constants...\n\n" + e.getMessage());
        }
        return ingredients;
    }

    public static Action[] getCorrectActions() {
        return correctActions;
    }

    public static Ingredient[] getCorrectIngredient() {
        return correctIngredients;
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

    @Override
    public void setIngredients(Ingredient[] ingredients) throws Exception {
        int len = ingredients.length;
        float[] volumes = new float[len];
        if (len != correctIngredients.length) 
            throw new Exception("Wrong amount of ingredients");
        for (int i = 0; i < len; i++) {
            if (ingredients[i].getClass() != correctIngredients[i].getClass()){
                throw new Exception("Wrong ingredients");
            }
            volumes[i] = ingredients[i].getVolume();
        }
        
        if (volumes[0] / volumes[1] != 2) throw new Exception("Wrong ratio of volums");
        if (volumes[1] / volumes[2] != 1) throw new Exception("Wrong ratio of volums");
        if (volumes[2] / volumes[3] != 1) throw new Exception("Wrong ratio of volums");

        this.ingredients = ingredients;
    }



}