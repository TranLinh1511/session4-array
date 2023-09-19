import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[6];

        System.out.println("Nhập 1 mảng với 6 kí tự!");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập số thứ %d: ",i+1);
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int  value: arr
             ) {
            if (value < min) {
                min = value;
            }
        }
        System.out.println("Số bé nhất là: "+ min);

    }
}
