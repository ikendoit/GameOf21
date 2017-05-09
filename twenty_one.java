package scraps;

import java.util.ArrayList;


abstract class deck extends twenty_one_cards
{
	char c = 0x2665;
	int count =0;
	twenty_one_cards[] cards = new twenty_one_cards[52];
	
	//create the deck with 4 groups, 52 cards.
	{
		
					for ( int k =0 ; k < 4 ; k ++){
						if (k==1) c= 0x2666;
						if (k==2) c= 0x2663;
						if (k==3) c= 0x2660;
						
						for ( int i = 1 ; i <= 13 ; i ++ ){
							cards[count] = new twenty_one_cards();
							cards[count].set(i,c);
							count++;
						}
					}
		}
	
	public void showdeck()
	{
		for ( int i = 0 ; i < 52 ; i ++ )
			System.out.println(cards[i].show());
	}
	
		//scramble the deck
	{
		int ran ; 
		int num ;
		char k ; 
		for ( int i = 0 ; i < 52 ; i ++ )
		{
			ran = (int) (52*Math.random());
			num = cards[i].num;
			k = cards[i].u;
			cards[i].num = cards[ran].num;
			cards[i].u = cards[ran].u;
			cards[ran].num = num ; 
			cards[ran].u = k;
		}
		
	}
}
class player extends deck
{
	
	ArrayList<twenty_one_cards> onhand = new ArrayList<twenty_one_cards>();
	static int i=0;
	String name ; 
	
	int curscore = 0 ;
	
	player(String name )
	{
		this.name = name ; 
	}
	
	String view()
	{
		String ihave="";
		for ( int i = 0 ; i < onhand.size() ; i++)
		ihave += onhand.get(i).show();
		return ihave;
	}
	
	void getcard()
	{ 
		onhand.add(this.cards[i]);
		curscore+= this.cards[i].getnum();
		i++;
	}
}

public class twenty_one {
	public static void main(String[] args) 
	{	
		twenty_one_game game = new twenty_one_game();
		game.start();
	}
}
