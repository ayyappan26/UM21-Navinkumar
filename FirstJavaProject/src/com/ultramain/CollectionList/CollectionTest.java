package com.ultramain.CollectionList;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class ListExample{
	public void listTest(){
		int myarr[]=new int[10];
		for(int i=0;i<10;i++){
			myarr[i]=new Random().nextInt(50);
		}
		for(int res : myarr){
			System.out.println(res);
		}
		ArrayList<Integer> numList=new ArrayList<Integer>();
		numList= (ArrayList) Arrays.asList(myarr);
		
		
	}
}
public class CollectionTest{
	public static void main(String arg[]){
		ListExample mylist=new ListExample();
		mylist.listTest();
	}
}