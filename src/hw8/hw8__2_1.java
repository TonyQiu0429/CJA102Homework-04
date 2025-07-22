package hw8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//• 請寫一隻程式，能印出不重複的Train物件
public class hw8__2_1 {
	public static void main(String[] args) {
		Set<Train> set = new HashSet<Train>();
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);
		
		System.out.println("------一般 for 迴圈（先轉成 List）----------");
		List<Train> list = new ArrayList<>(set); // 轉成 List
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("------迭代器----------");
		Iterator<Train> it = set.iterator();
		while (it.hasNext()) {
			Train t = it.next();
			System.out.println(t);
		}
		System.out.println("--------for each--------");
		for (Train t : set) {
			System.out.println(t);
		}

	}
}
