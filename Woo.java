import cs1.Keyboard;

public class Woo {

    //1 if the order has not been reversed, -1 otherwise
    public static int direction = 1;

    //keeps track of which Player gets to go next
    public static int order = 0;

    //keeps track of which Card is on top of the play pile
    public static Card topCard = Deck.getNumber();

    //an array of all the Players (in order)
    public static Player[] users;
	
    //switch the direction of the game (used when Reverse Card is played)
    public static void changeDirection {
	direction *= -1;
    }
	
    public static int getDirection(){
	return direction;
    }
	
    //accessor for topCard
    public static Number getTopCard(){
	return topCard;
    }
	
    //setups the game
    public static void setup() {
	System.out.println("Welcome to UNO");
	
	System.out.print("How many players will be playing? ");
	
	int numPlayers = Keyboard.readInt();
	//declare user array with length of (# of users)
	users = new Player[numPlayers];

	//populate users with all of the Players, and their names
	for (int i = 0; i < numPlayers; i++) {
	    System.out.println("Player" + i + ", what is your name? ");
	    users[i] = new Player(readString());
	}

	//give every Player 7 random Cards from the Deck
	for (int i = 0; i < numPlayers; i++) {
	    for (int q = 0; i < 7; q++) {
		users[i].draw();
	    }
	}		  

    }//end setup

    //returns true when any Player has fewer than 1 Cards in their cardInventory
    //this means the  game is over
    public static boolean gameOver() {
	boolean over = true;
	for (Player i : users) {
	    if (i.inventory.size() < 1) {
		over = true;
	    }
	}
	return over;
    }//end gameOver()
	
    public static void game() {
	Player playing;

	while (!(gameOver())) {
	    order += getDirection();
	    playing = users[order];
	    System.out.println("It is " + playing.name + "'s turn!");

	    //print out cards
	    System.out.println("Here are your cards: ");
	    for (int i = 0; i < playing.inventory.size(); i++) {
		System.out.println("------------------------");
		System.out.println("Card #" + i + ": " playing.inventory.get(i));
		System.out.println("------------------------");
	    }

			     
	    System.out.println("0... View your Cards");
	    System.out.println("1... Play a Card");
	    //other options...

	    int option = readInt();
	    if (option == 0) {
		//do something
	    }
	    else if(option == 1) {
		//do something else
	    }

	    else {
		//do something
	    }
	}
    }//end game()
	
    public static void main(String[] args) {
	setup();
	game();
    }//end main()
	
	
	
	    
	    
}//end class Woo
