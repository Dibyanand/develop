package org.capg.lambda;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda implements FileFilter {

	@Override
	public boolean accept(File file) {
		return file.getName().endsWith(".java");
	}
	
	
    public static void main(String[] args) {
    	
    	System.out.println("==========using Java 7 syntax:================================");
    	FirstLambda firstLambda=new FirstLambda();
    	File dir=new File("E:/java8workspace/Java8app/src/org/capg/lambda");
    	File[] javaFiles=dir.listFiles(firstLambda);
    	for(File file:javaFiles){
    		System.out.println(file);
    	}
    			
    	System.out.println("=========Let's use an anonymous class========================= ");
    			
        FileFilter fileFilter=new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				return file.getName().endsWith(".java");
			}
		};	
		File fileDirectory=new File("E:/java8workspace/Java8app/src/org/capg/lambda");
    	File[] files=dir.listFiles(fileFilter);
    	for(File file:files){
    		System.out.println(file);
    	}
    	
    	System.out.println("========Using Java 8 Lambda Expression====================");
    	
    	//FileFilter fileFilter2=(File file)->file.getName().endsWith(".java");
    	FileFilter fileFilter2=(file)->file.getName().endsWith(".java");
    	
    	File fileDirectory2=new File("E:/java8workspace/Java8app/src/org/capg/lambda");
    	File[] files2=dir.listFiles(fileFilter2);
    	
    	for(File file:files2){
    		System.out.println(file);
    	}

     	
	}
}
