public class Skip extends Card{

    //inst vars
    private String color;

    //overloaded constructor
    public Skip(String colour){
	color = colour;
    }
    
    public boolean canPlay(){
	return color.equals(Woo.topCard.color);
    }

    public void play(){
	if(canPlay()){
	    order++;
	}
    }

    public String toString(){
	String retStr = "";
	retStr += "Skipped~";
	return retStr;
    }
}
