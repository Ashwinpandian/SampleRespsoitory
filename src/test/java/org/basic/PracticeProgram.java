package org.basic;

public class PracticeProgram {
	
 public static void main(String[] args) {
	
    //left triangle
	for(int i=1;i<=5;i++) {
	  for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
	  System.out.println();
	}
     
	//right triangle
	int a=5;
	for(int i=1;i<=a;i++) {
		for(int j=1;j<=a-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		 System.out.println();
	}
	 
	//ReverseRightTriangle
     int a=5;
     for(int i=5;i>=1;i--) {
    	 
    	for(int j=1;j<=a-i;j++) {
    		 System.out.print(" ");
    	 }
    	for (int j=1;j<=i;j++) {
    		System.out.print("*");
    	}
    	System.out.println();
     }
	
	 //ReverseLeftTriangle
	 
	 
	 for(int i=5;i>=1;i--) {
		 for(int j=1;j<=i;j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
 }
   
 
}
