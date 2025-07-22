package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//• 請建立一個Collection物件並將以下資料加入：
//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//Object物件、“Snoopy”、BigInteger(“1000”)
//• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//• 移除不是java.lang.Number相關的物件
//• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
public class hw8_1 {

	public static void main(String[] args) {
		Train Train = new Train();
		List list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(Short.valueOf((short) 100));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(Train);
		list.add("Snoopy");
		list.add(BigInteger.valueOf(1000));
		
		System.out.println("傳統的for 迴圈：");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i)); // (注意:Set不能用傳統的for迴圈)
		System.out.println();
		
		System.out.println("迭代器Iterator：");
		for (Iterator it = list.iterator(); it.hasNext();)
			System.out.println(it.next() + " ");
		System.out.println();
		
		System.out.println("增強功能的 for 迴圈(Using Enhanced foreach)");
		for (Object object:list)
			System.out.println(object);
		System.out.println();
		
		Iterator<Object> it = list.iterator();
		while (it.hasNext()) {
		Object obj = it.next();
		if(!(obj instanceof Number) && !(obj instanceof BigInteger)) {
			it.remove();
		}
			
		}
		 System.out.println("只剩下 Number 相關的資料：");
	        for (Object obj : list) {
	            System.out.println(obj);
		
	}
}
}
