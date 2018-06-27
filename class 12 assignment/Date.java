import java.util.Scanner;
import java.util.*;

class Date{
	public static void main (String args[]){
		
	
	
Scanner s=new Scanner(System.in);
System.out.print("Enter the date = ");
String date=s.nextLine();
	 

	 
	HashMap<Integer,String> dd=new HashMap<Integer,String>();
	dd.put(01,"One");
	dd.put(02,"Two");
	dd.put(03,"Three");
	dd.put(04,"Four");
    dd.put(05,"Five");	
    dd.put(06,"Six");	
	dd.put(07,"Seven");
	dd.put(8,"Eight");
	dd.put(9,"Nine");
	dd.put(10,"Ten");
	dd.put(11,"Eleven");
	dd.put(12,"Twelve");
	dd.put(13,"Thirteen");
	dd.put(14,"Fourteen");
	dd.put(15,"Fifteen");
	dd.put(16,"Sixteen");
	dd.put(17,"Seventeen");
	dd.put(18,"Eighteen");
	dd.put(19,"Nineteen");
	dd.put(20,"Twenty");
	dd.put(21,"Twenty One");
	dd.put(22,"Twenty Two");
	dd.put(23,"Twenty Three");
	dd.put(24,"Twenty Four");
	dd.put(25,"Twenty Five");
	dd.put(26,"Twenty Six");
	dd.put(27,"Twenty Seven");
	dd.put(28,"Twenty Eight");
	dd.put(29,"Twenty Nine");
	dd.put(30,"Thirty");
	dd.put(31,"Thirty one");
	
	
	HashMap<Integer,String> mm=new HashMap<Integer,String>();
	mm.put(01,"January");
    mm.put(02,"February");
	mm.put(03,"March");
	mm.put(04,"April");
	mm.put(05,"May");
    mm.put(06,"June");
    mm.put(07,"July");	
	mm.put(8,"August");
    mm.put(9,"September");	
	mm.put(10,"October");
	mm.put(11,"November");
	mm.put(12,"December");
	
	HashMap<Integer,String> yyyy=new HashMap<Integer,String>();
	yyyy.put(2000,"Two Thousand");
	yyyy.put(2001,"Two Thousand One");
	yyyy.put(2002,"Two Thousand Two");
	yyyy.put(2004,"Two Thousand Four");
	yyyy.put(2005,"Two Thousand Five");
	yyyy.put(2006,"Two Thousand Six");
	yyyy.put(2007,"Two Thousand Seven");
	yyyy.put(2008,"Two Thousand Eight");
	yyyy.put(2009,"Two Thousand Nine");
	yyyy.put(2010,"Two Thousand Ten");
	yyyy.put(2011,"Two Thousand Eleven");
	yyyy.put(2012,"Two Thousand Twelve");
	yyyy.put(2013,"Two Thousand Thirteen");
	yyyy.put(2014,"Two Thousand Fourteen");
	yyyy.put(2015,"Two Thousand Fifteen");
	yyyy.put(2016,"Two Thousand Sixteen");
	yyyy.put(2017,"Two Thousand Seventeen");
	yyyy.put(2018,"Two Thousand Eighteen");
	yyyy.put(2019,"Two Thousand Nineteen");
	
	int str= Integer.parseInt(date.substring(0,2));
	int str1= Integer.parseInt(date.substring(2,4));
	int str2= Integer.parseInt(date.substring(4,8));
	System.out.println(str);
	System.out.println(str1);
	System.out.println(str2);
  
System.out.println("The date you entered = " + (dd.get(str) + "/" + mm.get(str1) + "/" + yyyy.get(str2)));
	}
	}
	


  