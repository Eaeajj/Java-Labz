package Cocktail;

import java.util.Objects;
import java.io.Serializable;


public abstract class Ingredient implements Serializable {
    private float volume; // in milliliters
    protected float abv; // alcohol by volume

    public Ingredient(float volume, float abv) throws Exception {
        setVolume(volume);
        setAbv(abv);
    }

    public void setAbv(float abv) throws Exception{
        if (abv > 100 || abv < 0) {
            throw new Exception("\nABV should be between [0, 100].\nIt's percents!");
        }
        this.abv = abv;
    }

    public float getAbv() {
        return abv;
    }
    
    public void setVolume(float volume) throws Exception{
        if (volume < 0 || volume > 1000) {
            throw new Exception("\nVolume exception, it can be too much or too low\n");
        }
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Ingredient)) {
            return false;
        }
        Ingredient ingredient = (Ingredient) o;
        return volume == ingredient.volume && abv == ingredient.abv;
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, abv);
    }

    @Override
    public String toString() {
        return Ingredient.this.getClass().getSimpleName() + ": " +
            "{" + 
            " volume: '" + getVolume() + "'" +
            ", abv: '" + getAbv() + "'" +
            "}";
    }
    
}