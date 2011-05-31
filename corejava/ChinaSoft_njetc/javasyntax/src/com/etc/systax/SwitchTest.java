package com.etc.systax;

import java.awt.Color;

public class SwitchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int colorNum=0;
		//cloop:System.out.println("开始执行...");
		
		cloop: switch (colorNum) {
		    case 0: 
		    	System.out.println("0");
		    break cloop; 
		    case 1: 
		    	System.out.println("1");
		    break; 
		    default: 
		    	System.out.println("default");
		   break; 
		   }

	}

}
