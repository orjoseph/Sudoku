import java.util.*;
public class sudoku {
	//methods is supposed to print the sudoku board
	//with 27 numbers appearing in random areas and 
	//the numbers are random ranging from 1-9
	public void printboard(int [][]array)
	{
		Random r=new Random();
		int a,b,cycle=0;
		for(a=0;a<9;a++)
		{
			for(b=0;b<9;b++)
			{
				//array[a][b]=r.nextInt(9);
				if(cycle<27)
				{
					System.out.print(array[r.nextInt(9)][r.nextInt(9)]=r.nextInt(9));
					System.out.print(" ");
				}
				else
				{
					System.out.print(array[a][b]=0);
					System.out.print(" ");
				}
				cycle++;
			}
				System.out.println("\n");
		}
	
	}

	public static void main(String []args)
		{
			System.out.println("The beginning");
			sudoku s=new sudoku();
			int [][] test= new int[9][9];
			s.printboard(test);
		}
}
