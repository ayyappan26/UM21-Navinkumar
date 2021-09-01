package com.ultramain.CollectionList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class ListExample{
	public void listTest(){
		Integer myarr[]=new Integer[10];
		for(int i=0;i<10;i++){
			myarr[i]=new Random().nextInt(50);
		}
		for(int res : myarr){
			System.out.println(res);
		}
		
		List<Integer> numList;
		numList=Arrays.asList(myarr);
		Collections.sort(numList);
		System.out.println("After sorting");
		for(int res : numList){
			System.out.println(res);
		}
		
	}
}
public class CollectionTest{
	public static void main(String arg[]){
		ListExample mylist=new ListExample();
		mylist.listTest();
	}
}