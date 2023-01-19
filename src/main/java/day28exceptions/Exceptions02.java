package day28exceptions;

public class Exceptions02 {
    public static void main(String[] args) {

        String s="1234";
        convertStringToint(s);

        String t="1a1b";
        convertStringToint(t);
    }

    //Icinde rakamlar disinda character olan bir Stringi sayiya cevirmek isterseniz java "NumberFormatException" atar
    public static void convertStringToint(String s){
        int intS=0;
        try{
            intS=Integer.valueOf(s);
        }catch(NumberFormatException e){
            System.out.println("Bir stringin sayiya dönüstürülebilmesi icin rakam disi karakter icermemesi gerekir");
            System.out.println(e.getMessage());
        }
        System.out.println(intS + 1);
    }

}
