package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			Calculator XY = new Calculator();

			System.out.println("請輸入x,y值，以計算x的y平方");
			System.out.println("請輸入x值：");
			int x = sc.nextInt();
			System.out.println("請輸入y值：");
			int y = sc.nextInt();

			XY.setXY(x, y);

			System.out.println(x + "的" + y + "次方為" + XY.pow());
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
