import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Nhập vị trí bạn muốn thêm: ");
        int index = sc.nextInt();
        System.out.println("Nhập phần tử bạn muốn thêm vào index " + index + " :");
        int newValue = sc.nextInt();
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = newValue;
                for (int j = i+1; j < newArr.length; j++) {
                    newArr[j] = arr[j-1];
                }
                break;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
