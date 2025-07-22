package hw8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//• 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
//• 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
//• (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)

public class hw8_2_2 {

	public static void main(String[] args) {
		Set<Train> set = new TreeSet<>(); // TreeSet 會根據 compareTo 排序且自動去重

		set.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));
		set.add(new Train(118, "自強", "高雄", "台北", 500));
		set.add(new Train(1288, "區間", "新竹", "基隆", 400));
		set.add(new Train(122, "自強", "台中", "花蓮", 600));
		set.add(new Train(1222, "區間", "樹林", "七堵", 300));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700)); // 重複的車次

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
		System.out.println("-------for each-------");
		for (Train t : set) {
			System.out.println(t);
		}

	}
}
