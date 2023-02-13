package ssg.stringBuiilder130223;

public class C05_silme {
    public static void main(String[] args) {

        //String builder olusturun ve icinden karakterlrei siliniz.

        StringBuilder sb = new StringBuilder("java cok güzeldir");
        sb.delete(5,8);
        System.out.println(sb);
        sb.deleteCharAt(4);
        System.out.println(sb);


    }
}
