package test;

import java.util.EnumMap;

public class TestEnum {
	enum Color {
		Red, Yellow, Blue, Orange, Green, Purple, Brown, Black;
	}
	
	// 字符串型参数
	enum Size {
		SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

		private String bit;

		private Size(String bit) {
			this.bit = bit;
		}

		public String getBit() {
			return bit;
		}
	}
	
	// 整数型参数
	enum Day {
		SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);

		private int day;

		private Day(int day) {
			this.day = day;
		}

		public int getDay() {
			return day;
		}
	}
	
	public void paint(Color color) {
		switch (color) {
	    case Red:
	        ;// 操作代码
	    case Yellow:
	        ; // 操作代码
	    case Blue:
	        ; // 操作代码
	    case Orange:
	        ; // 操作代码
	    case Green:
	        ; // 操作代码
	    case Purple:
	        ; // 操作代码
	    case Brown:
	        ; // 操作代码
	    case Black:
	        ; // 操作代码
	    default:
	        ; // 操作代码
	    }
	}	

	public static void main(String args[]) {
		// 遍历枚举值
		Color[] colors = Color.values();
		for (int i = 0; i < colors.length; i++) {
			System.out.println(colors[i]);
		}
		
		// 使用map
		EnumMap<Color, String> map = new EnumMap<Color, String>(Color.class);
		map.put(Color.Red, "this is Red");
		map.put(Color.Yellow, "this is Yellow");
		map.put(Color.Blue, "this is Blue");
		map.put(Color.Orange, "this is Orange");
		map.put(Color.Green, "this is Green");
		map.put(Color.Purple, "this is Purple");
		map.put(Color.Brown, "this is Brown");
		map.put(Color.Black, "this is Black");
		for (int i = 0; i < colors.length; i++) {
			Color color = colors[i];
			System.out.println(map.get(color));
		}
		
		// 参数
		Size size = Size.SMALL;
		System.out.println(size.getBit());
		System.out.println(size.name());		
	}
}
