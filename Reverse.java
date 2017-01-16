public class Reverse extends Card{

    //inst vars
    private String color;

    //overloaded constructor
    public Reverse(String colour){
	color = colour
    }

    public boolean canPlay(){
	return color.equals(Woo.topCard.color);
    }

    public void play(){
	if(canPlay()){
	    Woo.setDirection(-1);
	}
    }

    public String toString(){
	String retStr = "";
	retStr = "Reverse, reverse!";
	return retStr;
    }
}//end Reverse
