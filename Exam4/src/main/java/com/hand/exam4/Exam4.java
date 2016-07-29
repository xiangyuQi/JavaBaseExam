package com.hand.exam4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.omg.CORBA.portable.ValueBase;

public class Exam4 {
	
	
	public static void main(String[] args) {
		int num = 50;
		int max = 100;
		List<Integer> lists = new ArrayList<Integer>();
		Random random= new Random(System.currentTimeMillis());
		for(int i =0;i<num;i++){
			lists.add(random.nextInt(max));
		}
		System.out.print("随机生成 "+num+"个小于 "+max+"的数,分别为:");
		for(int i =0;i<num;i++){
			if(i<num-1){
				System.out.print(lists.get(i)+",");
			}else 
				System.out.print(lists.get(i)+"\n");
		}
		
		Map<Integer,List<Integer>> maps = new HashMap<Integer,List<Integer>>();
		
		for(int i =0;i<num;i++){
			int cur  = lists.get(i);
			maps.put(cur/10, new ArrayList<Integer>());
		}
		for(int i =0;i<num;i++){
			int cur  = lists.get(i);
			maps.get(cur/10).add(cur);
		}
		System.out.print("Map 中的数据为:{");
		Set<Integer> keys = maps.keySet();
		for(Iterator<Integer> it = keys.iterator();it.hasNext();){
			Integer c = it.next();
			System.out.print(c+"=>[");
			List<Integer> values = maps.get(c);
			for(int i = 0;i<values.size();i++){
				if(i<values.size()-1)
					System.out.print(values.get(i)+",");
				else System.out.print(values.get(i));
			}
			if(it.hasNext())
				System.out.print("],");
			else System.out.println("]}");
		}
		System.out.print("排序后的 Map 为");
		for(Iterator<Integer> it = keys.iterator();it.hasNext();){
			Integer c = it.next();
			
			List<Integer> values = maps.get(c);
			bubble_sort(values);
		}
		for(Iterator<Integer> it = keys.iterator();it.hasNext();){
			Integer c = it.next();
			System.out.print(c+"=>[");
			List<Integer> values = maps.get(c);
			for(int i = 0;i<values.size();i++){
				if(i<values.size()-1)
					System.out.print(values.get(i)+",");
				else System.out.print(values.get(i));
			}
			if(it.hasNext())
				System.out.print("],");
			else System.out.println("]}");
		}
	}
	static void bubble_sort(List<Integer> lists)
	{
	    int i, j, temp;
	    int n = lists.size();
	    for (j = 0; j < n - 1; j++)
	        for (i = 0; i < n - 1 - j; i++)
	        {
	            if(lists.get(i) > lists.get(i+1) )
	            {
	                temp = lists.get(i) ;
	                lists.set(i, lists.get(i+1)); 
	                lists.set(i+1, temp);
	            }
	        }
	} 

}
