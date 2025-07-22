package hw8;
//public Train(int i, String string, String string2, String string3, int j) {

import java.util.Objects;

	public class Train implements Comparable<Train> {
	    private int number;   // 車次編號，唯一識別
	    private String type;  // 車種 (普悠瑪、自強、區間等)
	    private String start; // 起點站
	    private String dest;  // 終點站
	    private int price;    // 票價

	    // 建構子
	    public Train(int number, String type, String start, String dest, int price) {
	        this.number = number;
	        this.type = type;
	        this.start = start;
	        this.dest = dest;
	        this.price = price;
	    }

	    public Train() {
			// TODO Auto-generated constructor stub
		}

		// Getter 方法 - 提供屬性存取
	    public int getNumber() { return number; }
	    public String getType() { return type; }
	    public String getStart() { return start; }
	    public String getDest() { return dest; }
	    public int getPrice() { return price; }

	    // hashCode() 和 equals() 只以車次 number 為唯一識別判斷
	    @Override
	    public int hashCode() {
	        return Objects.hash(number);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true; // 比較記憶體位置是否相同
	        if (obj == null) return false;
	        if (getClass() != obj.getClass()) return false;
	        Train other = (Train) obj;
	        return number == other.number; // 車次號碼相同視為相同物件
	    }

	    // 實作 Comparable 介面，讓 Train 可以排序
	    @Override
	    public int compareTo(Train other) {
	        // 按車次編號由大到小排序，反向比較
	        return Integer.compare(other.number, this.number);
	    }

	    // 自訂物件字串表示，方便印出物件資訊
	    @Override
	    public String toString() {
	        return "Train{" +
	            "車次：" + number +
	            ", 種類：" + type +
	            ", 起點：" + start +
	            ", 終點：" + dest +
	            ", 票價：" + price +
	            '}';
	    }
	}