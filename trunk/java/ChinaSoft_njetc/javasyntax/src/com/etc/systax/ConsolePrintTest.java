package com.etc.systax;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.ParseException;

public class ConsolePrintTest {
  public static void main(String[] args) {
    System.out.println("Enter a number.");
    double numberFromConsole; 
    try {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      while(true){
    	  System.out.println("console print:"+s);
          DecimalFormat df = new DecimalFormat();
          Number n = df.parse(s);
          numberFromConsole = n.doubleValue();	  
      }

    } catch (IOException e) {
      numberFromConsole = 0;
    } catch (ParseException e) {
      numberFromConsole = 0;
    }
    System.out.println(numberFromConsole );
  }
}