public abstract class Card {

    //instance vars
    protected String name;
    protected String color;

    //abstract method in order to Play a card
    public abstract void play();
    
    //abstract method in order to tell whether you can play a card
    public abstract boolean canPlay();

}
