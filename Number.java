public class Number extends Card{
    
    //instance vars
    private String color;
    private int number;
    
    //overloaded constructor
    public Number(String col, int num){
	color = col;
	number = num;
    }

    //accesor method for color
    //public String getcolor{
    //	return color;
    //}
    
    //accesor method for number
    // public num getNumber{
    //	return number;
    // }

    public boolean canPlay() {
	return ((color.equals(Woo.topCard.color)) || (number == Woo.topCard.number));
    }//end canPlay()

    public String toString() {
	String rtn = "\n";
	rtn += "Color: " + color + "\n";
        rtn += "Number: " + number;
	return rtn;
    }//end toString()

    public void play() {
	if (this.canPlay()) {
	    Woo.topCard = this;
	    System.out.println("\nSuccess! The new top card is:" + Woo.topCard);
	}
	else {
	    System.out.println("Failure! You can redeem yourself later!");
	}
	
    }//end play()
	
	
}//end class Number
