package day19listsvarargs;

public class C03_Varsrgs01 {

       /*

    Varargs'lar method olustururken "parametre" sayisinda bize esneklik saglar
    Method'un parantezleri icine yazilanlara "parametre" denir
    Method'u cagirirken kullanilan sayilara da "argument" denir.

    Note: Bir methodda 1den fazla Varargs Parametre kullanilamaz cünkü ikincisi "Unreachable code" olur.
    Note: Varargs, varargs disinda ki parametrelerle kullanilabilir ama Varargs her zaman son parametre olmalidir.  Ex: public static void add(String s, int...a){
        */




    public static void main(String[] args) {

    addTwoNumbers(3,5);

    addThreeNumber(3,5,7);

    add(4,5,6,7,8,9,11);


    }//Main


    //Iki sayiyi toplayan method olusturunuz.
    public static void addTwoNumbers(int a, int b){
        System.out.println(a+b);
    }//Method

    //Üc sayiyi toplayan method olusturunuz.

    public static void addThreeNumber(int a,int b, int c){
        System.out.println(a+b+c);
    }

    //Istediginiz sayida sayiyi toplamak  icin bir method olusturunuz.



    public static void add(int...a){
        int sum = 0;
        for (int w : a) {
            sum=sum+w;
        }
        System.out.println(sum);
    }








}
