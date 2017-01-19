public class Skip extends Card{

    //overloaded constructor
    public Skip(String colour){
	color = colour;
    }
    
    public boolean canPlay(){
	return color.equals(Woo.topCard.color);
    }

    public boolean play(){
	if(canPlay()){
	    Woo.order++;
	    return true;
	}
	else {
	    return false;
	}
    }

    public String toString(){
	String retStr = "";
	retStr += "Skipped~";
	return retStr;
    }
}
