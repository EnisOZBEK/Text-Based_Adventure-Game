import java.util.Scanner;

public class Game {
	Player player;
	Location loc;
	
	Scanner scan = new Scanner(System.in);
	
	public void begin() {
		
		System.out.println("Welcome to the Adventure Game by Enis ÖZBEK!");
		System.out.println("Before starting to game please type your name: ");
		String playerName = scan.nextLine();
		player = new Player(playerName);
		player.SelectGender();
		start();
	}
	public void start() {
		while(true) {
			System.out.println();
			System.out.println("#######################################################################################");
			System.out.println();
			System.out.println("Please select the region you want to go to!");
			System.out.println("1) Safe House : You are safe in here!");
			System.out.println("2) Store      : You can buy stuff from here!");
			System.out.println("3) Dam        : Low risk!(Water Zombies will appear!)");
			System.out.println("4) Restaurant : Medium risk!(Normal Zombies will appear!)");
			System.out.println("5) Gas Station: High risk!(Toxic Zombies will appear!)");
			System.out.println("Your choice: ");
			int selLoc = scan.nextInt();
			
			while(selLoc < 1 || selLoc > 5) {
				System.out.println("Please select a current one!");
				selLoc = scan.nextInt();
			}
			
			switch(selLoc) {
			
			case 1:
				loc = new SafeHouse(player);
				
				break;
				
			case 2:
				loc = new Store(player);
				
				break;
				
			case 3:
				loc = new Dam(player);
				
				break;
				
			case 4:
				loc = new Restaurant(player);
				
				break;
				
			case 5:
				loc = new GasStation(player);
				
				break;
				
			default:
				loc = new SafeHouse(player);
				
				break;
				
			}
			
			if(loc.getName() == "Safe House") {
				if(player.getInv().isFood() && player.getInv().isWater() && player.getInv().isFuel()) {
					System.out.println();
					System.out.println("CONGRATZ! You escaped to an island and finished the game!");
					
					break;
				}
				
			}
			
			if(!loc.getLocation()) {
				System.out.println("GAME OVER!");
				
				break;
			}
		}
	}
}