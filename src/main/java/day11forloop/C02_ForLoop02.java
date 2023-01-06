package day11forloop;

public class C02_ForLoop02 {
    public static void main(String[] args) {


        //Ex: Verilen bir string'de son 'a'dan sonraki tüm kararkterleri ters sirada yazdirin.
        // Germany==>yn

        String t="Germany";

        for (int i=t.length()-1; i>=0; i--){
            if (t.charAt(i)=='a'){
                break;
            }

            System.out.print(t.charAt(i));
        }



    }//Main Body
}//Class Body
