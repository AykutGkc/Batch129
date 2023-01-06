package day08nestedIf;

public class C02_NestedIf {
    public static void main(String[] args) {
        /*
            Password'un ilk harfi buyuk harf ise
            'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin
            Passwordun ilk harfi kucuk harf ise
             'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin
            */
        String pwd = "zxy12!";
        char ilkHarf = pwd.charAt(0);

        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
            if (ilkHarf == 'A') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }
        } else if (ilkHarf >= 'a' && ilkHarf <= 'z') {
            if (ilkHarf == 'z') {
                System.out.println("Gecerli Password");
            } else {
                System.out.println("Gecersiz Password");
            }
        }else {
            System.out.println("Ilk karakter harf olmali");
        }


    }//Main body
}//Class body
