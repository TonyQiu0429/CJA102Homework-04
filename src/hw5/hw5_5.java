package hw5;

//身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//與數字的亂數組合，如圖
public class hw5_5 {
	public static void genAuthCode(int length) {
		for (int i = 0; i < length; i++) {
			int type = (int) (Math.random() * 3);   //種類
			char Aa1;
			if (type == 0) {
				Aa1 = (char) ((int) (Math.random() * 26) + 'A');
			} else if (type == 1) {
				Aa1 = (char) ((int) (Math.random() * 26) + 'a');
			} else {
				Aa1 = (char) ((int) (Math.random() * 10) + '0');
			}
			System.out.print(Aa1);
		}
	}

	public static void main(String[] args) {
		genAuthCode(8);
	}
}
