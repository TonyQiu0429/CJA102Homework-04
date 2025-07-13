package hw5;

public class GameTest {
	public static void main(String[] args) {
		Action s1 = new Swordman();
		s1.setRole(new RoleSet("劍士", "亞拉岡", 1, 0));

		Action a1 = new ArrowMan();
		a1.setRole(new RoleSet("弓箭手", "勒苟拉斯", 1, 0));

		Action m1 = new Mage();
		m1.setRole(new RoleSet("魔法師", "梅林", 1, 0));

		s1.showRoleInformation();
		s1.action();

		System.out.println("==============");

		a1.showRoleInformation();
		a1.action();

		System.out.println("==============");
		m1.showRoleInformation();
		m1.action();
	}
}
