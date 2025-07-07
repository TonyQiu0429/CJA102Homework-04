package hw4;

import java.util.Arrays;

//有個一維陣列如下:
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示:陣列,length屬性)
public class hw4_1 {
	public static int summary(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static double average(int[] arr) {
		int sum = summary(arr);
		return (double) sum / arr.length;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		Arrays.sort(arr);
		int sum = summary(arr);
		double average = average(arr);
		System.out.println("總數為： " + sum);
		System.out.println("平均為： " + average);
		System.out.print("大於平均的數有：");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > average) {
				System.out.print(" " + arr[i]);
			}
		}
	}
}