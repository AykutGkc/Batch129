package practice.Regularjavapractice.practiceday09_210123;

public class MyExceptions extends Exceptions {

    static final String str="Sen degerlisin";

    public MyExceptions(String str) {
        super(str);
        System.out.println("Oyun oynadi");
    }

    public MyExceptions() {
        super(str);
    }
}
