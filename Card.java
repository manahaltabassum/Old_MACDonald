public abstract class Card {

    //instance vars
    protected String name;
    protected String color;
    protected int number;

    //abstract method in order to Play a card
    public abstract boolean play();
    
    //abstract method in order to tell whether you can play a card
    public abstract boolean canPlay();
	
	public int getNumber(){
		return number;
	}

}
