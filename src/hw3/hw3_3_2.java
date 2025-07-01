package hw3;
//進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複

import java.util.Scanner;

public class hw3_3_2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("請輸入不想選的數字（1～9）：");
	        int dislike = sc.nextInt();

	        int[] nums = new int[6]; // 儲存結果
	        int count = 0;

	        while (count < 6) {
	            int x = (int)(Math.random() * 49) + 1;
	            int ten = x / 10;
	            int unit = x % 10;

	            if (ten == dislike || unit == dislike)
	                continue;

	            int i = 0;
	            while (i < count) {
	                if (nums[i] == x) {
	                    break; // 找到重複就跳出
	                }
	                i++;
	            }

	            if (i == count) { // 如果整個陣列都沒有重複
	                nums[count] = x;
	                count++;
	            }
	        }

	        // 印出結果
	        System.out.print("你可以選的號碼：");
	        for (int i = 0; i < 6; i++) {
	            System.out.print(nums[i] + " ");
	        }

			}
}