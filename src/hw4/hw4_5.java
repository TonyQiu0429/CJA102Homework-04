package hw4;

//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//(提示1:Scanner,陣列)
//(提示2:需將閏年條件加入)
//(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
import java.util.Scanner;

public class hw4_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入年分:");
		int keyyear = sc.nextInt();
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if ((keyyear % 4) == 0 && (keyyear % 100 != 0) || (keyyear % 400 == 0)) {
			month[1] = 29;
		}
		System.out.println("請輸入月分:");
		int keymonth = sc.nextInt();
		while (keymonth < 1 || keymonth > 12) {
			System.out.println("月份輸入錯誤，請重新輸入");
			keymonth = sc.nextInt();
		}
		System.out.println("請輸入日期:");
		int keyday = sc.nextInt();
		while (keyday < 1 || keyday > month[keymonth - 1]) {
			System.out.println("日期輸入錯誤，請重新輸入 1~" + month[keymonth - 1] + "：");
			keyday = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < keymonth - 1; i++) {
			sum += month[i];
		}
		sum += keyday;
		System.out.print("輸入的日期為" + keyyear + "年的第" + sum + "天");
	}
}
