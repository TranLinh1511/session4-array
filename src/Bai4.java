import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số cột: ");
        int m = sc.nextInt();
        System.out.print("Nhập số hàng: ");
        int n = sc.nextInt();
        int [][] matrixs = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhập giá trị matrixs[%d][%d]: ",i,j);
                matrixs[i][j]  = sc.nextInt();
            }
        }
        int max = matrixs[0][0];
        int indexI = -1;
        int indexJ = -1;
        for (int i = 0; i < matrixs.length; i++) {
            for (int j = 0; j < matrixs[i].length; j++) {
                if(matrixs[i][j] > max) {
                    indexI = i;
                    indexJ = j;
                    max = matrixs[i][j];
                }
                System.out.printf("%-4d",matrixs[i][j]);
            }
            System.out.println();
        }
        System.out.printf("Số lớn nhất là: %d vị trí là matrixs[%d][%d]",max,indexI,indexJ);
    }
}
