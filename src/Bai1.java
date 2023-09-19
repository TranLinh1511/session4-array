import java.util.Scanner;
import java.util.Arrays;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Bai 1
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.print("Phần tử muốn xóa là: ");
        int dlt = sc.nextInt();
        boolean exist = false;
        int[] newInt = new int[6];
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == dlt) {
                exist = true;
            }
        }
        if (exist) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != dlt) {
                    newInt[i] = arr[i];
                } else {
                    for (int j = i + 1; j < arr.length; j++) {
                        newInt[j - 1] = arr[j];
                    }
                    break;
                }
            }
            System.out.println(Arrays.toString(newInt));
        } else {
            System.out.println("Không có giá trị nào thỏa mãn");
        }
    }
}
