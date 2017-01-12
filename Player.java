public class Player{
    private String name;
    private ArrayList cardInventory;

    //default constructor; pre-sets name for Player vs. computer rounds
    public Player(){
	name = "Computer";
	ArrayList cardInventory = new ArrayList();
    }
    //overloaded constructor; takes Player input to set name
    public Player(mingzi){
	name = mingzi;
	ArrayList cardInventory = new ArrayList();
    }

    public void draw(){
	
    }

    public void choose(int index){
	
    }

    public String toString(){
	
    }
}
