package hw3;

import java.util.Scanner;

//(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)
public class hw3_2_2 {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in); // 建立輸入物件
	        System.out.println("請猜數字：");
	        
	        int guessNumber = (int)(Math.random() * 100); // 0~100 的亂數
	        while(true) {
	        int a = sc.nextInt(); // 輸入猜的數字
		       
	        if (a == guessNumber) {
	            System.out.print("猜對了");
	            break;
	        } else if  (a < guessNumber) {
	            System.out.print("猜錯了，大於此數");

	        } else  {
	            System.out.print("猜錯了，小於此數");

	        }
	    }
	  }
	}
