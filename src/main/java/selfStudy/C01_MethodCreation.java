package selfStudy;

import java.util.Scanner;

public class C01_MethodCreation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Değişken Tanımlaması:
        double ilkdeger,ikincideger;
        String islem;
        System.out.println("İki Sayı ile Dört İşlem\n----------\n1- Toplama İşlemi (+)\n2- Çıkartma İşlemi (-)\n3- Çarpma İşlemi (*)\n4- Bölme İşlemi (/)\n----------");
        System.out.print("İşlem Yapılacak İlk Değer: ");
        ilkdeger=scanner.nextDouble();
        System.out.print("İşlem Yapılacak İkinci Değer: ");
        ikincideger=scanner.nextDouble();
        System.out.print("----------\nYapacağınız İşlem: ");
        islem=scanner.next();
        System.out.println("----------\nİşlem Sonucu: "+hesapmakinesi(ilkdeger,ikincideger,islem));
    }
    // Metot Tanımlaması:
    public static double hesapmakinesi(double a, double b,String karar){
        if(karar.equals("+")||karar.equals("1")){
            return a+b;
        }
        else if(karar.equals("-")||karar.equals("2")){
            return a-b;
        }
        else if(karar.equals("*")|| karar.equals("3")){
            return a*b;
        }
        else if(karar.equals("/")|| karar.equals("4")){
            return a/b;
        }
        else{
            return 0;
        }
    }
}
