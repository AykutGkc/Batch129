package practice.Regularjavapractice.practiceday08_170123;

public class Edge extends Browser {

    String adresCubugu;

    public Edge() {
    }

    public Edge(String adresCubugu) {
        this.adresCubugu=adresCubugu;

         }

    @Override
    public void search (){
        System.out.println("Edge Web sayfasinda arastirma yapar...");
    }

    @Override
    public void sifreKaydetme (){
        System.out.println("Edge cookiesleri kabul edilenlerin istenildiginde sifreyi kaydederler...");
    }





}//Class
