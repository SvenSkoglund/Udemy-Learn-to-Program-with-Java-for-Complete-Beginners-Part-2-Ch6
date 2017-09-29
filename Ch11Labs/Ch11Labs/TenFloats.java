/* Write a program that declares an array of ten floating-point numbers. Use a loop to read in the values of the array. After all the elements have been read, print them all on one line */

package Ch11Labs;
import java.util.*;

public class TenFloats {
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		float ten[] = new float [10];
		int i;
		
		for ( i = 0 ; i < ten.length ; i++)
		{
			System.out.print("Please enter number " + (i+1) +": ");
			ten[i] = scanner.nextInt();
			System.out.println();
		}
		scanner.close();
		
		for ( i = 0 ; i < ten.length ; i++)
		{
			System.out.print(ten[i]+ " ");
		}
		System.out.println();

	
	}

}
