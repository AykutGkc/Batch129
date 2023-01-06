package practice.Regularjavapractice.practiceday06_031223;

public class C06_MultiDimensionalArray {
    public static void main(String[] args) {

        //INTERWIEW SORUSU
        //Aşağıdaki multidimensional array'lerin iç array'lerinde aynı indexe sahip elamanların toplamını yazdıran bir program yazın.
        // int arr1[][] = {{1, 2}  , { 3, 4, 5},{6}};
        // int arr2[][] = {{7, 8,9}, {12}};


        int sinir = 0;
        int toplam = 0;
        int arr1[][] = {{1, 2, 25}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {12},{65},{45}};

        if (arr1.length <= arr2.length) {
            for (int i = 0; i < arr1.length; i++) { //Kisa olan kat alindi.
                sinir = arr1[i].length;
                if (arr1[i].length > arr2[i].length) {
                    sinir = arr2[i].length;
                }// buraya kadarSinirlari buldu

                for (int j = 0; j < sinir; j++) {
                    toplam = arr1[i][j] + arr2[i][j];
                    System.out.println("[" + i + "," + j + "]" + "indeksinde ki elemanlarin toplami : " + toplam);
                }


            }//For


        } else {
            for (int i = 0; i < arr2.length; i++) { //Kisa olan kat alindi.
                sinir = arr1[i].length;
                if (arr1[i].length > arr2[i].length) {
                    sinir = arr2[i].length;
                }// buraya kadarSinirlari buldu

                for (int j = 0; j < sinir; j++) {
                    toplam = arr1[i][j] + arr2[i][j];
                    System.out.println("[" + i + "," + j + "]" + "indeksinde ki elemanlarin toplami : " + toplam);
                }


            }//For

        }


    }//Main
}//Class
