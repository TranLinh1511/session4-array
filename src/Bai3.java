import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {6,7,8,9,10};
        int [] newArr = new int[arr1.length + arr2.length];
        for (int j = 0; j < arr1.length; j++) {
            newArr[j] = arr1[j];
        }
        int arr1Length =  arr1.length;
        for (int j = 0; j < arr2.length ; j++) {
            newArr[arr1Length] = arr2[j];
            arr1Length ++;
        }

        System.out.println(Arrays.toString(newArr));
    }
}
