/* Modify the solution to use a loop to print all of the elements of the array, showing each element on its own line in the output. */

package Ch11Labs;

public class TenOdds2 {

	public static void main(String[] args) {

		int tenOdds [] = {1,3,5,7,9,11,13,15,17,19};
		int i;
		
		for ( i = 0 ; i < tenOdds.length ; i++ )
		{
		System.out.println(tenOdds[i]);
		}
	}

}
