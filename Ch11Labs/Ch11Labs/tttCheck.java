/* Modify your solution to make sure both the row and column entered are within proper
range. If either is out of range, then print an error message and terminate the program.*/
package Ch11Labs;
import java.util.*;
public class tttCheck {

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
		
		while(true)
		{
			System.out.println("Are you X or O? :");
			xoro = scanner.next().charAt(0);
			
			if (xoro == 'x' || xoro == 'X' || xoro == 'o' || xoro == 'O')
			{
				break;
			}
			else
			{
				System.out.println("Invalid entry \u0007");
				continue;
			}
		}
		
		// Prompts user for the row number, continues until 1 - 3 is entered
		while (true)
		{	
			System.out.println("Please enter the row number (1 - 3): ");
			rowInput = scanner.nextInt() ;
			if (rowInput == 1 || rowInput == 2 || rowInput ==3)
			{
				break;
			}
			else
			{
				System.out.println("Invalid Entry \u0007");
				continue;
			}
		}
		
		
		// Prompts user for the column number, continues until 1 - 3 is entered
		while (true)
		{	
			System.out.println("Please enter the column number (1 - 3): ");
			columnInput = scanner.nextInt() ;
			if (columnInput == 1 || columnInput == 2 || columnInput ==3)
		{
			break;
		}
			else
			{
				System.out.println("Invalid Entry \u0007");
				continue;
			}
		}
		ttt[rowInput - 1][columnInput -  1] = xoro;
		
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
