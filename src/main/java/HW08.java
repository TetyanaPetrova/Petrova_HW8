
import java.util.Scanner;

public class HW08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter matrix size(integer): ");
        int a = in.nextInt();
        int[][] array;
//2(a)
        array = createMatrix(a);
        System.out.println();
        System.out.println("Matrix:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
//2(b)
        ArrayRowSum(array);
        System.out.println();
//2(c)
        DiagonalElements(array);
    }
    public static int[][] createMatrix(int a) {
        Scanner in = new Scanner(System.in);

        int[][] array = new int[a][a];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter the matrix element: ");
                array[i][j] = in.nextInt();
            }
        }
        return array;
    }
    private static void ArrayRowSum(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
            System.out.println("Sum of " + i + " row elements: " + sum);
        }
    }
    private static void DiagonalElements(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int a = 0;
            for (int j = 0; j < array[i].length; j++) {
                a = array[i][i];
            }
            System.out.println("Diagonal elements of Matrix: " + a);
        }

    }

}
