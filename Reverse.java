public class Reverse extends Card{

    //overloaded constructor
    public Reverse(String setColor){
	color = setColor;
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
	retStr = color + "Reverse";
	return retStr;
    }
}//end Reverse
