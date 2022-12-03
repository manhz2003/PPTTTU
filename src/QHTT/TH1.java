package QHTT;

import java.util.Scanner;

public class TH1 {
    public void j1_j6(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng biến X của hàm F(x): ");
        int fx = sc.nextInt();
        int[] Fx = new int[fx];
        for (int i = 0; i < fx; i++) {
            System.out.printf("Fx[%d] = ", i);
            Fx[i] = sc.nextInt();
        }

        System.out.print("Nhập số lượng biến X của hpt A(1) trong hàm A(x): ");
        int ax = sc.nextInt();
        int[]Ax = new int[ax];
        for (int i = 0; i < Ax.length; i++) {
            System.out.printf("A(1) nhập X[%d] = ", i);
            Ax[i] = sc.nextInt();
        }

        System.out.print("Nhập các giá trị biến X của hpt A(2) trong hàm A(x) \n");
        int[] Bx = new int[ax];
        for (int i = 0; i < Bx.length; i++) {
            System.out.printf("A(2) nhập X[%d] = ", i);
            Bx[i] = sc.nextInt();
        }

        System.out.print("Nhập các giá trị biến X của hpt A(3) trong hàm A(x) \n");
        int[] Cx = new int[ax];
        for (int i = 0; i < Cx.length; i++) {
            System.out.printf("A(3) nhập X[%d] = ", i);
            Cx[i] = sc.nextInt();
        }

        System.out.print("nhập cj1 = ");
        int Cj1 = sc.nextInt();
        System.out.print("nhập cj2 = ");
        int Cj2 = sc.nextInt();
        System.out.print("nhập cj3 = ");
        int Cj3 = sc.nextInt();

        System.out.print("nhập phương án = ");
        int phuongAn1 = sc.nextInt();
        System.out.print("nhập phương án = ");
        int phuongAn2 = sc.nextInt();
        System.out.print("nhập phương án = ");
        int phuongAn3 = sc.nextInt();

        int F0 = ((Cj1*phuongAn1)+(Cj2*phuongAn2)+(Cj3*phuongAn3));
        int denta1 = ((Cj1 * Ax[0]) + (Cj2 *Bx[0]) + (Cj3 *Cx[0]))- Fx[0];
        int denta2 = ((Cj1 * Ax[1]) + (Cj2 *Bx[1]) + (Cj3 *Cx[1]))- Fx[1];
        int denta3 = ((Cj1 * Ax[2]) + (Cj2 *Bx[2]) + (Cj3 *Cx[2]))- Fx[2];
        int denta4 = ((Cj1 * Ax[3]) + (Cj2 *Bx[3]) + (Cj3 *Cx[3]))- Fx[3];
        int denta5 = ((Cj1 * Ax[4]) + (Cj2 *Bx[4]) + (Cj3 *Cx[4]))- Fx[4];
        int denta6 = ((Cj1 * Ax[5]) + (Cj2 *Bx[5]) + (Cj3 *Cx[5]))- Fx[5];

        System.out.println("\nLẬP BẢNG ĐƠN HÌNH");
        System.out.println("+------------------------------------------------------+");
        System.out.println("| Cj | Cơ sở | Phương án | X1 | X2 | X3 | X4 | X5 | X6 |");
        System.out.println("+------------------------------------------------------+");
        System.out.printf("%s%25s%1s%3s%2s%3s%2s%3s%2s%3s%2s%3s%2s%3s","| ", "| ", Fx[0], "|", Fx[1], "|", Fx[2], "|", Fx[3],"|", Fx[4],"|", Fx[5], "|");
        System.out.print("\n|------------------------------------------------------|");
        System.out.printf("%s%2s%3s%2s%4s%2s%10s%2s%3s%2s%3s%2s%3s%2s%3s%2s%3s%2s%3s", "\n|", Cj1, "|", " CS1","|", phuongAn1, "|", Ax[0], "|", Ax[1], "|", Ax[2], "|", Ax[3], "|", Ax[4], "|", Ax[5], "|");
        System.out.print("\n|------------------------------------------------------|");
        System.out.printf("%s%2s%3s%2s%4s%2s%10s%2s%3s%2s%3s%2s%3s%2s%3s%2s%3s%2s%3s", "\n|", Cj2, "|", " CS2","|", phuongAn2, "|", Bx[0], "|", Bx[1], "|", Bx[2], "|", Bx[3], "|", Bx[4], "|", Bx[5], "|");
        System.out.print("\n|------------------------------------------------------|");
        System.out.printf("%s%2s%3s%2s%4s%2s%10s%2s%3s%2s%3s%2s%3s%2s%3s%2s%3s%2s%3s", "\n|", Cj3, "|", " CS3","|", phuongAn3, "|", Cx[0], "|", Cx[1], "|", Cx[2], "|", Cx[3], "|", Cx[4], "|", Cx[5], "|");
        System.out.print("\n|------------------------------------------------------|");
        System.out.printf("%s%2s%3s%2s%6s%2s%10s%2s%3s%2s%3s%2s%3s%2s%3s%2s%3s%2s%3s", "\n|", "", "|", "","|", F0, "|", denta1, "|", denta2, "|", denta3, "|", denta4, "|", denta5, "|", denta6, "|");
        System.out.print("\n+------------------------------------------------------+");
        System.out.println("\nKẾT LUẬN: VỚI MỌI J = 1...6 --> TA CÓ PHƯƠNG ÁN TỐI ƯU LÀ: ");
        System.out.println("X1 = "+denta1+","+" X2 = "+denta2+","+" X3 = "+denta3+","+" X4 = "+denta4+","+" X5 = "+denta5+","+" X6 = "+denta6+" và F0 = "+F0);
    }
}
