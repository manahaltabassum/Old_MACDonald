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
	    System.out.println("Next player draws four cards.");
	    for (int i = 0; i < 4; i++) {
		Woo.users[Woo.mod(Woo.order + Woo.getDirection(), Woo.users.length)].draw();
	    }


	    System.out.println("What color would you like to play?");
	    String str = "";
	    str += "1... Red \n";
	    str += "2... Yellow \n";
	    str += "3... Green \n";
	    str += "4... Blue \n";
	    str += "Your choice: ";
	    System.out.print(str);
	    
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

	    Woo.order += Woo.getDirection();
	    System.out.println(Woo.users[Woo.mod(Woo.order, Woo.users.length)].name + " has been skipped!");
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
