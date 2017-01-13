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

    public void draw(){
	//inventory.add(topCard);
	
    }
    //void choose(int index): using canPlay in canPlay boolean method from Number (Card subclass), determines whether to choose and place the chosen Card, choice, on the pile in Woo.java (by replacing topCard with choice), or not
    /*** public void choose(int index){
	Number choice = inventory.get(index);
	if (choose.canPlay(choice)){
	    inventory.remove(index);
	    topCard = choose.play(choice);
	}
	else{
	    System.out.println("Sorry, invalid card :(");
	}
    }

    //public String toString(){
	
    // }***/
}

