public class Reverse extends Card{

    //overloaded constructor
    public Reverse(String colour){
	color = colour;
    }

    public boolean canPlay(){
	return color.equals(Woo.topCard.color);
    }

    public boolean play(){
	if(canPlay()){
	    Woo.changeDirection();
	    return true;
	}
	else{
	    return false;
	}
    }

    public String toString(){
	String retStr = "";
	retStr = "Reverse, reverse!";
	return retStr;
    }
}//end Reverse
