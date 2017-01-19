public class DrawTwo extends Card{

    //overloaded constructor
    public DrawTwo (String col){
	color = col;
    }

    public boolean canPlay(){
	return ((color.equals(Woo.topCard.color)));
    }//end canPlay()

    public boolean play(){
	if (this.canPlay()){
	    //Woo.topCard = this;
	    Woo.users[Woo.order+1].draw();
	    Woo.users[Woo.order+1].draw();
	    System.out.println("Played a Draw Two card. Next player draws two cards.");
	    return true;
	}
	/*else {
	    System.out.println("Cannot play card. Try a different card");
	    }*/
	return false;
    }//end play()

    public String toString(){
	String retStr = "";
	retStr += "DrawTwo, " + "Color " + color + "\n";
	return retStr;
    }//end toString()
}
    
