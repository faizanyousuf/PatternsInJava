import java.util.Scanner;

public class MatrixRotate {
    public static void main(String[] args) {
         int n = 3;
        int[][] mat = new int[n][n];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("Enter Number: ");
                mat[i][j] = sc.nextInt();
            }
        }
        rotateMatrix(mat);
        printMat(mat);
    }

    static void rotateMatrix(int[][] mat){
        int n = mat.length;
        int[][] result = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = n-1; j >= 0; j--){
                result[i][n-1-j] = mat[j][i];
            }
        }
        printMat(result);
    }

    static void printMat(int[][] mat){
        int n = mat.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}