package com.mandarkq3;

import java.io.*;
import java.util.*;

public class Question3 {
	public static String[] l1_sort(String[] str,int[] num,String[] chararr) {
		for(int i=0;i<str.length-1;i++) {
			for(int j=0;j<str.length-1-i;j++) {
				int order=str[j].compareTo(str[j+1]);
				if(order>0) {
					String temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
					
					String temp1=chararr[j];
					chararr[j]=chararr[j+1];
					chararr[j+1]=temp1;
				}
		
			}
		}
		return chararr;
	}
	
	public static void main(String[] args) {
		try {
	            
	            FileInputStream fis = new FileInputStream(args[0]);
	            Scanner sc = new Scanner(fis); // file to be scanned
	            while (sc.hasNextLine()) {
	            	String inputCommand = sc.nextLine();
//	            	System.out.println(inputCommand);
	            	String[] input=inputCommand.trim().split(",");
	            	
	            	String[] chararr=new String[input.length];
	            	int[] number=new int[input.length];
	            	
	            	for(int i=0;i<input.length;i++) {
	            		String[] str=input[i].split("");
	            		chararr[i]=str[0];
	            		String res="";
	            		for(int j=1;j<str.length;j++) {
	            			res+=str[j];
	            		}
	            		int num=Integer.parseInt(res);
	            		number[i]=num;
	            	}
	            	
	            	
//	            	System.out.println(Arrays.toString(input));
//	            	System.out.println(Arrays.toString(chararr));
//	            	System.out.println(Arrays.toString(number));
	            	
	            	HashMap<String , Integer> map=new HashMap<>();
	            	for(int i=0;i<chararr.length;i++) {
	            		map.put(chararr[i], number[i]);
	            	}
	            	
	            	// l1 Sort 
	            	String[] l1=l1_sort(chararr,number,input);
	            	System.out.println("L1 "+Arrays.toString(l1));
	            	
	            	
	     
	            }
	            sc.close(); // closes the scanner
	        } catch (IOException e) {
	        	System.err.println(e.getMessage());
	        }
	}
}
