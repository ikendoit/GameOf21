package scraps;

public class twenty_one_cards {
	int num ; 
	char u ; 

	public void set(int num,char u ) 						// initialize the cards 
	{
		this.num = num; 
		this.u = u;
	}
	public int getnum()
	{
		return num ; 
	}
	public String show()									// show the cards, transforming to appropriate forms of cards
	{	String s="";
		if (this.num<=10)
		s+= (this.num+""+String.valueOf(this.u));
		else if (this.num == 11 )
		s+= ("J" + String.valueOf(this.u)); 
		else if (this.num == 12 )
		s+= ("Q" + String.valueOf(this.u)) ; 
		else if (this.num == 13 ) 
		s+= ("K" + String.valueOf(this.u)) ; 
		else s = "ME PONGO JOKER";
		return s ; 
		
	}
}
