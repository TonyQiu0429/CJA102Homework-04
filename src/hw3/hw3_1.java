package hw3;

import java.util.Scanner;
//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形,如圖示結果:
//(提示:Scanner,三角形成立條件,判斷式if else)
//(進階功能:加入直角三角形的判斷)

public class hw3_1 {
	public static void main(String[]args) {

	Scanner sc= new Scanner(System.in);// 建立輸入物件
	
	System.out.println("請一次輸入三個整數（代表三角形三邊長，用空白分開）：");

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (isTriangle(a, b, c)) {
        if (a == b && b == c) {
            System.out.println("這是正三角形");
        } else if (a == b || b == c || a == c) {
            if (isRightTriangle(a, b, c)) {
                System.out.println("這是等腰直角三角形");
            } else {
                System.out.println("這是等腰三角形");
            }
        } else if (isRightTriangle(a, b, c)) {
            System.out.println("這是直角三角形");
        } else {
            System.out.println("這是其他三角形");
        }
    } else {
        System.out.println("這不是三角形");
    }

    sc.close();
}

// 判斷是否為三角形
public static boolean isTriangle(int a, int b, int c) {
    return (a + b > c) && (a + c > b) && (b + c > a);
}

// 判斷是否為直角三角形
public static boolean isRightTriangle(int a, int b, int c) {
    int[] sides = {a, b, c};

    // 排序後：sides[0] <= sides[1] <= sides[2]
    java.util.Arrays.sort(sides);

    // 判斷最短兩邊之和是否等於最長邊
    return Math.pow (sides[2],2) == Math.pow (sides[0],2) +Math.pow (sides[1],2);
}
}