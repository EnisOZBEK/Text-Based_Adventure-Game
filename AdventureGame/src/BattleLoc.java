
public abstract class BattleLoc extends Location {
	protected Enemies enemies;
	protected String itemName;
	
	BattleLoc(Player player, String name, Enemies enemies, String itemName) {
		super(player);
		this.name = name;
		this.enemies= enemies;
		this.itemName = itemName;
	}
	
	public boolean getLocation() {
		int enemyCount = enemies.count();
		
		System.out.println("You went to " + this.getName());
		System.out.println("Be carefull! " + enemyCount + " " + enemies.getName() + " is also here!");
		System.out.println("(F)ight or (R)un away: ");
		String slctCase = scan.next();
		slctCase = slctCase.toUpperCase();
		
		if(slctCase.equals("F")) {
			if(combat(enemyCount) == true) {
				System.out.println("You fought well and won!");
				if(this.itemName.equals("Food") && player.getInv().isFood() == false) {
					System.out.println("You looted " + this.itemName + "!");
					player.getInv().setFood(true);
				}
				else if(this.itemName.equals("Water") && player.getInv().isWater() == false) {
					System.out.println("You looted " + this.itemName + "!");
					player.getInv().setWater(true);
				}
				else if(this.itemName.equals("Fuel") && player.getInv().isFuel() == false) {
					System.out.println("You looted " + this.itemName + "!");
					player.getInv().setFuel(true);
				}
				return true;
			}		
			if(player.getHealth() <= 0) {
				System.out.println("You died!");
				return false;
			}
		}
		return true;
	}
	
	public boolean combat(int enemyCount) {
		for(int i = 0; i < enemyCount; i++) {
			int defEnmyHealth = enemies.getHealth();
			playerStats();
			enemyStats();
			
			while(player.getHealth() > 0 && enemies.getHealth() > 0) {
				System.out.println("(H)it or (R)un away!");
				String slctCase = scan.next();
				slctCase = slctCase.toUpperCase();
				
				if(slctCase.equals("H")) {
					System.out.println("You hit!");
					enemies.setHealth(enemies.getHealth() - player.getTotalDamage());
					afterHit();
					if(enemies.getHealth() > 0) {
						System.out.println(enemies.getName() + " hit you!");
						player.setHealth(player.getHealth() - (enemies.getDamage() - player.getInv().getAvoid()));
						afterHit();
					}
				}
				else {
					break;
				}
			}
			
			if(enemies.getHealth() <= 0 && player.getHealth() > 0) {
				System.out.println("You beat the zombie!");
				player.setMoney(player.getMoney() + enemies.getAward());
				System.out.println("Current money: " + player.getMoney());
				enemies.setHealth(defEnmyHealth); 		
			}
			else {
				return false;
			}
			System.out.println("-------------------------");
		}
		
		return true;
	}
	
	public void playerStats() {
		System.out.println(player.getName() + " stats:\n-------------------------");
		System.out.println("Health: " + player.getHealth());
		System.out.println("Damage: " + player.getTotalDamage());
		System.out.println("Money : " + player.getMoney());
	}
	
	public void enemyStats() {
		System.out.println(enemies.getName() + " stats:\n-------------------------");
		System.out.println("Health: " + enemies.getHealth());
		System.out.println("Damage: " + enemies.getDamage());
		System.out.println("Award : " + enemies.getAward());
		System.out.println();
	}
	
	public void afterHit() {
		System.out.println("Your health: " + player.getHealth());
		System.out.println(enemies.getName() + " health: " + enemies.getHealth());
		System.out.println("-------------------------");
	}
}