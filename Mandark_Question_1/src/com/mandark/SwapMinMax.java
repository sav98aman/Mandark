package com.mandark;

import java.io.*;
import java.util.*;


public class SwapMinMax {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] strArr1 = bf.readLine().trim().split(",");
		String[] strArr2 = bf.readLine().trim().split(",");
		
		int[] intArr1 = Arrays.stream(strArr1).mapToInt(Integer::parseInt).toArray();
		int[] intArr2= Arrays.stream(strArr2).mapToInt(Integer::parseInt).toArray();
		
		// new array for after swaping 
		int[] a_arr=new int[intArr1.length];
		int[] b_arr=new int[intArr2.length];
		
		
		// swap start from 1<i<n
		a_arr[0]=intArr1[0];
		b_arr[0]=intArr2[0];
		
		for(int i=1;i<intArr1.length;i++) {
			int maxV=Math.max(intArr1[i],intArr2[i]);
			int minV=Math.min(intArr1[i],intArr2[i]);
			
			a_arr[i]=maxV;
			b_arr[i]=minV;
			
		}
		
//		find  max value after swap
		int maxa=Integer.MIN_VALUE;
		int maxb=Integer.MIN_VALUE;

		for(int i=0;i<a_arr.length;i++) {
			if(maxa<a_arr[i]) {
				maxa=a_arr[i];
			}
			if(maxb<b_arr[i]) {
				maxb=b_arr[i];
			}
		}
		
		// results print 
		int res=maxa*maxb;
		System.out.println(res);
	}

}
