package hw1;
//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
public class hw1_2 {
	public static void main(String[] args) {
		int sets = 200 / 12, eggs = 200 % 12;
		System.out.println("總共有"+sets +"打及"+eggs+"顆");
	}
	
}
