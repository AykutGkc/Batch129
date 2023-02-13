package ssg.stringBuiilder130223;

public class C04_indexOf {
    public static void main(String[] args) {

        String str1="Java cok güzeldir.";

        StringBuilder sb1=new StringBuilder("java cok güzeldir a");
        System.out.println(sb1.indexOf("a",2));

        sb1.replace(18,25,str1);
        System.out.println(sb1);


    }
}
