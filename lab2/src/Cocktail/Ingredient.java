package Cocktail;

/**
 * * Represents a Ingredient abstract class
 * @author <a href="https://github.com/Eaeajj/Java-Labz">Zalesskiy Oleg</a>
 * @version 1.0
 */
public abstract class Ingredient {
    private float volume; // in milliliters
    protected float abv; // alcohol by volume

    public Ingredient(float volume, float abv) throws Exception {
        setVolume(volume);
        setAbv(abv);
    }

    /**
     * @param abv
     * @throws Exception
     */
    public void setAbv(float abv) throws Exception{
        if (abv > 100 || abv < 0) {
            throw new Exception("\nABV should be between [0, 100].\nIt's percents!");
        }
        this.abv = abv;
    }

    /**
     * @return Returns abv i.e Alcohol by volume of cocktail
     */
    public float getAbv() {
        return abv;
    }
    
    /**
     * setter
     * @param volume
     * @throws Exception
     */
    public void setVolume(float volume) throws Exception{
        if (volume < 0 || volume > 10000) {
            throw new Exception("\nVolume should be more than 0 and not too much milliliters!!!");
        }
        this.volume = volume;
    }

    /**
     * getter
     * @return Returns volume of cocktail
     */
    public float getVolume() {
        return volume;
    }

    
}