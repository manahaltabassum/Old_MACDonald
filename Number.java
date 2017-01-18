public class Number extends Card{
    
    //instance vars
    private int number;
    
    //overloaded constructor
    public Number (String col, int num){
	color = col;
	number = num;
    }

    //accesor method for color
    //public String getcolor{
    //	return color;
    //}
    
    //accesor method for number
    public int getNumber(){
	return number;
    }

    //returns true if the calling Number can be played on top of topCard, false otherwise
    public boolean canPlay() {
	//if topCard is a Number check that it has either the same color or number as calling Number
	if (Woo.topCard instanceof Number) {
	    return (((color.equals(Woo.topCard.color)) || (number == Woo.topCard.number)));
	}
	//if top
	else {
	    return (color.equals(Woo.topCard.color));
	}
    }//end canPlay()

    public String toString() {
	String rtn = "\n";
	rtn += "Color: " + color + "\n";
        rtn += "Number: " + number;
	return rtn;
    }//end toString()

    public void play() {
	return this.canPlay();
    }//end play()
	
	
}//end class Number
