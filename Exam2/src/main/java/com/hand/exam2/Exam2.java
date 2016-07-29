package com.hand.exam2;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("请输入工资:");
		Double salary = scanner.nextDouble();
		Double tax = 0.0;
		double  sub = salary - 3500;
		if(sub >0){
			if(sub <=1500){
				tax = sub *0.03;
			}else if(sub <=4500){
				tax = sub*0.1;
			}else if(sub <=9000){
				tax = sub * 0.2;
			}else if(sub <=35000){
				tax = sub *0.25;
			}else if(sub <=55000){
				tax = sub*0.3;
			}else if(sub <=80000){
				tax = sub * 0.35;
			}else {
				tax = sub * 0.45;
			}
		}
		System.out.println("所需要缴纳的税费为:"+tax);
	}
}
