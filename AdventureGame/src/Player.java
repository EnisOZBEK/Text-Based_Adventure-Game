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
		System.out.println("\nTarih 28 Haziran 2023. G�z�n� bir hastane odas�nda a��yorsun. Tek hat�rlad���n havada devasa ye�il bir gaz bulutu ve ard�ndan gelen siren sesleri.\r\n"
				+ "Uzand���n yataktan zar zor kalk�yorsun ama o da ne kap�nda hastane polisinin �niformas�n� g�r�yorsun! Hem�ireyi �a��rmak i�in tu�a bas�yorsun ama -\r\n"
				+ "kimse gelmiyor. �ok ge�meden etrafta �l�m sessizli�i oldu�unu farkediyorsun. Polise ne oldu�unu sormak i�in kap�ya y�neldi�inde polisin kafas�n�n -\r\n"
				+ "yerinde olmad���n� ve koridorda garip ve yava� �ekilde y�r�yen kanlar i�inde 2 insan oldu�unu farkediyorsun. Kap�y� yava��a a�maya �al���yorsun a -\r\n"
				+ "ma kap� kilitli oldu�u i�in a��lm�yor.Son �are yerden buldu�un levyeyle kap�n�n cam�n� k�r�p polisin kemerinde ki anahtarla kap�y� a��yorsun. Kor -\r\n"
				+ "idordaki insanlara sesleniyorsun ama onlar bir anda garip sesler ��kar�p �st�ne do�ru ko�maya ba�l�yorlar. Hemen yan odadan e�yalar�n� al�p hasta -\r\n"
				+ "neden ka��yorsun. Sokaklar bombo� ve her yer kan kokuyor. K�sa bir s�re sonra hi� beklemedi�in bir anda g�lgelerin i�inden bir adam seni hemen ya -\r\n"
				+ "n�na �ekiyor ve seni silah zoruyla g�venli b�lge ad�n� verdi�i bir yere g�t�r�yor. Vard���n�zda sana t�m olanlar� a��kl�yorlar. Global bir zombi  -\r\n"
				+ "istilas�n�n ba�lad���n�, �ok az insan�n hayatta kald���n� ve kalanlar�n hayatta kalmak i�in birbirlerine zarar verdiklerini ��reniyorsun. Bu \"g�v-\r\n"
				+ "enli b�lgede\" 50'den fazla insan var ve hepsi birbiri i�in �al���yor. Senide aralar�nda g�rmek istediklerini ve ne kadar kalabal�k olurlarsa haya-\r\n"
				+ "tta kalma �anslar�n�n o kadar fazla oldu�unu s�yl�yorlar. Sende tabii ki teklifi kabul ediyorsun. Aradan bir ka� ay ge�iyor. Grup halinde avlanma -\r\n"
				+ "ya ��kt���n�z bir g�n nehir kenar�nda bal�k avlarken tek ki�ilik bir teknenin hala �al���r oldu�unu ancak benzininin olmad���n� farkediyorsun. Yol-\r\n" 
				+ "boyunca yan�na yetecek miktarda yemek ve su bulup, Benzin sat�n alabilirsen bu tekneyle insan olmayan bir adaya gidebilir ve bu �ehirdeki sefil ha-\r\n"
				+ "yattan kurtulup adada neredeyse hi� bir tehlike olmadan istedi�in gibi ya�ayabilirsin!");
		
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