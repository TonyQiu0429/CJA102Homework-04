package hw5;

public class MyRectangleMain {
	public static void main(String[] args) {
		// (1) 使用無參數建構子
		MyRectangle rect1 = new MyRectangle();
		System.out.println("使用無參數建構子的面積: " + rect1.getArea()); 

		// (2) 使用有參數建構子
		MyRectangle rect2 = new MyRectangle(10, 20);
		System.out.println("使用有參數建構子的面積: " + rect2.getArea());

		// (3) 使用設定參數有參數建構子
		MyRectangle rect3 = new MyRectangle();
		rect3.setWidth(30);
		rect3.setDepth(20);
		System.out.println("使用設定參數建構子的面積: " + rect3.getArea());

	}
}
