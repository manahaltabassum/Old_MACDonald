public class DrawFour extends Card{

    //instance vars
    private String color;

    public void setColor (String newColor){
	color = newColor;
    }

    public void play(){
	System.out.println("Next player draws 4 cards.");
	Woo.users[order+1].draw();
	Woo.users[order+1].draw();
	Woo.users[order+1].draw();
	Woo.users[order+1].draw();

	System.out.println("What color would you like to play?");
	String newCol = Keyboard.readString();
	this.setColor(newCol);

	Woo.topCard = this;
	System.out.println("Successfully changed color to " + newCol + " .");
    }//end play()

    public String toString(){
	String retStr = "";
	retStr += "DrawFour";
	return retStr;
    }//end toString()
}
