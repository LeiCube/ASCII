import java.util.Scanner;

public class LoopExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
        1 
        4 4 
        9 9 9 
        16 16 16 16 
        25 25 25 25 25 
    */
		
//		for(int i = 1 ; i <= 5; i++) {
//			for(int j = 1; j <= i; j++) {
//				System.out.print((i*i)+ " ");
//			}
//			System.out.println();
//		}
		
		
		/*
        1 3 5 7 9 
        1 3 5 7 
        1 3 5 
        1 3 
        1
    */
		
//		for(int i = 10; i >= 1; i--) {
//			if (i % 2 != 0) {
//				for(int j = 1; j <= i; j++) {
//					if(j % 2 != 0) {
//					System.out.print(j + " ");
//					}
//				}	
//				System.out.println();
//			}			
//		}
		
	       /*
        Ask for input n and will display the pattern below:
           1 * 3 * 5 
            * 3 * 5 
             3 * 5 
              * 5 
               5 
    */
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
//		for (int i = 1; i<= num; i++) {
//			for(int k = 1; k <= i; k++) {
//				System.out.print(" ");
//			}
//			for(int j = i; j <= 5; j++) {
//				if(j % 2 != 0) {
//					System.out.print(j+  " ");
//				}
//				else {
//					System.out.print("* ");
//				}
//			}
//			System.out.println();
//		}
//		
        /*
        Ask for input n and will display the pattern below:
        1 
        1 4 
        1 2 6 
        1 2 3 8 
        1 2 3 4 10 
        1 2 3 8 
        1 2 6 
        1 4 
        1 
    */
		
//		for(int i = 1; i <= num; i++) {
//			for(int j = 1; j <=i; j++) {
//				if (j > 1 && j == i) {
//					System.out.print(i * 2 + " ");
//				}
//				else {
//					System.out.print(j + " ");
//				}
//			}	
//			System.out.println();
//		}
//		for(int i = num-1; i >= 1; i--) {
//			for(int j = 1; j <=i; j++) {
//				if (j > 1 && j == i) {
//					System.out.print(i * 2 + " ");
//				}
//				else {
//					System.out.print(j + " ");
//				}
//			}	
//			System.out.println();
//		}
		
	}
	
}
