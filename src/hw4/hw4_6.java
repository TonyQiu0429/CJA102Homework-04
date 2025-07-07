package hw4;

//班上有8位同學,他們進行了6次考試結果如下:
//
//  1    2    3    4    5   6   7   8
//1  10   35   40   100  90  85  75  70
//2  37   75   77   89   64  75  70  95
//3  100  70   79   90   75  70  79  90
//4  77   95   70   89   60  75  85  89
//5  98   70   89   90   75  90  89  90
//6  90   80   100  75   50  20  99  75
//
//請算出每位同學考最高分的次數
//(提示:二維陣列)
public class hw4_6 {
	public static void main(String[] args) {
		int[][] scores = { 
				{ 10, 35, 40, 100, 90, 85, 75, 70 }, 
				{ 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, 
				{ 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, 
				{ 90, 80, 100, 75, 50, 20, 99, 75 } };
		int[] toppoint = new int[8];  // 紀錄每位學生考最高分次數

		for (int test = 0; test < 6 ; test++) {
		    int maxScore = scores[test][0];
		    // 找出這次考試的最大分數
		    for (int student = 1; student < 8 ; student++) {
		        if (scores[test][student] > maxScore) {
		            maxScore = scores[test][student];
		        }
		    }
		    // 找出所有得最高分的學生，次數+1
		    for (int student = 0; student < 8; student++) {
		        if (scores[test][student] == maxScore) {
		            toppoint[student]++;
		            System.out.println("學生" + (student + 1) + " 在第 " + (test + 1) + " 次考試考了最高分（" + maxScore + "）");
		        }
		    }
		}
		System.out.println("============彙總次數=============");
		for (int i = 0; i < 8 ;i++)
		System.out.println("學生" + (i + 1) + "號考了" + toppoint[i] + "次最高分");

	}
}
