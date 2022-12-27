import java.util.Scanner;

public class Q3 {
	public static void main(String[]args) {
		
		// Q3 : print Half pyramid
		/*
		    *
		    **
		    ***
		    ****
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give number of rows:");
		int rows = sc.nextInt();
		
		for(int i=1;i<=rows;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// same thing in reverse  inverted pyramid
		/*
	            ****
		    ***
		    **
		    *
		*/
		
		System.out.println("\nInnverted pyramid:/n");
		
		for(int i=rows;i>=1;i--) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		// pyramid for numbers:
		/*
		   1
		   12
		   123
		   1234
		*/
		
		System.out.println("\nPyramid for numbers:\n");
		for(int i=1;i<=rows;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		// invertedd pyramid of numbers;
		/*
		  1234
		  123
		  12
		  1
		*/
	System.out.println("\nInnverted pyramid for numbers:/n");
		
		for(int i=rows;i>=1;i--) {
			for(int j=1; j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
