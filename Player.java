import java.util.ArrayList;

public class Player{
    public String name;
    public ArrayList<Number> inventory;
    
    //default constructor; pre-sets name for Player vs. computer rounds
    public Player(){
	name = "Computer";
	ArrayList<Number> inventory = new ArrayList<Number>();
    }
    //overloaded constructor; takes Player input to set name
    public Player(String mingzi){
	name = mingzi;
	inventory = new ArrayList<Number>();
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
	Number choice = inventory.get(index);
	if (choose.canPlay(choice)){
	    inventory.remove(index);
	    topCard = choose.play(choice);
	    return true;
	}
	else{
	    System.out.print("Sorry, invalid card :( Please pick again ");
	    return false;
	}
    }

    //public String toString(){
	
    // }***/
}

