/* Modify your solution to put the program in a loop. Call printBoard each time the user
provides input, and quit the program when a q is input. Also, modify the row/column range, checking so that after the error message, instead of quitting the program, just loops to let the user continue building the board.*/
package Ch11Labs;
import java.util.*;
public class tttLoop {

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
		
		// initializes the game loop
	while (true)
	{
		// initializes the x, o, or quit loop
		while(true)
		{
			System.out.println("Are you X or O? ('q' to quit):");
			xoro = scanner.next().charAt(0);
				
			if (xoro == 'x' || xoro == 'X' || xoro == 'o' || xoro == 'O' || xoro == 'q' || xoro == 'Q')
			{
				break;
			}
			else
			{
					System.out.println("Invalid entry \u0007");
					continue;
			}
			
			}
			if (xoro == 'q' || xoro == 'Q')
			{
				break;
			}

			// loops the column and row entry if the space is already taken
			while (true)
			{
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
			if (ttt[rowInput - 1][columnInput -  1] != '*') {
				System.out.println("That space is already taken, try again!");
				continue;
			}
			else
			{
				break;
			}
			}
			ttt[rowInput - 1][columnInput -  1] = xoro;
			
			tttMethod(ttt);
	}
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
