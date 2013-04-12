import java.util.*;
public class sudoku {
	//methods is supposed to print the sudoku board
	//with 27 numbers appearing in random areas and 
	//the numbers are random ranging from 1-9
	public int[][]  printboard(int [][]array, int x, int y)
	{

		for(int a=0; a<x; a++){
			
			for(int b=0; b<y; b++){
				//Java and all it's beauty...lol!
				array[a][b] = (int)(Math.random()*10);
				System.out.print(array[a][b] + " ");
			}
				System.out.println("\n");
		}
		return array;
	
	}

	public static void main(String []args)
		{
			//used r to represent rows and guess what c represents...lol!
			int r = 3,c = 3;
			System.out.println("== Sudoku ver. 0.1 ==");
			sudoku s=new sudoku();
			int [][] test= new int[r][c];
			
			s.printboard(test, r, c);
		}
}
