/*Modify the solution. After all of the elements have been read and printed, use a loop to find the largest number entered. Print the array index of the number and the number.*/
package Ch11Labs;
import java.util.*;

public class TenFloatsLargest {
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

		
		int j;
		float k = 0;
		float max = 0;
		for (j = 0 ; j < ten.length ; j++)
		{
			if (ten[j] > max)
			{
				max = ten[j];
				k = j;
			}
		}
		System.out.println("Maximum found at position " + (k+1) + " with a value of " + max);
		
		
	}

}
