package hw3;


import java.util.Scanner;

//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，
//猜錯會顯示錯誤訊息，
//猜對則顯示正確訊息，如圖示結果：
//(提示：Scanner，亂數方法，無窮迴圈)
public class hw3_2_1 {
  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in); // 建立輸入物件
      System.out.println("請猜數字：");

      int a = sc.nextInt(); // 輸入猜的數字
      int guessNumber = (int)(Math.random() * 10); // 0~9 的亂數

      if (a == guessNumber) {
          System.out.print("猜對了");
      } else if (a != guessNumber) {
          System.out.print("猜錯了，答案是：" + guessNumber);
      }
  }
}