public class DrawFour extends Card{

    public DrawFour(){
	color = "";
    }
    
    public void setColor (String newColor){
	color = newColor;
    }

    public boolean canPlay(){
	return true;
    }

    public boolean play(){
	if (this.canPlay()){
	    System.out.println("Next player draws 4 cards.");
	    Woo.users[(Woo.order+1)%(Woo.users.length)].draw();
	    Woo.users[(Woo.order+1)%(Woo.users.length)].draw();
	    Woo.users[(Woo.order+1)%(Woo.users.length)].draw();
	    Woo.users[(Woo.order+1)%(Woo.users.length)].draw();

	    System.out.println("What color would you like to play?");
	    String newCol = Keyboard.readString();
	    this.setColor(newCol);

	    /*Woo.topCard = this;
	      System.out.println("Successfully changed color to " + newCol + " .");*/
	    return true;
	}
	return false;
    }//end play()

    public String toString(){
	String retStr = "";
	retStr += color + " ";
	retStr += "DrawFour";
	return retStr;
    }//end toString()
}
