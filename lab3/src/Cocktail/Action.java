package Cocktail;


public enum Action {
    POUR("POUR"), 
    STIR("STIR"), 
    SHAKE("SHAKE"),
    ADD("ADD");

    private final String string;

    Action(String name){string = name;}

    @Override
    public String toString() {
        return string;
    }
}
