package practice.Regularjavapractice.practiceday09_210123;

public class C01_Exceptions {
    //VErilen iki stringin uzunluk acisindan birbirinin kac kati olgunu yaziniz.
    public static void main(String[] args) {

        double sonuc1=karakterSayisiniKarsilastir("tester","developer");
        System.out.println(sonuc1);
        double sonuc2=karakterSayisiniKarsilastir("tester","");
        System.out.println(sonuc1);
        double sonuc3=karakterSayisiniKarsilastir(null,"AykutG");

    }

    private static double karakterSayisiniKarsilastir(String str1, String str2) {
    double result=0;

        try {
            result=(double)str1.length()/(double)str2.length(); //Lenght methodu int döndügü icin küsüratli sonuc alamiyorum
        } catch (ArithmeticException e) {
            System.err.println("Payda sifir olamaz ==>>" + e.getMessage());
           // e.printStackTrace();
        }catch (NullPointerException e) {
            System.err.println("Lenght methodu null ile hata verir  ==>>" + e.getMessage());
            //e.printStackTrace();
        } finally {
            System.out.println("Database ile baglanti kesilsin...");
        }


        return result;
    }
}
