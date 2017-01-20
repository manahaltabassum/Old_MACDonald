import java.util.ArrayList;

public class Player{
    public String name;
    public ArrayList<Card> inventory;
    
    //default constructor; pre-sets name for Player vs. computer rounds
    public Player(){
	name = "Computer";
	ArrayList<Card> inventory = new ArrayList<Card>();
    }
    //overloaded constructor; takes Player input to set name
    public Player(String mingzi){
	name = mingzi;
	inventory = new ArrayList<Card>();
    }

    //add a random Card to the caller's inventory, returns it
    public Card draw() {
        Card a = Deck.getCard();
		inventory.add(a);
		return a;
	}//end draw()
    
    //void choose(int index)
    //uses canPlay in method from Number (Card subclass),
    //determines whether to choose and place the chosen Card (given by the index),on the pile in Woo.java (by replacing topCard with choice), or not
    //returns true if the Card was played, false otherwise
    public boolean choose(int index){
	Card choice = inventory.get(index);
	if(choice.play()){
	    Woo.topCard = choice;
	    System.out.println("Success! The new top card is: " + Woo.topCard);
	    return true;
	}
	else{
	    System.out.print("Failure :( Choose again: ");
	    return false;
	}
    }

    public String toString(){
	String retStr = "";
	for(Card x : inventory){
	    retStr += x.toString() + "\n";
	}
	return retStr;
     }
}

