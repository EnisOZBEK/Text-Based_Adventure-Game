
public class Inventory {
	private boolean water, food, fuel;
	private String wName, aName;
	private int damage, avoid;
	
	Inventory () {
		this.water = false;
		this.food = false;
		this.fuel = false;
		this.damage = 0;
		this.wName = null;
		this.aName = null;
	}

	public boolean isWater() {
		return water;
	}

	public void setWater(boolean water) {
		this.water = water;
	}

	public boolean isFood() {
		return food;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	public boolean isFuel() {
		return fuel;
	}

	public void setFuel(boolean fuel) {
		this.fuel = fuel;
	}

	public String getwName() {
		return wName;
	}

	public void setwName(String wName) {
		this.wName = wName;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getAvoid() {
		return avoid;
	}

	public void setAvoid(int avoid) {
		this.avoid = avoid;
	}
	
	
	

}
