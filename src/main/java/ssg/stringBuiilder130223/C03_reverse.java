package ssg.stringBuiilder130223;

public class C03_reverse {
    //verilen bir inoutun tersine cevirip döndüren methodu yaziniz.

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java cok güzeldir");
        sb.reverse();
        System.out.println(sb);
        String str="java cok güzeldir";
        tersCevir(str);





    }

    private static String tersCevir(String str) {

        StringBuilder sb1=new StringBuilder();
        sb1.reverse();
        System.out.println(sb1);
        return sb1.toString();
    }


}
