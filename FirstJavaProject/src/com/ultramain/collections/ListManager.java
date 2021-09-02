package com.ultramain.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ListExample{
	public void getArrayList(){
		
		String[] sarr={"hhh","rrr","iiii","aaaa","eee"};
		List<String> stringList=Arrays.asList(sarr);
		Collections.sort(stringList);
		for(String e: stringList){
			System.out.println(e);
		}

		}
	public void getCollections(){
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Blue");
		list1.add("White");
		list1.add("yellow");
		list1.add("black");
		System.out.println("List 1  :"+list1);
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("Blue");
		list2.add("yellow");
		list2.add("violet");
		list2.add("green");
		list2.add("black");
		System.out.println("List 2  :"+list2);
		list1.retainAll(list2);
		Collections.sort(list1);
		System.out.println("Common Element :"+list1);
	}
}
public class ListManager{
	public static void main(String arg[]){
		ListExample listEg=new ListExample();
		listEg.getArrayList();
		System.out.println("-----------------------");
		listEg.getCollections();
	}
}
