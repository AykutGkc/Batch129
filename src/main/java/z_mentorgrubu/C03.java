package z_mentorgrubu;

import java.util.Arrays;

public class C03 {
    public static void main(String[] args) {


        //Kullanicinin verdigi bir sayinin asal sayi olup olmadigini bulun
        // asal sayi : 1 ve kendisi disinda hicbir sayiya bölünmemeli

        int sayi = 103;
        boolean asalMi = true;

        for (int i = 2; i <= sayi - 1; i++) {

            if (sayi % i == 0) {
                asalMi = false;
                break;
            }

        }

        if (asalMi) {
            System.out.println("Asal sayi");
        } else {
            System.out.println("Asal sayi degil");
        }


    }


    }
