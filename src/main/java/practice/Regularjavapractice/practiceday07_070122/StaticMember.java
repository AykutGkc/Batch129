package practice.Regularjavapractice.practiceday07_070122;

public class StaticMember { //Static üyeler
    //Ekran ciktisi nedir?

    static int x;
    int y;

    StaticMember(){
        x+=10;
        y++;
    }//Constuructor

    public static int karesiniAl(){
        return x*x;
    }


    public static void main(String[] args) {

        StaticMember sm1=new StaticMember();
        StaticMember sm2=new StaticMember();

        int z=sm1.karesiniAl();

        System.out.println("-x" +z+ " -y" + sm2.y); //-x400 -y1

    }//Main
}//class
