import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cột: ");
        int m = sc.nextInt();
        System.out.print("Nhập số hàng: ");
        int n = sc.nextInt();
        int[][] matrixs = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhập giá trị matrixs[%d][%d]: ", i, j);
                matrixs[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matrixs.length; i++) {
            for (int j = 0; j < matrixs[i].length; j++) {
                System.out.printf("%-4d", matrixs[i][j]);
            }
            System.out.println();
        }
        System.out.println("Nhập cột muốn tính tổng: ");
        int col = sc.nextInt();
        int total = 0;
        for (int i = 0; i < matrixs.length; i++) {
            total+= matrixs[i][col];
        }
        System.out.printf("Tổng của cột %d là: %d",col,total);
    }
}

