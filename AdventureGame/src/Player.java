import java.util.Scanner;

public class Player {
	private int damage, health, money, rHealth;
	private String name, gender;
	private Inventory inv;
	
	Scanner scan = new Scanner(System.in);

	public Player(String name) {
		this.name = name;
		this.inv = new Inventory();
	}
	
	public void SelectGender() {
		
		switch(Genders()) 
		{
		//MALE
		case 1:
			gender = "Male";
			
			setGender(gender);
			setName(name);
			setDamage(5);
			setHealth(50);
			setMoney(2);
			setrHealth(50);
			
			break;	
		//FEMALE	
		case 2:
			gender = "Female";
			
			setGender(gender);
			setName(name);
			setDamage(2);
			setHealth(35);
			setMoney(15);
			setrHealth(35);
			
			break;
		//MALE
		default:
			gender = "Male";
			
			setGender(gender);
			setName(name);
			setDamage(5);
			setHealth(50);
			setMoney(2);
			setrHealth(50);
			
			break;
		}
		System.out.println("Your character has been created!");
		System.out.println("Name: " + getName() + " - Gender: " + getGender() + " - Damage: " + getDamage() + " - Health: " + getHealth() + " - Money: " + getMoney());
		System.out.println("\nTarih 28 Haziran 2023. Gözünü bir hastane odasýnda açýyorsun. Tek hatýrladýðýn havada devasa yeþil bir gaz bulutu ve ardýndan gelen siren sesleri.\r\n"
				+ "Uzandýðýn yataktan zar zor kalkýyorsun ama o da ne kapýnda hastane polisinin üniformasýný görüyorsun! Hemþireyi çaðýrmak için tuþa basýyorsun ama -\r\n"
				+ "kimse gelmiyor. Çok geçmeden etrafta ölüm sessizliði olduðunu farkediyorsun. Polise ne olduðunu sormak için kapýya yöneldiðinde polisin kafasýnýn -\r\n"
				+ "yerinde olmadýðýný ve koridorda garip ve yavaþ þekilde yürüyen kanlar içinde 2 insan olduðunu farkediyorsun. Kapýyý yavaþça açmaya çalýþýyorsun a -\r\n"
				+ "ma kapý kilitli olduðu için açýlmýyor.Son çare yerden bulduðun levyeyle kapýnýn camýný kýrýp polisin kemerinde ki anahtarla kapýyý açýyorsun. Kor -\r\n"
				+ "idordaki insanlara sesleniyorsun ama onlar bir anda garip sesler çýkarýp üstüne doðru koþmaya baþlýyorlar. Hemen yan odadan eþyalarýný alýp hasta -\r\n"
				+ "neden kaçýyorsun. Sokaklar bomboþ ve her yer kan kokuyor. Kýsa bir süre sonra hiç beklemediðin bir anda gölgelerin içinden bir adam seni hemen ya -\r\n"
				+ "nýna çekiyor ve seni silah zoruyla güvenli bölge adýný verdiði bir yere götürüyor. Vardýðýnýzda sana tüm olanlarý açýklýyorlar. Global bir zombi  -\r\n"
				+ "istilasýnýn baþladýðýný, çok az insanýn hayatta kaldýðýný ve kalanlarýn hayatta kalmak için birbirlerine zarar verdiklerini öðreniyorsun. Bu \"güv-\r\n"
				+ "enli bölgede\" 50'den fazla insan var ve hepsi birbiri için çalýþýyor. Senide aralarýnda görmek istediklerini ve ne kadar kalabalýk olurlarsa haya-\r\n"
				+ "tta kalma þanslarýnýn o kadar fazla olduðunu söylüyorlar. Sende tabii ki teklifi kabul ediyorsun. Aradan bir kaç ay geçiyor. Grup halinde avlanma -\r\n"
				+ "ya çýktýðýnýz bir gün nehir kenarýnda balýk avlarken tek kiþilik bir teknenin hala çalýþýr olduðunu ancak benzininin olmadýðýný farkediyorsun. Yol-\r\n" 
				+ "boyunca yanýna yetecek miktarda yemek ve su bulup, Benzin satýn alabilirsen bu tekneyle insan olmayan bir adaya gidebilir ve bu þehirdeki sefil ha-\r\n"
				+ "yattan kurtulup adada neredeyse hiç bir tehlike olmadan istediðin gibi yaþayabilirsin!");
		
		System.out.println();
		System.out.println("***Goal of the game: Loot water from dam, food from restaurant and buy fuel from store to complete the game!***");
		System.out.println();
	}
	
	public int Genders() {
		System.out.println("Please choose a gender: ");
		System.out.println("1) Male ===> Damage: 5 - Health: 50 - Money: 2");
		System.out.println("2) Female => Damage: 2 - Health: 35 - Money: 15");
		System.out.println("Your choice: ");
		int GenderID = scan.nextInt();
		
		while(GenderID < 1 || GenderID > 2) {
			System.out.println("Please select a current one!");
			GenderID = scan.nextInt();
		}
			
		return GenderID;
	}
	
	public int getTotalDamage() {
		return this.getDamage() + this.getInv().getDamage();
	}
	
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Inventory getInv() {
		return inv;
	}

	public void setInv(Inventory inv) {
		this.inv = inv;
	}

	public int getrHealth() {
		return rHealth;
	}

	public void setrHealth(int rHealth) {
		this.rHealth = rHealth;
	}
}