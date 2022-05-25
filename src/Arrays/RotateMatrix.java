/**
	Given an square matrix, turn it by 90 degrees in anti-clockwise direction 
	
	Input
	 1  2  3
	 4  5  6
	 7  8  9
	
	Output:
	 3  6  9 
	 2  5  8 
	 1  4  7 
	
	Input:
	 1  2  3  4 
	 5  6  7  8 
	 9 10 11 12 
	13 14 15 16 
	
	Output:
	 4  8 12 16 
	 3  7 11 15 
	 2  6 10 14 
	 1  5  9 13
	 
 */
package Arrays;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class RotateMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of square matrix: ");
		int n=sc.nextInt();
		int matrix[][]=new int[n][n];
		System.out.println("Enter "+(n*n)+" elements: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("Original matrix: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}

		matrix=rotate90AntiClockWise(matrix,n);
		
		System.out.println("After rotating above matrix 90 degrees anto-clockwise : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		matrix=rotate90ClockWise(matrix,n);
		System.out.println("After rotating above matrix 90 degrees clockwise : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		matrix=rotate180(matrix,n);
		System.out.println("After rotating above matrix 180 degrees clockwise : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		matrix=rotate180(matrix,n);
		System.out.println("After rotating above matrix 180 degrees anti-clockwise : ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		matrix=rotate270ClockWise(matrix,n);
		System.out.println("After rotating above matrix 270 degrees clockwise direction: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		matrix=rotate270AntiClockWise(matrix,n);
		System.out.println("After rotating above matrix 270 degrees anti-clockwise direction: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		sc.close();

	}



	//rotating matrix by 90degrees anti clockwise
	public static int[][] rotate90AntiClockWise(int[][] matrix,int n)
	{
		int temp[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				temp[n-j-1][i]=matrix[i][j];
			}
		}
		return temp;
		
	}
	
	//rotating matrix by 90 degrees in clock wise direction
	public static int[][]rotate90ClockWise(int matrix[][],int n)
	{
		int temp[][]=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				temp[j][n-i-1]=matrix[i][j];
			}
		}
		
		
		return temp;
	}
	
	
	//it rotate clock-wise and anti clock-wise 180 degrees
	private static int[][] rotate180(int[][] matrix, int n) {
		
		int temp[][]=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				temp[n-i-1][n-j-1]=matrix[i][j];
			}
		}
		return temp;
	}

	//rotating matrix by 270 degrees clock wise direction
	private static int[][] rotate270ClockWise(int[][] matrix, int n) {
		
		int temp[][]=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				temp[n-j-1][i]=matrix[i][j];
			}
		}
	
		return temp;
	}
	
	
	
	//rotating matrix by 270 degrees anti clockwise direction
	public static int[][]rotate270AntiClockWise(int matrix[][],int n)
	{
		int temp[][]=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				temp[j][n-i-1]=matrix[i][j];
			}
		}
		
		return temp;
		
	}
	
	

}
