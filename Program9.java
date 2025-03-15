import java.util.Scanner;

public class Program9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix1 =new int[3][3];
        System.out.println("enter the element of first matrix:");
        for (int i=0; i<3;i++){
            for(int j=0;j<3;j++){

                matrix1[i][j]=scanner.nextInt();
            }
        }
        System.out.println("enter the element of second matrix:");

        int[][] matrix2 =new int[3][3];
        for (int i=0; i<3;i++){
            for(int j=0;j<3;j++){
                matrix2[i][j]=scanner.nextInt();
            }
        }

        int[][] result = new int[3][3];

        // Matrix multiplication
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display result
        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}