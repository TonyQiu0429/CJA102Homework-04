package hw5;

class RoleSet {
	private String job;
	private String name;
	private int level;
	private double exp;
	
	public RoleSet(String job,String name, int level, double exp) {
		this.job = job;
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
		public void showRoleInformation() {
			System.out.println("角色職業: " + job);
			System.out.println("角色名稱: " + name);
			System.out.println("角色等級: " + level);
			System.out.println("角色經驗: " + exp);
		}
	}
interface Action {
	void attack();
	
	default void defend() {
		System.out.println("防禦動作: 防禦");
	}
	
	default void run() {
		System.out.println("跑步動作: 跑");
	}
	default void skill() {
		System.out.println("這個職業無法施放技能,但有超強的體力");
	}

	default void action() {
		attack();
		defend();
		run();
		skill();
	}

	void setRole(RoleSet role);

	void showRoleInformation();
}

class Swordman implements Action {
	private RoleSet role;

	public void attack() {
		System.out.println("攻擊動作: 揮劍攻擊");
	}

	@Override
	public void setRole(RoleSet role) {
		this.role = role;
	}

	@Override
	public void showRoleInformation() {
		role.showRoleInformation();
	}
}

class ArrowMan implements Action {
	private RoleSet role;

	public void attack() {
		System.out.println("攻擊動作: 射箭攻擊");
	}
	
	@Override
	public void skill() {
		System.out.println("技能：萬箭齊發");
	}
		
	@Override
	public void setRole(RoleSet role) {
		this.role = role;
	}

	@Override
	public void showRoleInformation() {
		role.showRoleInformation();
	}
}

class Mage implements Action {
	private RoleSet role;

	public void attack() {
		System.out.println("攻擊動作: 魔杖攻擊");
	}
	@Override
	public void skill() {
		System.out.println("技能：火焰球");
	}

	@Override
	public void setRole(RoleSet role) {
		this.role = role;
	}
	
	@Override
	public void showRoleInformation() {
		role.showRoleInformation();
	}
}

