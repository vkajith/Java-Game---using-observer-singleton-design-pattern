import java.util.ArrayList;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

// NAME:  VYSYAKH A
// ID NO: 2017A2PS0089P




public class GameDriver {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		int playerCount = 5;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
      
     // Reading playercount using readLine 
		
		System.out.println("Enter player Count:\n");
		
		playerCount=Integer.parseInt(reader.readLine());
		
		
		Moderator game = new Moderator();
		
		ArrayList<Player> playerList = new ArrayList<Player>(playerCount);
		
		System.out.println("Player List\n");
		
		for(int i=0; i<playerCount; i++) 
		{
		   playerList.add(new Player(game));
		}
		
		//game.unregister(playerList.get(1));
		
		for(Player player : playerList) player.start();
		
		System.out.println("\n....Game starts...\n");
		
		game.start();
		
	}

}

