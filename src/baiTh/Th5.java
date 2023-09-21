package baiTh;

public class Th5 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8};
        int min = minValue(arr);
        System.out.println(min);
    }
    public static int minValue(int [] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
