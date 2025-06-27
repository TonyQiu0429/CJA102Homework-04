package hw1;
//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
public class hw1_4 {
	public static void main(String[] args) {
		final double π = 3.14;
		double a = 5, b = π * a * a, c = (int)(2 * π * a);
		System.out.println("圓面積為"+b);
		System.out.println("圓周長為"+c);
	}
}
