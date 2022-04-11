package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih = scan.nextInt();

        switch(pilih) {
            case 1 :
                int sisi = scan.nextInt();
                System.out.println(persegi(sisi));
                break;

            case 2:
                int alas = scan.nextInt();
                int tinggi = scan.nextInt();
                System.out.println(segitiga(alas, tinggi));
                break;

            case 3:
                Double jari = scan.nextDouble();
                if (jari%7==0) {
                    System.out.println(lingkaran(jari));
                } else {
                    Double hasil = lingkaran2(jari);
                    int hasil1 = hasil.intValue();
                    Double hasil2 = (double) hasil1;
                    System.out.println(hasil2);
                }break;

            default:
                System.out.println("Input yang anda masukan tidak sesuai");
        }


    }

    static int persegi (int a) {
        return a * a;
    }

    static int segitiga (int alas, int tinggi) {
        return alas * tinggi / 2;
    }

    static Double lingkaran (Double b) {
        return 22/7 * b * b;
    }

    static Double lingkaran2 (Double c) {
        return 3.14 * c * c;
    }
}
