package practice.Advancejavapractice.practiceday11_240123;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class TextOkumsYazma {
    //Bir text dosyasındaki her satırın kelime sayısını o dosyada her satırın sonun yazdıran bir kod yazınız.

    public static void main(String[] args) throws Exception {

        FileReader fileReader =new FileReader("/Users/aykutgkc/Desktop/HelloWorld.txt");

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String satir=bufferedReader.readLine();
        String yeniDosya="";

        while (satir!=null){

        yeniDosya+=satir+"==>Satir kelime sayiisi: " +satir.split(" ").length + "\n";

            satir=bufferedReader.readLine();


        }

        System.out.println("yeniDosya = " + yeniDosya);


        FileWriter fileWriter = new FileWriter("/Users/aykutgkc/Desktop/Adsız.txt");
        fileWriter.write(yeniDosya);
        fileWriter.close();



    }


}
