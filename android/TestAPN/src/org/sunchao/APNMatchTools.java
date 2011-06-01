package org.sunchao;

/**
 * �@�e��APNƥ�䣬���ƥ���Ƅӻ���ͨ��APN
 */
public final class APNMatchTools {

	public static class APNNet {
		/**
		 * �й��ƶ�cmwap
		 */
		public static String CMWAP = "cmwap";

		/**
		 * �й��ƶ�cmnet
		 */
		public static String CMNET = "cmnet";

		// �й���ͨ3GWAP���� �й���ͨ3G���������� �й���ͨWAP���� �й���ͨ����������
		// 3gwap 3gnet uniwap uninet

		/**
		 * 3G wap �й���ͨ3gwap APN
		 */
		public static String GWAP_3 = "3gwap";

		/**
		 * 3G net �й���ͨ3gnet APN
		 */
		public static String GNET_3 = "3gnet";

		/**
		 * uni wap �й���ͨuni wap APN
		 */
		public static String UNIWAP = "uniwap";
		/**
		 * uni net �й���ͨuni net APN
		 */
		public static String UNINET = "uninet";
	}

	public static String matchAPN(String currentName) {
		if ("".equals(currentName) || null == currentName) {
			return "";
		}
		currentName = currentName.toLowerCase();
		if (currentName.startsWith(APNNet.CMNET))
			return APNNet.CMNET;
		else if (currentName.startsWith(APNNet.CMWAP))
			return APNNet.CMWAP;
		else if (currentName.startsWith(APNNet.GNET_3))
			return APNNet.GNET_3;
		else if (currentName.startsWith(APNNet.GWAP_3))
			return APNNet.GWAP_3;
		else if (currentName.startsWith(APNNet.UNINET))
			return APNNet.UNINET;
		else if (currentName.startsWith(APNNet.UNIWAP))
			return APNNet.UNIWAP;
		else if (currentName.startsWith("default"))
			return "default";
		else
			return "";
		// return currentName.substring(0, currentName.length() -
		// SUFFIX.length());
	}
}