/* Write a program that uses a 2-D char array to represent a tic-tac-toe board. Initialize the first and last rows with X's and the middle row with O's: Use a nested loop to print the board.*/

package Ch11Labs;

public class ttt {

	public static void main(String[] args) 
	{

		char ttt [][] =
		{
			{'X','X','X'},
			{'O','O','O'},
			{'X','X','X'}
		};
		int r;
		int c;
		for ( r = 0 ; r < 3 ; r++) 
		{
			for ( c = 0 ; c < 3 ; c++)
			{
			System.out.print(ttt[r][c]);
			}
		System.out.println();		
		}

	}
}
