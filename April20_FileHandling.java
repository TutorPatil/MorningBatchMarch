package com.corejava.strings;

import java.io.File;
import java.io.IOException;

public class April20_FileHandling {

	public static void main(String[] args) throws IOException {
	
		
		File f = new File("D:\\morningBatch");
		
		f.mkdir();
//		
//		System.out.println(f.getAbsolutePath());
//		
//		System.out.println(f.exists());
//		
//		System.out.println(f.getParent());
//		
//		System.out.println(f.isDirectory());
//		
//		
//		System.out.println(f.getName());
//		
//		System.out.println(f.isHidden());
//		
//		//f.delete();
//		
//		System.out.println(f.exists());
//		
//		
		File f1 = new File("D:\\morningBatch\\test.txt");		
		f1.createNewFile();
		
		System.out.println(f.getParent());
		
		

	}

}
