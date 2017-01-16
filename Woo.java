public class Woo {

    //1 if the order has not been reversed, -1 otherwise
    private int direction;

    //keeps track of which Player gets to go next
    private int order;

    //keeps track of which Card is on top of the play pile
    private Number topCard;

    //an array of all the Players (in order)
    private Player[] users;

    public Woo() {
	direction = 1;
	order = 0;
	setup();
	game();
	//topCard = RANDOM CARD FROM THE DECK, REMOVE THAT CARD FROM THE DECK
	}
	
	//mutator and accessor for direction (later on for reverse)
	public void setDirection(int dir){
		direction = dir;
	}
	
	public int getDirection(){
		return direction;
	}
	
	//accessor for topCard
	public Number getTopCard(){
		return topCard;
	}
	
    //setups the game
    public void setup() {
	System.out.println("Welcome to UNO");
	
	System.out.print("How many players will be playing? ");
	
	int numPlayers = Keyboard.readInt();
	//declare user array with length of (# of users)
	users = new Player[numPlayers];

	//populate users with all of the Players, and their names
	for (int i = 0; i < numPlayers; i++) {
	    System.out.println("Player" + i + ", what is your name? ");
	    users[i] = new Player(Keyboard.readString());
	}

	//give every Player 7 random Cards from the Deck
	for (int i = 0; i < numPlayers; i++) {
	    for (int q = 0; i < 7; q++) {
		users[i].draw();
	    }
	}
	
	//possible tester data			  
	/***
	    users[0].inventory.add(new Number("Green", 7));
	    users[0].inventory.add(new Number("Blue", 9));
	    users[0].inventory.add(new Number("Green", 6));
	    users[0].inventory.add(new Number("Red", 6));
	***/

    }//end setup

    //returns true when any Player has fewer than 1 Cards in their cardInventory
    //this means the  game is over
     public boolean gameOver() {
		 boolean over = true;
	 for (Player i : users) {
	     if (i.inventory.size() < 1) {
		 over = true;
	     }
		}
		return over;
    }//end gameOver()
	
    public void game() {
	Player playing;
	
	
	/*** FROM MVP - not sure if we will actually need it
	    System.out.println("Here are your cards:");
	    for (int i = 0; i < users[0].inventory.size(); i++) {
	    System.out.println("-------------");
	    System.out.println("Card #" + i);
	    System.out.println(users[0].inventory.get(i));
	    System.out.println("-------------");
	    }
	    System.out.println("Here is the top card");
	    System.out.println(topCard);
	    System.out.print("What Card do you want to play? Enter Card Number ");
	    int a = Keyboard.readInt();
	    users[0].inventory.get(a).play();
	    }//end game
	***/

	while (!(gameOver())) {
		order += getDirection();
		playing = users[order];
		System.out.println("It is " + playing.name + "'s turn. What do you want to do? ");
		System.out.println("0... View your Cards");
		System.out.println("1... Play a Card");
		//other options...

		int option = Keyboard.readInt();
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
	Woo gameOfUNO = new Woo();
	//Woo.setup();
	//Woo.game();
    }//end main()
	
	
	
	    
	    
}//end class Woo