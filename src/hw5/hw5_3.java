package hw5;
//利用Overloading，設計兩個方法int maxElement(int x[][])
//與double maxElement(double x[][])，
//可以找出二維陣列的最大值並回傳，如圖：
public class hw5_3 {
	public static void MaxElement(int[][] array) {
		int max = array[0][0];
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
		}
		System.out.println("最大值為:"+max);
	}
	public static void MaxElement(double[][] array) {
		double max = array[0][0];
		for(int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
			}
		}
		System.out.println("最大值為:"+max);
	}
	
	public static void main(String[] args) {
		int i[][]= new int[][] {{1,6,3},{9,5,2}};
		double d[][] = new double[][] {{1.2,3.5,2.2},{7.4,2.1,8.2}};
		
		MaxElement(i);
		MaxElement(d);
		
	}
	
}
