import java.util.*;
public class Main 
{

	public static void main(String args[])
	{
		/*
		 * Initializing Grid: This grid array is ryt now a 1D array but we have to find a way to represent
		 * all the possible sudoku solutions. That is, we need to get it in the 2D array. Build it on this
		 * logic.
		 */
		int grid[] = new int[9];
		int i = 0;   //Variable to be used only for the iteration purposes.
		/*
		 * The Loop below generates non repeating nos in random order from 1-9.
		 * The loop should be modified in such a way that we get this in 2 D array form. Also, Brute
		 * Force has been used in the approach to generate random nos. If possible come up with a better method.
		 */
		while(i != 9)
		{
			int flag = 0;
			int key = (int) (9*Math.random() + 1);
			for(int j=0; j<9; j++)
			{
				if(key == grid[j])     
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				grid[i] = key;
				i++;
			}
		}
		/*
		 * Logic used in above loop is that we are checking for pre-existing element in the grid and re
		 * iterating to get another element.
		 */
		
		// Printing out the 1D grid.
		for(i=0; i<9; i++)
		{
			System.out.print(grid[i]+" ");
		}
			
	}
}