package com.ultramain.textFilePrgm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

class AccessWrite{
	public void writingFile(){
		File fi=new File("D:\\Focus webinar notes\\hai.txt");
		BufferedWriter bw=null;
		try{
			bw=new BufferedWriter(new FileWriter(fi));
			bw.write("WelcomeToJava");
			bw.close();
		}catch(Exception e){
			System.out.println("Exception raise");
		}
		System.out.println("SUCCESS");
	}
}
public class WriteFile{
	public static void main(String arg[]){
		AccessWrite accw=new AccessWrite();
		accw.writingFile();
	}
}