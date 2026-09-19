import java.util.Scanner;

public class WavePrintMatrix{
   public static void main(String[] args) {
    
     int m = 3;
     int n = 3;
    int [][] mat = new int[m][n];
      Scanner sc = new Scanner(System.in);
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            System.out.println("enter your number :");
            mat[i][j] = sc.nextInt();
        }
    }

    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            System.out.print(mat[j][i]);
        }
        i++;
        for(int j = m-1; i < n &&  j >=0; j--){
            System.out.print(mat[j][i]);
        }
    }

   }
}