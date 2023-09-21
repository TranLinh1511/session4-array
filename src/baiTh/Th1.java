package baiTh;

import java.util.Arrays;
import java.util.Scanner;

public class Th1 {
    public static void main(String[] args) {
        int[] mangSoNguyen = {1, 2, 3, 4, 5};
        daoNguocMang(mangSoNguyen);
        System.out.println("Mảng sau khi đảo ngược: " + Arrays.toString(mangSoNguyen));
    }
    public static void daoNguocMang(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
