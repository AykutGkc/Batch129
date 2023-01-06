package z_mentorgrubu;

public class C05_25122022day11 {
    public static void main(String[] args) {

        //Ex: Verilen bir string'de son 'a'dan sonraki tüm kararkterleri ters sirada yazdirin.
        // Germany==>yn


        String str="Geaarmany";

        for (int i = str.length()-1; i>=0 ; i--) {
            if (str.charAt(i)=='a'){
                continue;
            }

            System.out.print(str.charAt(i));
        }




    }
}
