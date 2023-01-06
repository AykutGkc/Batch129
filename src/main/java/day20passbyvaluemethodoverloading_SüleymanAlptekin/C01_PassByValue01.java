package day20passbyvaluemethodoverloading_SüleymanAlptekin;

public class C01_PassByValue01 {
    public static void main(String[] args) {

        /*
        1)Java "Pass-by-valur" sayesinde variable'larin orjinal degerlerni koruma altina alir.

         */

        double shirt=100;

        double stdentShirtPrice=discount("student", shirt);

        double veteranShirtPrice=discount("veteran",shirt);

        double seniorShirtPrice=discount("senior",shirt);

        System.out.println(shirt);//100
        System.out.println(stdentShirtPrice);//90
        System.out.println(veteranShirtPrice);//80
        System.out.println(seniorShirtPrice);//95

        shirt=discount("veteran",shirt);
        System.out.println(shirt);//80


    }//main

    public static double discount(String state, double price){

        switch (state){
            case "student":
                price=price*0.90;
                break;
            case "veteran" :
                price=price*0.80;
                break;
            case "senior" :
                price=price*0.95;
                break;
            default:
                price=price;
        }
        return price;
    }

}//Class
