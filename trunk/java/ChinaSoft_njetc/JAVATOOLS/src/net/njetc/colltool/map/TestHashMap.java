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
		//���Ԫ�� K,V
		strMap.put("nanjing", "�Ͼ�");
		strMap.put("shanghai", "�Ϻ�");
		strMap.put("beijing", "����");
		strMap.put("shenzheng", "����");
		//����յ�K,V
		strMap.put(null, "�յ�");
		System.out.println(strMap.size());
		//����һ��Kֵ��ȡһ��V
		System.out.println(strMap.get("beijing"));
		//���Ը��ݿ�K��ȡV
		//System.out.println(strMap.get(null));
		//strMap.remove("shanghai");
		//����k
		Iterator<String> itStr= strMap.keySet().iterator();
		while(itStr.hasNext()){
			System.out.println(itStr.next());
		}
		//����v
		 itStr= strMap.values().iterator();
			while(itStr.hasNext()){
				System.out.println(itStr.next());
			}
	}

}
