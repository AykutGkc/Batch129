package z_mentorgrubu;

import java.util.Arrays;
import java.util.Scanner;

public class C08_day14_291222 {
    public static void main(String[] args) {

        //)Bir ögretmenin okulunda ki ögrencilerin isimlerini applicationa yüklemesini saglayan kodu yaziniz.(C01_Arrays)

        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen Ögrenci sayisini giriniz.");
        int numOfStd=input.nextInt();

        String isimler[]= new String[numOfStd];

        System.out.println("Cikmak icin 'w' e basin ");




        for (int i = 1; i <=numOfStd ; i++) {
            System.out.println("Lütfen" + i + " . ögrenicinin ismini giriniz");
            String yeniIsim=input.next();


            if (yeniIsim.equalsIgnoreCase("w")){
                break;
            }
            isimler[i-1]=yeniIsim;
        }




        System.out.println(Arrays.toString(isimler));













    }//MAin
}//Class
