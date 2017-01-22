public class DrawTwo extends Card{

    //overloaded constructor
    public DrawTwo (String setColor){
	color = setColor;
    }

    public boolean canPlay(){
	return ((color.equals(Woo.topCard.color)));
    }//end canPlay()

    public boolean play(){
	if (this.canPlay()){
	    //Woo.topCard = this;
	    Woo.users[(Woo.order+1)%(Woo.users.length)].draw();
	    Woo.users[(Woo.order+1)%(Woo.users.length)].draw();
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
	retStr += color + " DrawTwo"
	return retStr;
    }//end toString()
}
    
