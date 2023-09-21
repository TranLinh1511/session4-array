package baiTh;

import java.util.Scanner;

public class Th6 {
    public static void main(String[] args) {
        int[] students = new int[10];
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            System.out.print("Nhập điểm tb sinh viên " + (i + 1) +" ");
            students[i] = new Scanner(System.in).nextInt();
        }
        for (int value : students) {
            if (value >= 5 && value <= 10) {
                count++;
            }
        }
        System.out.println("Số sinh viên đỗ là: " + count);
    }

}
