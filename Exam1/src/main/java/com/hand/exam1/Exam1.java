package com.hand.exam1;

import java.util.Vector;

public class Exam1 {
	
	static boolean isPrimer(int n){
		for(int i =2;i<=Math.sqrt((double)n);i++){
			if(n%i == 0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
		int start = 101,end = 200;
		Vector<Integer> primers = new Vector<Integer>();
		for(int i =start;i<=end;i++){
			if(isPrimer(i)){
				primers.add(i);
			}
		}
		int count = primers.size();
		System.out.print("101-200 间总共有"+count+"个素数,分别是:");
		for(int i=0;i<count;i++){
			if(i<count-1){
				System.out.print(primers.get(i)+",");
			}else {
				System.out.print(primers.get(i));
			}
		}
	
	}
}
