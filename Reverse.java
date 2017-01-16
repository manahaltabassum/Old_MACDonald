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
	Woo.setDirection(-1);
    }
}//end Reverse
