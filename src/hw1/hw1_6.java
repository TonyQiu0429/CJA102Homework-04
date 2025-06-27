package hw1;
//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因
public class hw1_6 {
	public static void main(String[] args) {
		System.out.println(5+5); //為算數運算子，故結果出來為10
		System.out.println(5+'5');//'5'為unicode字元，代表是數字為53，故5+53出來結果為58
		System.out.println(5+"5");//"5"為字串，故數字5與"5"結合為字串"55"
	}
}
