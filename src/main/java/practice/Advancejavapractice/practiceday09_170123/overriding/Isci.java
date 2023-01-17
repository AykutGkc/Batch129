package practice.Advancejavapractice.practiceday09_170123.overriding;

public class Isci extends Banka{

    @Override
    public double faizHesapla(double alinacakKredi) {
        return alinacakKredi*0.15;
    }
}
