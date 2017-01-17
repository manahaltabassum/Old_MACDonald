import java.util.ArrayList;

public class Deck {

    // The sole purpose of Deck is to create a deck of standard UNO Cards
    // Provide methods to access a random Card or Number from this deck
    private static final ArrayList<Card> DECKOFCARDS = new ArrayList<Card>();

    private static final String[] COLORS = {"Red", "Green", "Yellow", "Blue"};


    //instantiate Cards and put them in deckOfCards
    static {
	for (String cardColor : COLORS) {

	    //add Number Cards
	    DECKOFCARDS.add(new Number(cardColor, 0));
	    for (int i = 1; i < 10; i++) {
		DECKOFCARDS.add(new Number(cardColor, i));
		DECKOFCARDS.add(new Number(cardColor, i));
	    }

	    //add DrawTwo
	    DECKOFCARDS.add(new DrawTwo(cardColor));
	    DECKOFCARDS.add(new DrawTwo(cardColor));

	    //add Skip
	    //DECKOFCARDS.add(new Skip(cardColor));
	    // DECKOFCARDS.add(new Skip(cardColor));

	    //add Reverse
	    //DECKOFCARDS.add(new Reverse(cardColor));
	    //DECKOFCARDS.add(new Reverse(cardColor));
	}


	for (int i = 0; i < 4; i++) {
	    //add Wild
	    DECKOFCARDS.add(new Wild());
	    
	    //add DrawFour
	    DECKOFCARDS.add(new DrawFour());
	}

    }//end static

    //returns random Card from Deck
    public static Card getCard() {
	return DECKOFCARDS.get( (int) (Math.random() * 109));
    }//end getCard()

    //return random Number from Deck
    public static Number getNumber() {
	return DECKOFCARDS.get( (int) (Math.random() * 77));
    }//end getNumber()
	    

}//end class Deck
	    
	

    
