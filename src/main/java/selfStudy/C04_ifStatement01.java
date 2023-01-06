package selfStudy;
import java.util.Scanner;
public class C04_ifStatement01 {

    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        int kartTuru,aktarma;
        double bakiye=0,ucret=0;


        System.out.print("Kart Türünü girin (1)-Tam  (2)-Öğrenci  (3)-Sosyal : ");
        kartTuru=oku.nextInt();

        System.out.print("Aktarma  (0)-İlk Biniş  (1)-1. Aktarma  (2)-2. Aktarma: ");
        aktarma=oku.nextInt();

        System.out.print("Bakiye: ");
        bakiye=oku.nextDouble();

        if(kartTuru==1){
            if(aktarma==0){
                ucret=7.67;
            }
            else if(aktarma==1){
                ucret=5.49;
            }
            else if(aktarma==2){
                ucret=4.17;
            }
            else{
                ucret=0;
                System.out.println("Hatalı Giriş");
            }
        }

        if(kartTuru==2){
            if(aktarma==0){
                ucret=3.74;
            }
            else if(aktarma==1){
                ucret=1.64;
            }
            else if(aktarma==2){
                ucret=1.54;
            }
            else{
                ucret=0;
                System.out.println("Hatalı Giriş");
            }
        }

        if(kartTuru==3){
            if(aktarma==0){
                ucret=5.49;
            }
            else if(aktarma==1){
                ucret=3.29;
            }
            else if(aktarma==2){
                ucret=2.52;
            }
            else{
                ucret=0;
                System.out.println("Hatalı Giriş");
            }
        }

        if(bakiye>=ucret){
            bakiye-=ucret;
            System.out.println("İyi yolculuklar. Kalan Bakiye: "+bakiye);
        }
        else{
            System.out.println("Yetersiz Bakiye.");
        }

    }

}

