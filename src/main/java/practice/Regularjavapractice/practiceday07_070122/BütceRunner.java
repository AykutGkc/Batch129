package practice.Regularjavapractice.practiceday07_070122;

public class BütceRunner {
    public static void main(String[] args) {

       Bütce baba=new Bütce();

        System.out.println("Maas öncesi bütce: " + Bütce.bütce);
        
        baba.maasAl(3000);

        System.out.println("Maas sonrasi bütce: " + Bütce.bütce);

        baba.harclikAl(100);
        baba.harclikHarca(20);
        baba.butcedenHarca(500);
        System.out.println(baba.harclik);//80
        System.out.println(Bütce.bütce);//2400

        Bütce anne=new Bütce();

        anne.maasAl(5000);
        anne.harclikAl(500);
        anne.harclikHarca(450);
        System.out.println(Bütce.bütce);
        System.out.println(anne.harclik );

        Bütce oglan= new Bütce();
        oglan.harclikAl(100);
        oglan.harclikHarca(300);

     System.out.println(Bütce.bütce);
     System.out.println(oglan.harclik);




    }//main
}//class
