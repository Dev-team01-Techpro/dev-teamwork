package loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*
        Do While
        Dongu baslamadan once bir kere calisir ve sonrasinda parantez içindeki değer doğru(true) olduğu sürece döngü dönmeye devam eder ve kod bloğu çalışır.

        Ornek Soru:
        Kullanicidan bir sayi girmesini isteyin
        Sayi sifira esit olana kadar dongunun tekrar calismasini saglayin
        */
        Scanner input = new Scanner(System.in);
        int n;

        do{
            System.out.println("Sayi giriniz");
            n = input.nextInt();
        }while (n > 0 || n < 0);
//      }while (n != 0);

        System.out.println("Sifiri buldunuz");
    }
}
