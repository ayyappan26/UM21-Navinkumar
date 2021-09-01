package com.ultramain.textFilePrgm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class AccessingFile{
	public void readFilePrgm(){
		File myfile= new File("D:\\Focus webinar notes\\hai.txt");
		BufferedReader br=null;
		//String str;
		try{
		br=new BufferedReader(new FileReader(myfile));
		String str;
		while(( str = br.readLine()) != null){
			System.out.println(str);
		}
		}catch(FileNotFoundException f){
			System.out.println("File not found");
		}catch(IOException ie){
			System.out.println("Io Exception");
			
		}
	}
}
public class ReadFile{
	public static void main(String arg[]){
		AccessingFile myacc=new AccessingFile();
		myacc.readFilePrgm();
		
	}
}