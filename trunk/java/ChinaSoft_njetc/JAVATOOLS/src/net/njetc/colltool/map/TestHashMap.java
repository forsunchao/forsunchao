package net.njetc.colltool.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> strMap = new HashMap<String, String>();
		//存放元素 K,V
		strMap.put("nanjing", "南京");
		strMap.put("shanghai", "上海");
		strMap.put("beijing", "北京");
		strMap.put("shenzheng", "深圳");
		//允许空的K,V
		strMap.put(null, "空的");
		System.out.println(strMap.size());
		//根据一个K值获取一个V
		System.out.println(strMap.get("beijing"));
		//可以根据空K获取V
		//System.out.println(strMap.get(null));
		//strMap.remove("shanghai");
		//遍历k
		Iterator<String> itStr= strMap.keySet().iterator();
		while(itStr.hasNext()){
			System.out.println(itStr.next());
		}
		//遍历v
		 itStr= strMap.values().iterator();
			while(itStr.hasNext()){
				System.out.println(itStr.next());
			}
	}

}
