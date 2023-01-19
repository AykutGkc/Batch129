package day28exceptions;

public class Exceptions05 {
    public static void main(String[] args) {

        int a=16;
        int b=2;
        String s="My Java";

        getCharFromString(s,a,b);



    }//Main
    //try() kisminda birden fazla exception olusturma ihtimali olan code varsa coklu catch kullanabilirsiniz.
    //Coklu catch kullandiginizda Exception classlar arasinda "parent" "child" iliskisi yoksa catchlerin sirasi önemli degildir.
    //Ama code'daki siralamaya uymak tavsiye edilir.

    //Coklu catch kullandiginizda Exception classlar arasinda "parent" "child" iliskisi varsa catchlerin sirasi önemlidir.
    //Child olan class üstte olmalidir.

    //Exception classlar arasinda "parent" "child" iliskisi varsa ya child classi üste yazarak child ve parent classlar icin
    //özellestirilmis code'lar yazarsiniz.(Hirsiz icin 155, hasta icin 112..)
    //Veya childi hic kullanmaz sadece parent ile exception'lari Handle etmeye calisirsiniz.(Hirsiz icin 911, hasta icin 911...)
    public static void getCharFromString (String s, int a, int b){
        try{
        int idx=a/b;
        char ch=s.charAt(idx);
        System.out.println(ch);
    }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandiniz.");
        }
    }
}//Class
