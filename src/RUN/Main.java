package RUN;

import QHTT.TH1;
import QHTT.TH2;
import QHTT.TH3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TH1 t1 = new TH1();
        TH2 t2 = new TH2();
        TH3 t3 = new TH3();
        int n;
        do {
            System.out.println("\nMENU CHƯƠNG TRÌNH GIẢI BÀI TOÁN QUY HOẠCH TUYẾN TÍNH");
            System.out.println("----------------------------------------------------");
            System.out.println("Chọn chức năng nhập J từ 1-6............. : [1]");
            System.out.println("Chọn chức năng nhập J từ 1-5............. : [2]");
            System.out.println("Chọn chức năng nhập J từ 1-4............. : [3]");
            System.out.println("Chọn phím 0 để thoát chương trình........ : [0]");
            System.out.print(">> Mời bạn chọn chức năng: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Bạn đã chọn trường hợp nhập J từ 1-6");
                    t1.j1_j6(); break;
                case 2:
                    System.out.println("Bạn đã chọn trường hợp nhập J từ 1-5");
                    t2.j1_15(); break;
                case 3:
                    System.out.println("Bạn đã chọn trường hợp nhập J từ 1-4");
                    t3.j1_j4(); break;
                case 0:
                    System.out.println("Bạn đã dừng chương trình....."); break;
                default:
                    System.out.println("Bạn đã chọn sai, xin mời nhập lại !");
            }
        }while (n!=0);
    }
}