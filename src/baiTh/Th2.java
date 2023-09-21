package baiTh;

import java.util.Scanner;

public class Th2 {
    public static void main(String[] args) {
        String [] str= {"Tâm", "Khanh", "Thành", "Thắng", "Hoàng"};
        System.out.println("Nhập học sinh muốn tìm: ");
        String student = new Scanner(System.in).nextLine();
        Boolean exist = true;
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(student)) {
                System.out.printf("%s có trong danh sách sinh viên với vị trí là: %d",student,i+1);
                exist = false;
            }
        }
        if(exist) {
            System.out.print("Không có sinh viên trong danh sách!");
        }

    }
}
