package org.basic;

import java.util.Arrays;

public class Inteeview {

	//a={1,2,3,4,5};a={3,4,5,1,2]
	public static void reverse(int i,int j) {
		int [] a= {1,2,3,4,5};
		for (int k=i ; k < j;k++) {
			int temp=a[k];
	    	   a[k]=a[j];
	    	   a[j]=temp;
	    	   j--;
	    	   
		}
//       while( i<j) {
//    	   int temp=a[i];
//    	   a[i]=a[j];
//    	   a[j]=temp;
//    	   i++;
//    	   j--  
//       }
	System.out.println(Arrays.toString(a));
       
		
	}
	public static void main(String[] args) {
		
		reverse(0, 4);
		
	}
	
		
	}



