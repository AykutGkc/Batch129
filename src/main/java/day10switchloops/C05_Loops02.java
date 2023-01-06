package day10switchloops;

public class C05_Loops02 {
    public static void main(String[] args) {
        // EX1:21 den 180 e kadar hem 4 e hem de 6 ya bölünebilen tamsayilari ekrana yazdiran kodu yaziniz.

        for (int i =21 ; i<180 ; i++) {
            if(i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //EX2: Size verilen kücük harfle yazilmis String'in indexi cift sayi olan karakterlerini büyük harf yapiniz.
        //    ankara==> AnKaRa
        //Yazdiginiz kod belli senaryolar icin calisiyor, tüm sanaryolar icin calismiyorsa; bu koda "hard-code" denir.
        //"Hard code" yanlis yazilmis koddur. mutlaka düzeltilmelidir.
        //Note: Bir String de son index ==> lenght()-1 dir.
        String s = "ankara";


        for (int i =0 ;   i<s.length()   ; i++    ){
            String ch=s.substring(i, i+1);

            if (i%2==0){
                System.out.print(ch.toUpperCase());
            }
        }




    } //body of main
}//body of class
