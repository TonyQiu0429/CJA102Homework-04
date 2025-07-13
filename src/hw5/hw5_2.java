package hw5;

//請設計一個方法為randAvg()，從10個0～100(含100)
//的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
public class hw5_2 {
	public static void randAvg() {
		int[] a = new int[10];
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 101);
			b += a[i];
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("平均值為:" + (double)b / a.length);
	}

	public static void main(String[] args) {
		randAvg();
	}

}