public class DrawTwo extends Card{

    //instance vars
    private String color;

    //overloaded constructor
    public DrawTwo (String col){
	color = col;
    }

    public boolean canPlay(){
	return ((color.equals(Woo.topCard.color)));
    }//end canPlay()

    public void play(){
	if (this.canPlay()){
	    Woo.topCard = this;
	    Player[order+1].draw();
	    Player[order+1].draw();
	    System.out.println("Played a Draw Two card. Next player draws two cards.");
	}
	else {
	    System.out.println("Cannot play card. Try a different card");
	}
    }
}
    
