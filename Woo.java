public class Woo {

    //true if the order has not been reversed, false otherwise
    static boolean isForward;

    //keeps track of which Player gets to go next
    static int order;

    //keeps track of which Card is on top of the play pile
    static Number topCard;

    //an array of all the Players (in order)
    static Player[] users;

    //returns true when any Player has fewer than 1 Cards in their cardInventory,  meaning the game is over
    public static boolean gameOver() {
	for (Player i : users) {
	    if (i.cardInventory.size() < 1) {
		return true;
	    }}
    }//end gameOver()

    //setups the game
    public static void setup() {
	System.out.println("THIS IS UNO");
	users = new Player[1];
	users[0] = new Player("tester0");
	users[0].cardInventory.add(new Number("Green", 7));
	users[0].cardInventory.add(new Number("Blue", 9));
	users[0].cardInventory.add(new Number("Green", 6));
	users[0].cardInventory.add(new Number("Red", 6));
	topCard = new Number("Red", 7);
    }//end setup

    public static void game() {
	System.out.println("Here are your cards:")
	for (int i = 0; i < users[0].cardInventory.size(); i++) {
	    System.out.println("-------------");
	    System.out.println("Card #" + i);
	    System.out.println(users[0].cardInventory.get(i));
	    System.out.println("-------------");
	}
	System.out.println("Here is the top card");
	System.out.println(topCard);
	System.out.print("What Card do you want to play? Enter Card Number ");
	int a = readInt();
	cardInventory[a].play();
    }//end game

    public static void main(String[] args) {
	setup();
	game();
    }//end main()
	
	
	
	    
	    
}//end class Woo
   
