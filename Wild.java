public class Wild extends Card{

    public Wild(){
	color = "";
    }

    public void setColor (String newColor){
	color = newColor;
    }

    public boolean canPlay(){
	return true;
    }

    /*plays card changing topCard to this card always and requires
    terminal input for what to chnage the new color to*/
    public boolean play(){
	if (this.canPlay()){
	    
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
	    return true;
	    //Woo.topCard = this;
	    //System.out.println("Successfully changed color to " + newCol +" .");
	}
	else{
	    return false;
	}
    }//end play()

    public String toString(){
	String retStr = "";
	retStr += color + " ";
	retStr += "Wild Card";
	return retStr;
    }//end toString()
}
