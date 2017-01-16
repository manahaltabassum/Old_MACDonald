public class Wild extends Card{

    //instance vars
    private String color;

    public void setColor (String newColor){
	color = newColor;
    }

    /*plays card changing topCard to this card always and requires
    terminal input for what to chnage the new color to*/
    public void play(){
	System.out.println("What color would you like to play?");
	String newCol = Keyboard.readString();
	this.setColor(newCol);

	Woo.topCard = this;
	System.out.println("Successfully changed color to " + newCol +" .");
    }//end play()

    public String toString(){
	String retStr = "";
	retStr += "Wild Card";
	return retStr;
    }//end toString()
}
