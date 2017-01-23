public class DrawTwo extends Card{

    //overloaded constructor
    public DrawTwo (String setColor){
	color = setColor;
    }

    public boolean canPlay(){
	return ((color.equals(Woo.topCard.color)) || (Woo.topCard instanceof DrawTwo));
    }//end canPlay()

    public boolean play(){
	if (this.canPlay()){
	    //Woo.topCard = this;
	    Woo.users[Woo.mod(Woo.order + Woo.getDirection(), Woo.users.length)].draw();
	    Woo.users[Woo.mod(Woo.order + Woo.getDirection(), Woo.users.length)].draw();
	    System.out.println("Next player draws two cards.");
	    return true;
	}
	/*else {
	    System.out.println("Cannot play card. Try a different card");
	    }*/
	return false;
    }//end play()

    public String toString(){
	String retStr = "";
	retStr += color + " DrawTwo";
	return retStr;
    }//end toString()
}
    
