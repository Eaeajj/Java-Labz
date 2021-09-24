package Cocktail;

public abstract class Ingredient {
    private float volume;
    protected float abv; // alcohol by volume

    public Ingredient(float volume, float abv) throws Exception {
        setVolume(volume);
        setAbv(abv);
    }

    public void setAbv(float abv) throws Exception{
        if (abv > 100 || abv < 0) {
            throw new Exception("daaamm");
        }
        this.abv = abv;
    }

    public float getAbv() {
        return abv;
    }

    public void setVolume(float volume) throws Exception{
        if (volume < 0 || volume > 10000) {
            throw new Exception("daaamm");
        }
        this.volume = volume;
    }

    public float getVolume() {
        return volume;
    }

    
}