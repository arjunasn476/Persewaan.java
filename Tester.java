package PERSEWAAN;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Mau Membuat Berapa Objek? ");
            int jumlah = in.nextInt();
            System.out.println("Jumlah: " + jumlah);
        } catch (Exception e) {
            System.out.println("Tipe Data Salah! ");
        }

        System.out.println("Pilih CD/DVD ");
        String pilihan = in.next();

        if (pilihan.equals("CD")); {
            CD c = new CD();
            c.print();
        } if (pilihan.equals("DVD")) {
           DVD c = new DVD();
           c.print();
        } else {
            System.out.println("Error!");
        }
    }
}
