import cs1.Keyboard;

public class Woo {

    //1 if the order has not been reversed, -1 otherwise
    private static int direction = 1;

    //keeps track of which Player gets to go next
    public static int order = 0;

    //keeps track of which Card is on top of the play pile
    public static Card topCard = Deck.getNumber();

    //an array of all the Players (in order)
    public static Player[] users;
	
    //switch the direction of the game (used when Reverse Card is played)
    public static void changeDirection() {
	direction *= -1;
    }
	
    public static int getDirection(){
	return direction;
    }
	
    //accessor for topCard
    public static Card getTopCard(){
	return topCard;
    }

    //modulo method
    public static int mod(int a, int b) {
	return ((a % b) + b) % b;
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
	    System.out.println("Player " + (i+1) + ", what is your name? ");
	    users[i] = new Player(Keyboard.readString());
	    //System.out.println("test");
	}
	//System.out.println("testt2");

	//give every Player 7 random Cards from the Deck
	for (int i = 0; i < numPlayers; i++) {
	    for (int q = 0; q < 7; q++) {
		users[i].draw();
		//System.out.println("draw done");
	    }
	}
	//for (Player i : users) {
	//System.out.println(i);}
		

    }//end setup

    //clears terminal after one Player's turn (creds to Xin Yi Chen!)
    public static void clear(){
	String clr = "printf\"033c\"";
	System.out.println(clr);
    }

    //returns true when any Player has fewer than 1 Cards in their cardInventory
    //this means the  game is over
    public static boolean gameOver() {
	boolean winner = false;
	for (int x = 0; x < users.length; x++){
	    if ((users[x].inventory.size()==0)&&(users[x].uno)){
		winner = false;
	    }
	}
	return winner;
    }//end gameOver()
	
    public static void game() {
	Player playing;

	while (!(gameOver())) {
	    //current player is the (order modulo users.length) index of users
	    playing = users[mod(order, users.length)];
	    System.out.println("\nIt is " + playing.name + "'s turn!");

	    //print out cards
	    System.out.println("Here are your cards: ");
	    System.out.println("------------------------\n");
	    for (int i = 0; i < playing.inventory.size(); i++) {
		System.out.println("Card #" +  (i+1) + ": " + playing.inventory.get(i));
	    }
	    System.out.println("\n------------------------");

	    //print out topCard
	    System.out.println("Here is the card on top of the pile: ");
	    System.out.println("------------------------");
	    System.out.println(topCard);
	    //System.out.println("topCard");
	    //System.out.println(topCard.getNumber());
	    System.out.println("------------------------");
	  
	    //true if the user has anycards that can be played, false if none of their cards can be
	    boolean canPlayACard = false;

	    //assigns correct value to canPlayACard
	    for (Card i : playing.inventory) {
		if (i.canPlay()) {
		    canPlayACard = true;
		    break;
		}
	    }
	    //give options to the user that will be seen every turn
	    System.out.println("You can... ");

	    System.out.println("1... Draw a Card");
	    //if user has at least one card that can be played, give them that option
	    if (canPlayACard) {
		    System.out.println("2... Play a Card");
	    }
	    System.out.print("What would you like to do? ");

	    //take an action based on the user's input
	    String option = Keyboard.readString();

	    if (isInt(option)){
		    //user selected to play a Card
		    if (Integer.parseInt(option) == 2) {
			System.out.print("Which card would you like to play? ");
			
			//keep making player choose a card until they choose one that works
			while (true) {
			    if (playing.choose(Keyboard.readInt()-1)) {
				    break;
			    }
			}
		    }//end option for when user wants to play a card
	    
		    //user selected to draw a card
		    else if (Integer.parseInt(option) == 1){
			Card drawnCard = playing.draw();
			System.out.println("You drew a " + drawnCard);
			//if drawnCard can be played,, give user that option
			if (drawnCard.canPlay()) {
			    System.out.print("Would you like to play it? (y/n) ");
			    if (Keyboard.readString().equals("y")) {
				playing.choose(playing.inventory.size() - 1);
			    }}}
		}
	    else if ((option.equals("Uno")) || (option.equals("uno"))){
		if ((playing.inventory.size() == 2)&& canPlayACard){
		    System.out.println("Please choose a card to Play:  \n");
		    System.out.println("Here are your cards: ");
		    System.out.println("------------------------\n");
		    for (int i = 0; i < playing.inventory.size(); i++) {
			System.out.println("Card #" +  (i+1) + ": " + playing.inventory.get(i));
		    }
		    System.out.println("\n------------------------");

		    //print out topCard
		    System.out.println("Here is the card on top of the pile: ");
		    System.out.println("------------------------");
		    System.out.println(topCard);
		    //System.out.println("topCard");
		    //System.out.println(topCard.getNumber());
		    System.out.println("------------------------");
		    System.out.println("Which card would you like to play?");
		    while (true) {
			if (playing.choose(Keyboard.readInt()-1)) {
			    break;
			}
		    }
		    System.out.println("Succesfully declared Uno!");
		    playing.uno = true;
		}
		else{
		    System.out.println("Unsuccessful declaration of Uno. You must draw 2 cards.");
		    playing.draw();
		    playing.draw();
		}
	    }
	    order += getDirection();
	    //wait for one second - code block taken from Stack Overflow
	    try {
		Thread.sleep(1000);
	    } catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }
	    clear();
	}//end while loop

	declareWinner();
	
    }//end game()

    public static boolean isInt(String str){
	boolean isInteger = false;
	try {
	    Integer.parseInt(str);
	    isInteger = true;
	}
	catch (NumberFormatException ex){
	}
	return isInteger;
    }

    public static void declareWinner(){
	Player winner = new Player("temp");
	for (int x = 0; x<users.length; x++){
	    if ((users[x].uno) && (users[x].inventory.size() == 0)){
		winner = users[x];
	    }
	}
	System.out.println("Congratulations! " + winner.name + " is the winner!");
    }
    
    public static void main(String[] args) {
	setup();
	game();
    }//end main()
       	    
}//end class Woo
