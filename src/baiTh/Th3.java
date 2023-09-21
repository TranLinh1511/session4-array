package baiTh;

public class Th3 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,3,2,5};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }
}
