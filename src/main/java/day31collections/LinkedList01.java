package day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    /*
    1)Interfacelerden object olusturulamazlar cünkü interfacelerin constructor'i yoktur.
    2)Abstract classlardan obje olusturulamazlar, constructorlari vardir ama constructer obje olusturmada kullanilmazlar.
    3)Interfacelerin constructori olmadigindan collection olustururken interface isimleri new keywordunden sonra kullanilamaz.
    4)class-->class ==> extends
      class-->interface ==> implements
      interface-->interface ==> extends
      interface-->class ==> bu mümkün degildir.
    5)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar. O yuzden eleman silme ve ekleme islemleri coklukla
      yapilacaksa ArrayList kullanmak tavsiye edilmez.
    6)LinkList'ler index kulanmadiklarindan eleman silme ve eklemede re-index yapilmasina gerek yoktur. Bu da LinkList
      leri eleman ekleme ve silmede cok basarili hale getirir. Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken
      durumlarda LinkList kullanmak tavsiye edilir.
    7)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
    8)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
     bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.

     */
    public static void main(String[] args) {
        List<String> Citynames=new LinkedList<String>();

        LinkedList<String> names=new LinkedList<String>();

        names.add("Steve");
        names.add("Ajda");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");

        System.out.println(names);//[Steve, Ajda, Raj, Megan, Brandon]

        names.addFirst("Cüneyt");
        System.out.println(names);//[Cüneyt, Steve, Ajda, Raj, Megan, Brandon]

        names.addLast("Ajda"); //This method is equivalent to add.
        System.out.println(names);//[Cüneyt, Steve, Ajda, Raj, Megan, Brandon, Ajda]

        names.add(2,"Süleyman");
        System.out.println(names);//[Cüneyt, Steve, Süleyman, Ajda, Raj, Megan, Brandon, Ajda]

        names.remove("Ajda"); //Ilk  Ajda'yi siler.
        System.out.println(names);//[Cüneyt, Steve, Süleyman, Raj, Megan, Brandon, Ajda]

        names.remove(4);
        System.out.println(names);//[Cüneyt, Steve, Süleyman, Raj, Brandon, Ajda]

        names.add("Süleyman");
        names.add("Süleyman");
        System.out.println(names);//[Cüneyt, Steve, Süleyman, Raj, Brandon, Ajda, Süleyman]

        String r1=names.remove();//Retrieves and removes the head (first element) of this list(Cut-paste)
        System.out.println(r1);//Cüneyt
        System.out.println(names);//[Steve, Süleyman, Raj, Brandon, Ajda, Süleyman,Süleyman]

        names.removeFirstOccurrence("Süleyman");
        System.out.println(names);// [Steve, Raj, Brandon, Ajda, Süleyman,Süleyman]

        names.removeLastOccurrence("Süleyman");
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Süleyman]

        String r2=names.peek();//Retrieves, but does not remove, the head (first element) of this list. (Copy-paste)
                              //Returns: the head of this list, or null if this list is empty
        System.out.println(r2);//Steve
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Süleyman]

        //Retrieves and removes the head (first element) of this list. (cut_paste)
        //Returns:the head of this list, or null if this list is empty
        //remove() bos LinledList'te kullanilirsa hata verir, poll() bos LinledList'te kullanilirsa null verir.
        names.poll();

        //Pops an element from the stack represented by this list. In other words, removes and returns the first element of this list. (Cut_paste)
        //This method is equivalent to removeFirst().
        //Returns:the element at the front of this list (which is the top of the stack represented by this list)
        names.pop();
    }
}
