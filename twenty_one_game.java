package scraps;

import java.util.Scanner;

public class twenty_one_game {

	public void start() {
		int winscore = 0 ;
		int winpos = -1;
		boolean end = false; 
		Scanner sc = new Scanner(System.in);
	//create players
		player[] players = new player[4]; 
		players[0] = new player("Joe"); 
		players[1] = new player("Biden"); 
		players[2] = new player("Osama");
		System.out.println("input your name : ") ; 
		String s = sc.next();
		players[3] = new player(s);
		
	//draw cards
		for ( int i = 0 ; i < 4 ; i ++ )
		{
			players[i].getcard();
			players[i].getcard();
		}
		
		while ( !end)
		{
			System.out.println(players[3].view());
			System.out.println("what would you like to do  ") ; 
			System.out.printf("say 1 : to get card \nsay 2: to finish  ") ; 
			
			int in  = sc.nextInt() ;
			
			if (in==1 ) 
				{ System.out.println("draw then");  players[3].getcard() ;} 
			if (in==2)
				{ System.out.println("done then"); end= true; }
		}
	//get score
		for ( int i = 0 ; i < 4 ; i ++ )
		{
			if (winscore < players[i].curscore && players[i].curscore <=21)
				{
				winscore = players[i].curscore ; 
				winpos = i ; 
				}
			
		}
		
		System.out.println("the winner is "+players[winpos].name+" with "+winscore+" score");
		System.out.println("then we have the losers : ");
		for ( int i = 0 ; i < 4 ; i ++ ) 
			if ( i != winpos )
				System.out.println("player "+players[i].name+" with "+players[i].curscore);
		sc.close();
	}
	

}
