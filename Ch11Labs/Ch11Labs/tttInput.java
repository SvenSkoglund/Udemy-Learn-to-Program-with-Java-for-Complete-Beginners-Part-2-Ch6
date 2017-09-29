/* Modify your solution. Initialize the array to all asterisks when it is declared. Prompt for an X or an O, as well as the row (1 to 3) and the column (1 to 3) of a square. Assign the X or O to the correct element and print the board. */
package Ch11Labs;
import java.util.*;
public class tttInput {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int rowInput = 0;
		int columnInput = 0;
		char xoro;
		char ttt [][] =
		{
			{'*','*','*'},
			{'*','*','*'},
			{'*','*','*'}
		};

		System.out.println("Are you X or O? :");
		xoro = scanner.next().charAt(0);
		
		System.out.println("Please enter the row number (1 - 3): ");
		rowInput = scanner.nextInt() - 1;
		System.out.println("Please enter the column number (1 - 3): ");
		columnInput = scanner.nextInt() - 1;
		
		ttt[rowInput][columnInput] = xoro;
		
		tttMethod(ttt);

	}
	public static void tttMethod(char tmethod [] []) 
	{
		int r;
		int c;
		for ( r = 0 ; r < 3 ; r++) 
		{
			for ( c = 0 ; c < 3 ; c++)
			{
			System.out.print(tmethod[r][c]);
			}
		System.out.println();		
		}		
	}
	}
