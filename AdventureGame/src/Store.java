
public class Store extends NormalLoc {

	Store(Player player) {
		super(player, "Store");
	}
	
	public boolean getLocation() {
		System.out.println("Welcome to the store!");
		System.out.println("Current Money: " + player.getMoney());
		System.out.println("1) Weapons!");
		System.out.println("2) Armors!");
		System.out.println("3) Exit!");
		System.out.println("Your choice: ");
		int sell = scan.nextInt();
		int sellID;
		
		switch(sell) {
		case 1:
			sellID = weaponMenu();
			buyWeapon(sellID);
			
			break;
			
		case 2:
			sellID = armorMenu();
			buyArmor(sellID);
			
			break;
			
		case 3:
			System.out.println("You left the store!");
			
		default:
			
			
			break;
		}
		return true;
	}
	
		public int armorMenu() {
			System.out.println("Armor List!");
			System.out.println("1) Light Armor (Avoids 1 damage!) - Price:  5");
			System.out.println("2) Medium Armor(Avoids 3 damage!) - Price: 15");
			System.out.println("3) Heavy Armor (Avoids 5 damage!) - Price: 25");
			System.out.println("4) Exit!");
			System.out.println("Your choice:");
			int sellArmorID = scan.nextInt();
			return sellArmorID;
		}
		
		public void buyArmor(int itemID) {
			int avoid = 0, price = 0;
			String aName = null;
			
			switch(itemID) {
			case 1:
				avoid = 1;
				price = 5;
				aName = "Light Armor";
				
				break;
				
			case 2:
				avoid = 3;
				price = 15;
				aName = "Medium Armor";
				
				break;
				
			case 3:
				avoid = 5;
				price = 25;
				aName = "Heavy Armor";
				
				break;
				
			case 4:
				System.out.println("You left the store!");
			
				break;
				
			default:
				System.out.println("Invalid Transaction!");
				
				break;
			}
			
			if(price > 0) {
				if (player.getMoney() >= price) {
					player.getInv().setAvoid(avoid);
					player.getInv().setaName(aName);
					player.setMoney(player.getMoney() - price);
					System.out.println("You bought a " + aName + "! You will prevent " + player.getInv().getAvoid() + " damage!");
					System.out.println("Your remaining balance: " + player.getMoney());
				}
				
				else {
					System.out.println("Insufficent funds!");					
				}
			}
		}
		
		
		
		public int weaponMenu() {
			System.out.println("Weapon List!");
			System.out.println("1) Crowbar - Damage: 10 - Price: 15)");
			System.out.println("2) Pistol  - Damage: 15 - Price: 25)");
			System.out.println("3) Rifle   - Damage: 20 - Price: 35)");
			System.out.println("4) Exit!");
			System.out.println("Your choice: ");
			int sellWeaponID = scan.nextInt();
			return sellWeaponID;
		}
		
		public void buyWeapon(int itemID) {
			int damage = 0, price = 0;
			String wName = null;
			
			switch(itemID) {
			case 1:
				damage = 10;
				price = 15;
				wName = "Crowbar";
				
				break;
				
			case 2:
				damage = 15;
				price = 25;
				wName = "Pistol";
				
				break;
				
			case 3:
				damage = 20;
				price = 35;
				wName = "Rifle";
						
				break;
				
			case 4:
				System.out.println("You left the store!");
			
				break;
				
			default:
				System.out.println("Invalid Transaction!");
				
				break;
			}
			
			if(price > 0) {
				if (player.getMoney() >= price) {
					player.getInv().setDamage(damage);
					player.getInv().setwName(wName);
					player.setMoney(player.getMoney() - price);
					System.out.println("You bought a " + wName + "! - Previous damage: " + player.getDamage() + " - New damage: " + player.getTotalDamage());
					System.out.println("Your remaining balance: " + player.getMoney());
				}
				
				else {
					System.out.println("Insufficent funds!");					
				}
			}
	}
}