package selfStudy;

public class C021_WhileLoop {
    public static void main(String[] args) {

        //Verilen bir string de her harfin sonrasina "*" sembolu ekleyiniz.
        // Java==> J*a*v*a

        String str= "Java";

        String newStr="";

        int i =0;

        while(i<str.length()){
            newStr+=str.charAt(i)+"*";
            i++;

        }
        System.out.println(newStr);





    }
}
