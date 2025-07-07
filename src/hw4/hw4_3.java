package hw4;

//有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示:字元比對,String方法)
public class hw4_3 {
	public static void main(String[] args) {
		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0;
		for (int i = 0; i < planet.length; i++) {
			String word = planet[i];
			for (int j = 0; j < word.length(); j++) {
				String vowel = word.substring(j, j + 1);
				if (vowel.equals("a") || vowel.equals("e") || vowel.equals("i") || 
						vowel.equals("o")|| vowel.equals("u"))
				count++;
			}
		}
		System.out.print("共有" + count + "個母音");

	}
}
