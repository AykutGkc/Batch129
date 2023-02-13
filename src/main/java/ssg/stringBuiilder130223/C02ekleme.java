package ssg.stringBuiilder130223;

public class C02ekleme {

    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder();

        sb.append("sehirler");
        System.out.println(sb);
        sb.append(" güzeldir");
        System.out.println(sb);
        sb.append("?");
        System.out.println(sb);
        sb.append(5);
        System.out.println(sb);
        sb.append(2.3);
        System.out.println(sb);
       // sb.append("hava cok güzeldir", 0, 4);
        // System.out.println(sb);
        sb.insert(12," hava");

    }
}
