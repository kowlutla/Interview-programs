package Arrays;

import java.util.Scanner;

public class RotateMatrix1 {

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

		rotate90AntiClockWise(matrix,n);
		
		
		System.out.println("Rotaing 90degrees anti-clock wise matrix: ");
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

	//rotating matrix in anti-clockwise in place 
	private static void rotate90AntiClockWise(int[][] matrix, int n) {
		
		for(int i=0;i<n/2;i++)
		{
			for(int j=i;j<n-i-1;j++)
			{
				int temp=matrix[i][j];//store current cell
				matrix[i][j]=matrix[j][n-i-1];//move right to top
				matrix[j][n-i-1]=matrix[n-1-i][n-j-1];//bottom to right
				matrix[n-i-1][n-j-1]=matrix[n-j-1][i];//left to bottom
				matrix[n-1-j][i]=temp;//assign temp to left
			}
		}
		
		
		
	}

}
