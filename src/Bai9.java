import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,5,6,2,3,5};
        int max = arr[0];
        int max2 = arr[0];
        for (int j : arr) {
            if (max < j) {
                max2 = max;
                max = j;
            }
        }
        System.out.println("Số lớn thứ 2 là: "+max2);
    }
}
