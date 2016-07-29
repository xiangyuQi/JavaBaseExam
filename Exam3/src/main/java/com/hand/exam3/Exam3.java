package com.hand.exam3;

import java.util.Scanner;

public class Exam3 {
	
	//判断是否为闰年
	static boolean isP(int year){
		if((year %100 !=0 && year% 4== 0) || year % 400 == 0){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		//第一位占位，方便下标与月份对应
		int [] months ={-1,31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.print("请输入日期:");
		Scanner scanner = new Scanner(System.in);
		String date =  scanner.nextLine();
		//获取年月日
		int year = Integer.parseInt(date.substring(0, 4));
		int mon = Integer.parseInt(date.substring(5, 7));
		int day = Integer.parseInt(date.substring(8, 10));
		
		//计算该月的第几天
		int nday = day;
		//闰年2月则加一天
		if(isP(year)){
			months[2] = 29;
		}
		//加上本月之前的月份
		for(int i =1;i<mon;i++){
			nday += months[i];
		}
		System.out.println("你输入的日期为当年的第 " +nday+"天");
	}
}
