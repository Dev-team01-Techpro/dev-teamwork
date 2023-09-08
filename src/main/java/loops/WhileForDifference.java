package loops;

import java.util.Scanner;

public class WhileForDifference {
    public static void main(String[] args) {
        /*
         While ve for Farki
         Sonucunu, kosulunu ve ne kadar donecegini bilmedigimiz dongulerde while dongusu tercih ediliyo.
        */
        Scanner input = new Scanner(System.in);
//        int sayi = 1;
        // i anlami  i == true
//      for(int     i =  0  ; i < 5 ; i++)
//        for(boolean i = true; i     ;    ){
//            System.out.println("Sayi giriniz : ");
//            sayi = input.nextInt();
//            if(sayi > 0){
//                i = false;
//            }
//        }
//        System.out.println("Pozitif sayi girdiniz");

//        System.out.println("Sayi giriniz : ");
//        sayi = input.nextInt();
//        if(sayi < 1){
//            System.out.println("sayi = " + sayi + " 1'den kucuk");
//
//         } else if (sayi == 1) {
//            System.out.println("sayi = " + sayi + " 1'e esit");
//        } else {
//            System.out.println("sayi = " + sayi + " 1'den Buyuk");
//        }
//        System.out.println("Sayi giriniz : ");
//        int sayi = input.nextInt();
//        int sayi = 0;
//        while (sayi < 1){
//            System.out.println("Sayi giriniz : ");
//            sayi = input.nextInt();
//        }
//        System.out.println("Pozitif sayi girdiniz");
        int sayi;
        do {
            System.out.println("Sayi giriniz : ");
            sayi = input.nextInt();
        }while(sayi < 1);
        System.out.println("Pozitif sayi girdiniz");

    }
}
