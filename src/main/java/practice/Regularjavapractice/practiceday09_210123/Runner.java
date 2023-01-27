package practice.Regularjavapractice.practiceday09_210123;

import static practice.Regularjavapractice.practiceday09_210123.MyExceptions.str;

public class Runner {
    public static void main(String[] args) {

        MyExceptions my=new MyExceptions(str);



        try {
            int x=100, y =5;


            float ortalama = (float) x/ (float) y;

            if (ortalama<50){
                throw new IllegalArgumentException("Ortalama cok düsük");

            }
        } catch (Exception e) {
            System.out.println("sorunun kaynagi ne ==> " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println(str);
        }




    }
}
