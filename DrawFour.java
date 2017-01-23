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
	    String str = "";
	    str += "1... Red \n";
	    str += "2... Yellow \n";
	    str += "3... Green \n";
	    str += "4... Blue \n";
	    System.out.println(str);
	    
	    int newColnum = Keyboard.readInt();
	    String newCol = "";
	    if (newColnum == 1){
		newCol = "Red";
	    }
	    else if (newColnum == 2){
		newCol = "Yellow";
	    }
	    else if (newColnum == 3){
		newCol = "Green";
	    }
	    else if (newColnum == 4){
		newCol = "Blue";
	    }
	    
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
