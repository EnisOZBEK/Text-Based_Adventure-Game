
public class SafeHouse extends NormalLoc {

	SafeHouse(Player player) {
		super(player, "Safe House");
	}
	
	public boolean getLocation() {
		System.out.println("Would you like to be treated ? - Price: 5 - (Y)es or (N)o: ");
		String slctCase = scan.next();
		slctCase = slctCase.toUpperCase();
		
		if(slctCase.equals("Y") && player.getMoney() >= 5) {
			player.setHealth(player.getrHealth());
			player.setMoney(player.getMoney() - 5);
			System.out.println("You went to safe house and you are healed!");
		}
		else {
			return true;
		}
		
		return true;
	}

}
