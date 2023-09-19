import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] arr = {"a","b","c","d","e"};
        int count = 0;
        System.out.print("Nhập kí tự cần tìm: ");
        String searchValue  = sc.nextLine();
        if(searchValue.length() != 1) {
            System.out.println("Vui lòng nhập 1 kí tự!!");
        } else {
            for (String s : arr) {
                if (s.equals(searchValue)) {
                    count++;
                }
            }
        }
        System.out.print("Số lần lặp của kí tự " +searchValue+ " là: "+count);
    }
}
