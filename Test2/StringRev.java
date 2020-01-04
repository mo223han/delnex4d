package com.test;

import java.util.Scanner;

public class StringRev {

	String rev(String input){
		int m=0;
		char [] rev = input.toCharArray();
		for(int i=input.length()-1;i>=0;i--){
			int c = (int)input.charAt(m);
			int c1 = (int)input.charAt(i);
			
			if(c>=65&&c<=90){
				
				if(c1>=65&&c1<90){
					
					rev[m] = input.charAt(i);
					m++;
				}
				
				else{
					rev[m] =(char) ((int) input.charAt(i));
					m++;
				}
			}
			if(c>=97&&c<=122){
				
				if(c1>=97&&c1<=122){
					
					rev[m] = input.charAt(i);
					m++;
				}
				
				else{
					rev[m] =(char) ((int) input.charAt(i));
					m++;
				}
			}
			
			
		}
		input = String.copyValueOf(rev);
		
		return input;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the string");
		String input = sc.nextLine();
		StringRev sr = new StringRev();
		
		String [] arr = input.split(" ");
		
		for(int i=0;i<arr.length;i++){
			
			System.out.print(sr.rev(arr[i])+" ");
		}
		
		
	}
}
