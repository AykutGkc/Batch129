package practice.Advancejavapractice.practiceday04_311222;

public class Q05_Varargs_KullaniciBilgileri {
    public static void main(String[] args) {

        //Ad, soyad, yaş ve bugüne dek yaşanılmış sehirler bilgilerini parametre olarak alıp yazdıran bir method oluşturunuz.

        bilgiler("ali","can",22, "Ankara","Konya","Erzurum", "Agri", "Diyarbakir", "Kayseri");
        System.out.println();
        bilgiler2("ali","can","22", "Ankara","Konya","Erzurum", "Agri", "Diyarbakir", "Kayseri");





    }//Main

    public static void bilgiler(String ad, String soyad, int yas, String...sehirler){
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("yas = " + yas);
        System.out.print("Yasanilmis sehirler:");
        for (String w:sehirler){
            System.out.print(w + ", ");
        }


    }

    public static void bilgiler2(String...bilgiler){

        for (int i=0 ; i<bilgiler.length ; i++){
            if (i==0){
                System.out.println("Ad : "+bilgiler[i]);
            }else if(i==1){
                System.out.println("Soyad : "+bilgiler[i]);
            }else if (i==2){
                System.out.println("Yas : "+bilgiler[i]);
                System.out.print("Yasanilan sehirler: ");
            }else{
                System.out.print(bilgiler[i]+ ", ");
            }
        }


    }


}//Class
