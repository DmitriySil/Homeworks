package Homework.SeaBattle;

public class Destroyer extends Ships{
    protected int[] decks = new int[1];
    protected boolean afloat = true;

    @Override
    public int[] getDecks() {
        return decks;
    }

    @Override
    public void setDecks(int[] decks) {
        this.decks = decks;
    }

    public boolean isAfloat() {
        return afloat;
    }

    public void setAfloat(boolean afloat) {
        this.afloat = afloat;
    }


}
