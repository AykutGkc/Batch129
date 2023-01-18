package practice.Regularjavapractice.practiceday08;

public class Browser {
    public static void main(String[] args) {

        String adresCubugu="Her Browserda adres cubugu vardir";

        Edge edge=new Edge();
        edge.search();
        edge.sifreKaydetme();
        edge.get();

        Edge edge2=new Edge(adresCubugu);
        System.out.println(edge2.adresCubugu);


    }//main

    public void get (){
        System.out.println("Browserlar Web sayfasina gider...");
    }
    public void search (){
        System.out.println("Browserlar Web sayfasinda arastirma yapar...");
    }
    public void sifreKaydetme (){
        System.out.println("Browserlar istenildiginde sifreyi kaydederler...");
    }

}
