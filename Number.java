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
    public String getcolor{
	return color;
    }
    
    //accesor method for number
    public num getNumber{
	return number;
    }

    public boolean canPlay() {
	return ((color.equals(topCard.color)) && (number == topCard.number));
    }//end canPlay()

    public String toString() {
	System.out.println("Color: " + color);
	System.out.println("Number: " + number);
    }//end toString()

    public void play() {
	if (this.canPlay()) {
	    topCard = this;
    }//end play()
	
	
}
