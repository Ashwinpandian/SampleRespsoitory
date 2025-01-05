package org.basic;

public class Triangle {


	private static void rightTriangle() {
		int row=5;
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=row-i;j++) {
		     System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
	    }
}
	private static void leftTriangle() {
		int row=5;	
		for (int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");			
		    }
			System.out.println();
	    }
			
}
	private static void leftRevTriangle() {
		int row=5;	
		for (int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");			
		    }
			System.out.println();
	    }
			
}

    private static void reverseRightTriangle() {
    	
    	int rows=5;
//    	for(int i=row; i>=1;i) {
//    		
//    		
//    		for(int j=1;j<=row-i;j++) {
//    			System.out.print(" ");
//    		}
//    		for(int j=1;j<=i;j++) {
//    			System.out.print("*");
//    		}
// 
//    		System.out.println();
//    	}
//    	
    	  for (int i = rows; i >= 1; i--) {
             
              for (int j = 1; j <= rows - i; j++) {
                  System.out.print(" "); // print spaces
              }
              
              for (int j = 1; j <= i; j++) {
                  System.out.print("*"); // print stars
              }
              
              System.out.println();
          }
		
    }
	public static void main(String[] args) {
        System.out.println("right Triangle");
         rightTriangle();System.out.println("reverse right traiangles");
 		reverseRightTriangle();
         System.out.println("Left Triangle");
        leftTriangle();
		

	}

}








