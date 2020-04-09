package Homework.SeaBattle;

public class Battleship extends Ships {
    protected int[] decks = new int[4];
    protected boolean afloat = true;

    public boolean isAfloat() {
        return afloat;
    }

    public void setAfloat(boolean afloat) {
        this.afloat = afloat;
    }

    @Override
    public int[] getDecks() {
        return decks;
    }

    @Override
    public void setDecks(int[] decks) {
        this.decks = decks;
    }

    public void addDeck(int[][] newDeck){


        }
}
