import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Array - mảng là khái niệm dùng để lưu trữ danh sách các giá trị cùng kiểu dữ liệu
        // cú pháp: tường minh
        int[] array = {1, 2, 3, 4, 5, 6};
        // cú pháp: sử dụng từ khóa new
        int[] arrayInt = new int[10];
        System.out.println(Arrays.toString(arrayInt));
        // Truy cập phần tử theo vị trí
        System.out.println("Phần tử tại vị trí index = 0 là: " + array[0]);
        array[1] = 20;
        for (int i = 0; i < array.length; i++) {
            // duyệt theo index
            System.out.printf("Phần tử tại vị trí index = %d là: %d \n", i, array[i]);
        }
        // Duyệt theo forEach: duyệt theo giá trị
        for (int value : array) {
            System.out.println(value);
        }
        // bài toán: kiểm tra trong mảng và hiển thị các số chia hết cho 2 và hiển thị vị trí index
        System.out.println("Các số chia hết cho 2 là: ");
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value % 2 == 0) {
                System.out.println(value + " tại vị trí " + i);
            }
        }
        // Mảng 2 chiều là gì?
        // là mảng chứa danh sách các mảng khác
        int[][] array2Side = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        for (int[] arr : array2Side
        ) {
            System.out.println(Arrays.toString(arr));
        }
        int [][] arr2Side = new int [3][4];
        for (int[] arr: arr2Side) {
            System.out.println(Arrays.toString(arr));
        }
        // duyệt theo ma trận
        for (int i = 0; i < array2Side.length; i++) {
            for (int j = 0; j < array2Side[i].length; j++) {
                System.out.printf("%2d ",array2Side[i][j]);
            }
            System.out.println();
        }
        // Bài toán nhập xuất dữ liệu mảng 2 chiều
        System.out.println("Nhập vào số hàng m =");
        int m = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào số cột n =");
        int n = new Scanner(System.in).nextInt();
        int [][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhập giá trị cho matrix[%d][%d]: ",i,j);
                matrix[i][j] = new Scanner(System.in).nextInt();
            }
        }
        System.out.println("Các giá trị vừa nhập là: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}