package com.mandark;

import java.util.Scanner;

public class Question5 {
	public static boolean checkPerfectNUmber(int n) {
		int sum = 1;
	    // Find all divisors and add them
	    for (int i=2;i*i<=n;i++){
	        if(n%i==0){
	            if(i*i!=n){
	                sum=sum+i+n/i;
	            }else{
	                sum = sum + i;
	            }
	        }
	    }
	    if(sum==n&&n!= 1)
	        return true;
	 
	    return false;

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number =sc.nextInt();
		
		System.out.println(checkPerfectNUmber(number));
	}
}
