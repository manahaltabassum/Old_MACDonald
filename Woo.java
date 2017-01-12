public class Woo {

    //true if the order has not been reversed, false otherwise
    static boolean isForward;

    //keeps track of which Player gets to go next
    static int order;

    //keeps track of which Card is on top of the play pile
    static Card topCard;

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
	users = new Player[2];
	users[0] = new Player("tester0");
	users[1] = new Player("tester1");
    }//end setup()
   
