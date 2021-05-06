import java.util.Scanner;

public class Four {
	
	public static int[][] input(int rows,int columns){
		Scanner sc = new Scanner(System.in);
		int [][] matrix = new int[rows][columns];
		for(int i=0;i < rows; i++) {
			for(int j =0; j < columns; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}
	
	public static int[][] add(int[][] matrix1,int[][] matrix2,int rows,int columns){
		
		for(int i =0; i < rows;i++) {
			for(int j = 0; j< columns; j++) {
				matrix1[i][j]+=matrix2[i][j];
			}
		}
		return matrix1;
	}
	
	public static void print_matrix(int[][] matrix,int rows,int columns) {
		for(int i =0; i < rows; i++) {
			for(int j =0; j < columns; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		System.out.println("Please enter the rows and columns in the matrix");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		System.out.println("Please enter first matrix");
		int[][] matrix1 = input(rows,columns);
		System.out.println("Please enter second matrix");
		int [][] matrix2 = input(rows,columns);
		int [][] result = add(matrix1,matrix2,rows,columns);
		print_matrix(result,rows,columns);

	}

}
