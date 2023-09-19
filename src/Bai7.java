import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cột và hàng của ma trận vuông: ");
        int m = sc.nextInt();
        int[][] matrixs = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Nhập giá trị matrixs[%d][%d]: ", i, j);
                matrixs[i][j] = sc.nextInt();
            }
        }
        int total = 0;
        for (int i = 0; i < matrixs.length; i++) {
            for (int j = 0; j < matrixs[i].length; j++) {
                System.out.printf("%-4d", matrixs[i][j]);
            }
            total += matrixs[i][i];
            System.out.println();
        }
        System.out.println("Tổng của đường chéo là: " + total);
    }
}
